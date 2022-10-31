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
        tetromino.setColor(Color.GREEN)
        val level = Paint()
        level.setColor(Color.DKGRAY)

        // help -> left x, top y, right x+100, bottom y +100

        // draw level background
        canvas?.drawRect(0f, 0f, 800f, 1600f, level)

        // fill level with tetrimonos
        for (i in 2..21) {
            for (j in 0..9) {
                canvas?.drawRect(
                    Level.X[i][j] + Level.Z[i][j],
                    Level.Y[i][j],
                    Level.X[i][j] + Level.Z[i][j] + 75,
                    Level.Y[i][j] + 75,
                    tetromino
                )
            }
        }
    }
}