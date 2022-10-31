package com.example.tetrisgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()

        ///////////////////////////////////////////////////////////////////////////////////////
        // touch controll

        open class OnSwipeTouchListener : View.OnTouchListener {

            private val gestureDetector = GestureDetector(GestureListener())

            fun onTouch(event: MotionEvent): Boolean {
                return gestureDetector.onTouchEvent(event)
            }

            private inner class GestureListener : GestureDetector.SimpleOnGestureListener() {

                private val SWIPE_THRESHOLD = 100
                private val SWIPE_VELOCITY_THRESHOLD = 100

                override fun onDown(e: MotionEvent): Boolean {
                    return true
                }

                override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
                    // rotate
                    if(Rotate.isRotable()) {
                        Rotate.doRotate()
                        canvas.invalidate()
                    }
                    onTouch(e)
                    return true
                }

                override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
                    val result = false
                    try {
                        val diffY = e2.y - e1.y
                        val diffX = e2.x - e1.x
                        if (Math.abs(diffX) > Math.abs(diffY)) {
                            if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                                if (diffX > 0) {
                                    onSwipeRight()
                                } else {
                                    onSwipeLeft()
                                }
                            }
                        } else {
                            // this is either a bottom or top swipe.
                            if (Math.abs(diffY) > SWIPE_THRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
                                if (diffY > 0) {
                                    onSwipeTop()
                                } else {
                                    onSwipeBottom()
                                }
                                true
                            }
                        }
                    } catch (exception: Exception) {
                        exception.printStackTrace()
                    }
                    return result
                }
            }

            override fun onTouch(v: View, event: MotionEvent): Boolean {
                return gestureDetector.onTouchEvent(event)
            }

            open fun onSwipeRight() {}
            open fun onSwipeLeft() {}
            open fun onSwipeTop() {}
            open fun onSwipeBottom() {}
        }

        canvas.setOnTouchListener(object : OnSwipeTouchListener() {
            override fun onSwipeLeft() {
               // left move
                if (MoveLeft.isMovableLeft()) {
                    MoveLeft.moveLeft()
                    canvas.invalidate()
                }
            }

            override fun onSwipeRight() {
                // right move
                if (MoveRight.isMovableRight()) {
                    MoveRight.moveRight()
                    canvas.invalidate()
                }
            }

            override fun onSwipeTop() {
                // fast down
                for(i in 0..19) {
                    if (!Falling.willLanding()) {
                        Falling.fallingStep()
                    }
                    else{
                        break
                    }
                }
            }
        })
////////////////////////////////////////////////////////////////////////////////////////

        CoroutineScope(Dispatchers.IO).launch {
            while (true) {
                Tetromino.newPiece()
                Level.insertNewPosition()
                while (Tetromino.active) {
                    if (Falling.willLanding()) {
                        // check is need to clear rows
                        Level.checkRows()
                        // if landed piece cant entered
                        if (Level.isGameOver())
                            Level.reset()
                        Tetromino.newPiece()
                        Level.insertNewPosition()
                    } else {
                        Falling.fallingStep()
                    }
                    //game speed in millisecond
                    delay(Tetromino.speed)
                    canvas.invalidate()
                }
            }
        }
        button_rotate.setOnClickListener {
            if(Rotate.isRotable()) {
                Rotate.doRotate()
                canvas.invalidate()
            }
        }

        button_left.setOnClickListener {
            if (MoveLeft.isMovableLeft()) {
                MoveLeft.moveLeft()
                canvas.invalidate()
            }
        }
        button_right.setOnClickListener {
            if (MoveRight.isMovableRight()) {
                MoveRight.moveRight()
                canvas.invalidate()
            }
        }
        button_fast_down.setOnClickListener {
            for(i in 0..19) {
                if (!Falling.willLanding()) {
                    Falling.fallingStep()
                }
                else{
                    break
                }
            }
        }
    }
}