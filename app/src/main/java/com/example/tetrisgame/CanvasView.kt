package com.example.tetrisgame

import android.view.View
import android.util.AttributeSet
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class CanvasView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val tetromino = Paint()
        tetromino.color = Color.GREEN
        val level = Paint()
        level.style = Paint.Style.STROKE
        level.strokeWidth = 1f
        level.color = Color.GRAY

        val best_text = Paint()
        best_text.color = Color.LTGRAY
        best_text.textSize = 100f
        canvas?.drawText(Level.best.toString(), 815f, 180f, best_text);

        val score_text = Paint()
        score_text.color = Color.LTGRAY
        score_text.textSize = 100f
        canvas?.drawText(Level.score.toString(), 815f, 390f, score_text);

        val level_text = Paint()
        level_text.color = Color.LTGRAY
        level_text.textSize = 100f
        canvas?.drawText(Level.level.toString(), 815f, 605f, level_text);

        // help -> left x, top y, right x+100, bottom y +100

        // draw level background
        canvas?.drawRect(1f, 1f, 797f, 1597f, level)

        // fill level with tetrimonos
        for (i in 2..21) {
            for (j in 0..9) {
                when (Level.Z[i][j]) {
                    0 -> tetromino.color = Color.TRANSPARENT
                    1 -> {
                        tetromino.color = Color.rgb(10,10,10)       // shadow
                    }
                    2 -> tetromino.color = Color.rgb(0,255,255)       // I
                    3 -> tetromino.color = Color.rgb(255,255,0)     // O
                    4 -> tetromino.color = Color.rgb(128,0,128)    // T
                    5 -> tetromino.color = Color.rgb(0,0,255)       // J
                    6 -> tetromino.color = Color.rgb(255,127,0)     // L
                    7 -> tetromino.color = Color.rgb(0,255,0)      // S
                    8 -> tetromino.color = Color.rgb(255,0,0)        // Z
                }
                tetromino.alpha = 1000 // reset default
                canvas?.drawRect(
                    Level.X[i][j] + 1,
                    Level.Y[i][j] + 1,
                    Level.X[i][j] + 76,
                    Level.Y[i][j] + 76,
                    tetromino
                )
            }
        }
        // draw next piece
        // todo much more elegant merge 3 function
        for (i in 0..3) {
            for (j in 0..2) {
                when (Level.next2Z[i][j]) {
                    0 -> tetromino.color = Color.TRANSPARENT
                    2 -> tetromino.color = Color.rgb(0,255,255)       // I
                    3 -> tetromino.color = Color.rgb(255,255,0)     // O
                    4 -> tetromino.color = Color.rgb(128,0,128)    // T
                    5 -> tetromino.color = Color.rgb(0,0,255)       // J
                    6 -> tetromino.color = Color.rgb(255,127,0)     // L
                    7 -> tetromino.color = Color.rgb(0,255,0)      // S
                    8 -> tetromino.color = Color.rgb(255,0,0)        // Z
                }
                tetromino.alpha = 1000 // reset default
                canvas?.drawRect(
                    Level.next2X[i][j] + 1,
                    Level.next2Y[i][j] + 1,
                    Level.next2X[i][j] + 48,
                    Level.next2Y[i][j] + 48,
                    tetromino
                )
            }
        }
        // draw next next piece
        for (i in 0..3) {
            for (j in 0..2) {
                when (Level.next3Z[i][j]) {
                    0 -> tetromino.color = Color.TRANSPARENT
                    2 -> tetromino.color = Color.rgb(0,255,255)       // I
                    3 -> tetromino.color = Color.rgb(255,255,0)     // O
                    4 -> tetromino.color = Color.rgb(128,0,128)    // T
                    5 -> tetromino.color = Color.rgb(0,0,255)       // J
                    6 -> tetromino.color = Color.rgb(255,127,0)     // L
                    7 -> tetromino.color = Color.rgb(0,255,0)      // S
                    8 -> tetromino.color = Color.rgb(255,0,0)        // Z
                }
                tetromino.alpha = 1000 // reset default
                canvas?.drawRect(
                    Level.next3X[i][j] + 1,
                    Level.next3Y[i][j] + 1,
                    Level.next3X[i][j] + 48,
                    Level.next3Y[i][j] + 48,
                    tetromino
                )
            }
        }
        for (i in 0..3) {
            for (j in 0..2) {
                when (Level.next4Z[i][j]) {
                    0 -> tetromino.color = Color.TRANSPARENT
                    2 -> tetromino.color = Color.rgb(0,255,255)       // I
                    3 -> tetromino.color = Color.rgb(255,255,0)     // O
                    4 -> tetromino.color = Color.rgb(128,0,128)    // T
                    5 -> tetromino.color = Color.rgb(0,0,255)       // J
                    6 -> tetromino.color = Color.rgb(255,127,0)     // L
                    7 -> tetromino.color = Color.rgb(0,255,0)      // S
                    8 -> tetromino.color = Color.rgb(255,0,0)        // Z
                }
                tetromino.alpha = 1000 // reset default
                canvas?.drawRect(
                    Level.next4X[i][j] + 1,
                    Level.next4Y[i][j] + 1,
                    Level.next4X[i][j] + 48,
                    Level.next4Y[i][j] + 48,
                    tetromino
                )
            }
        }
    }

    private fun setColor() {
        TODO("Not yet implemented")
    }
}