package com.example.tetrisgame

class TetrominoGhost {
    companion object {
        var indexXPush = 5;
        var ghost_Xpos = arrayOf(0, 0, 0, 0)
        var ghost_Ypos = arrayOf(0, 0, 0, 0)

        fun setGhost() {
            // X positions need to push down
            var ghost_Xpos = arrayOf(
                Tetromino.tetromino_Xpos[0] + indexXPush,
                Tetromino.tetromino_Xpos[1] + indexXPush,
                Tetromino.tetromino_Xpos[2] + indexXPush,
                Tetromino.tetromino_Xpos[3] + indexXPush
            )
            // Y is allways default
            var ghost_Ypos = Tetromino.tetromino_Ypos
        }

        // into level
        fun insertGhost(){
            Level.Z[ghost_Xpos[0]][ghost_Ypos[0]] = 1
            Level.Z[ghost_Xpos[1]][ghost_Ypos[1]] = 1
            Level.Z[ghost_Xpos[2]][ghost_Ypos[2]] = 1
            Level.Z[ghost_Xpos[3]][ghost_Ypos[3]] = 1
        }

        // from level
        fun removeGhost() {
            Level.Z[ghost_Xpos[0]][ghost_Ypos[0]] = 1111
            Level.Z[ghost_Xpos[1]][ghost_Ypos[1]] = 1111
            Level.Z[ghost_Xpos[2]][ghost_Ypos[2]] = 1111
            Level.Z[ghost_Xpos[3]][ghost_Ypos[3]] = 1111
        }

        fun searhContact() {
            // if one contact exist
            // for loop search down
        }
    }
}