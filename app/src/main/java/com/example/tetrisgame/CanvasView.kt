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

        val best_text=Paint()
        best_text.setColor(Color.LTGRAY)
        best_text.setTextSize(100f)
        canvas?.drawText(Level.best.toString(), 815f, 180f, best_text);

        val score_text=Paint()
        score_text.setColor(Color.LTGRAY)
        score_text.setTextSize(100f)
        canvas?.drawText(Level.score.toString(), 815f, 390f, score_text);

        val level_text=Paint()
        level_text.setColor(Color.LTGRAY)
        level_text.setTextSize(100f)
        canvas?.drawText(Level.level.toString(), 815f, 605f, level_text);

        // help -> left x, top y, right x+100, bottom y +100

        // draw level background
        canvas?.drawRect(1f, 1f, 797f, 1597f, level)

        // fill level with tetrimonos
        for (i in 2..21) {
            for (j in 0..9) {
                if(Level.Z[i][j]==1){
                    tetromino.color = Color.LTGRAY
                    tetromino.alpha = 150;
                }
                canvas?.drawRect(
                    Level.X[i][j] + Level.Z[i][j]+1,
                    Level.Y[i][j]+1,
                    Level.X[i][j] + Level.Z[i][j] + 76,
                    Level.Y[i][j] + 76,
                    tetromino
                )
                tetromino.alpha = 1000
                tetromino.color = Color.GREEN
            }
        }
         // draw next piece
        // todo much more elegant merge 3 function
        tetromino.alpha = 150;
        for (i in 0..3) {
            for (j in 0..2) {
                canvas?.drawRect(
                    Level.next2X[i][j] + Level.next2Z[i][j]+1,
                    Level.next2Y[i][j]+1,
                    Level.next2X[i][j] + Level.next2Z[i][j] + 48,
                    Level.next2Y[i][j] + 48,
                    tetromino
                )
            }
        }
        // draw next next piece
        for (i in 0..3) {
            for (j in 0..2) {
                canvas?.drawRect(
                    Level.next3X[i][j] + Level.next3Z[i][j]+1,
                    Level.next3Y[i][j]+1,
                    Level.next3X[i][j] + Level.next3Z[i][j] + 48,
                    Level.next3Y[i][j] + 48,
                    tetromino
                )
            }
        }
        // draw next next next piece
        for (i in 0..3) {
            for (j in 0..2) {
                canvas?.drawRect(
                    Level.next4X[i][j] + Level.next4Z[i][j]+1,
                    Level.next4Y[i][j]+1,
                    Level.next4X[i][j] + Level.next4Z[i][j] + 48,
                    Level.next4Y[i][j] + 48,
                    tetromino
                )
            }
        }
    }
}