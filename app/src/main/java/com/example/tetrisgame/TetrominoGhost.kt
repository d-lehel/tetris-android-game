package com.example.tetrisgame

class TetrominoGhost {
    companion object {
        fun setGhost() {
            removeGhost()
            for (i in 1..20) {
                if (Falling.willLanding(i)) {
                    insertGhost(i - 1)
                    break
                }
            }
        }

        private fun removeGhost() {
            for (i in 0..21) {
                for (j in 0..9) {
                    if (Level.Z[i][j] == 1)
                        Level.Z[i][j] = 0
                }
            }
        }

        fun insertGhost(i: Int) {
            // if ghost is not out of bound X
            if (Tetromino.tetromino_Xpos[0] + i < 22 &&
                Tetromino.tetromino_Xpos[1] + i < 22 &&
                Tetromino.tetromino_Xpos[2] + i < 22 &&
                Tetromino.tetromino_Xpos[3] + i < 22
            ) if (
                Level.Z[Tetromino.tetromino_Xpos[0] + i][Tetromino.tetromino_Ypos[0]] < 2 &&
                Level.Z[Tetromino.tetromino_Xpos[0] + i][Tetromino.tetromino_Ypos[0]] < 2 &&
                Level.Z[Tetromino.tetromino_Xpos[0] + i][Tetromino.tetromino_Ypos[0]] < 2 &&
                Level.Z[Tetromino.tetromino_Xpos[0] + i][Tetromino.tetromino_Ypos[0]] < 2
            ) {
                Level.Z[Tetromino.tetromino_Xpos[0] + i][Tetromino.tetromino_Ypos[0]] = 1
                Level.Z[Tetromino.tetromino_Xpos[1] + i][Tetromino.tetromino_Ypos[1]] = 1
                Level.Z[Tetromino.tetromino_Xpos[2] + i][Tetromino.tetromino_Ypos[2]] = 1
                Level.Z[Tetromino.tetromino_Xpos[3] + i][Tetromino.tetromino_Ypos[3]] = 1
            }
        }
    }
}