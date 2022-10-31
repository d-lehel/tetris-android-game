package com.example.tetrisgame

class Level {
    companion object {
        // NON VARIABLES X coordinates - for drawing
        // first two level is hidden
        val X = arrayOf(
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f)
        )

        // NON VARIABLES Y coordinates - for drawing
        // first two level is hidden
        val Y = arrayOf(
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(80f, 80f, 80f, 80f, 80f, 80f, 80f, 80f, 80f, 80f),
            arrayOf(160f, 160f, 160f, 160f, 160f, 160f, 160f, 160f, 160f, 160f),
            arrayOf(240f, 240f, 240f, 240f, 240f, 240f, 240f, 240f, 240f, 240f),
            arrayOf(320f, 320f, 320f, 320f, 320f, 320f, 320f, 320f, 320f, 320f),
            arrayOf(400f, 400f, 400f, 400f, 400f, 400f, 400f, 400f, 400f, 400f),
            arrayOf(480f, 480f, 480f, 480f, 480f, 480f, 480f, 480f, 480f, 480f),
            arrayOf(560f, 560f, 560f, 560f, 560f, 560f, 560f, 560f, 560f, 560f),
            arrayOf(640f, 640f, 640f, 640f, 640f, 640f, 640f, 640f, 640f, 640f),
            arrayOf(720f, 720f, 720f, 720f, 720f, 720f, 720f, 720f, 720f, 720f),
            arrayOf(800f, 800f, 800f, 800f, 800f, 800f, 800f, 800f, 800f, 800f),
            arrayOf(880f, 880f, 880f, 880f, 880f, 880f, 880f, 880f, 880f, 880f),
            arrayOf(960f, 960f, 960f, 960f, 960f, 960f, 960f, 960f, 960f, 960f),
            arrayOf(1040f, 1040f, 1040f, 1040f, 1040f, 1040f, 1040f, 1040f, 1040f, 1040f),
            arrayOf(1120f, 1120f, 1120f, 1120f, 1120f, 1120f, 1120f, 1120f, 1120f, 1120f),
            arrayOf(1200f, 1200f, 1200f, 1200f, 1200f, 1200f, 1200f, 1200f, 1200f, 1200f),
            arrayOf(1280f, 1280f, 1280f, 1280f, 1280f, 1280f, 1280f, 1280f, 1280f, 1280f),
            arrayOf(1360f, 1360f, 1360f, 1360f, 1360f, 1360f, 1360f, 1360f, 1360f, 1360f),
            arrayOf(1440f, 1440f, 1440f, 1440f, 1440f, 1440f, 1440f, 1440f, 1440f, 1440f),
            arrayOf(1520f, 1520f, 1520f, 1520f, 1520f, 1520f, 1520f, 1520f, 1520f, 1520f)
        )

        // VARIABLE Z - if(value == 1111) draw outside the canvas, else inside
        // first two level is hidden
        var Z = mutableListOf(
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111),
            arrayOf(1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111, 1111)
        )

        // reset level
        fun reset() {
            for (i in 0..21) {
                for (j in 0..9) {
                    Z[i][j] = 1111
                }
            }
        }

        // if tetromino cant entered
        fun isGameOver(): Boolean {
            for (i in Tetromino.tetromino_Xpos) {
                if (i < 2) {
                    return true
                }
            }
            return false
        }

        fun checkRows() {
            for ((index, i) in Z.withIndex()) {
                if ((i[0] + i[1] + i[2] + i[3] + i[4] + i[5] + i[6] + i[7] + i[8] + i[9]) == 0) {
                    removeRow(index)
                    Tetromino.speed-=10
                }
            }
        }

        fun removeRow(index: Int) {
            // clean that row
            for (i in 0..9)
                Z[index][i] = 1111
            // correct remained rows
            for (i in index downTo 2)
                Z[i] = Z[i - 1].also { Z[i - 1] = Z[i] } // swap
        }

        fun insertNewPosition() {

            Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0]] = 0
            Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1]] = 0
            Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2]] = 0
            Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3]] = 0
        }

        fun removeOldPosition() {
            Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0]] = 1111
            Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1]] = 1111
            Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2]] = 1111
            Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3]] = 1111
        }
    }
}