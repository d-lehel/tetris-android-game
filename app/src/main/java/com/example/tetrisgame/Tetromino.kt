package com.example.tetrisgame

class Tetromino {
    companion object {
        // tetromino body coordinates
        var tetromino_Xpos = arrayOf(0)
        var tetromino_Ypos = arrayOf(0)

        var actualShape = "";
        var shapeDirection = 0;
        var active = true;
        var speed: Long = 500;

        fun newPiece() {
            val random = (1..7).random()

            // just for development
            // val random = 1 // I shape
            // val random = 2 // O shape
            // val random = 3 // T shape
            // val random = 4 // J shape
            // val random = 5 // L shape
            // val random = 6 // S shape
            // val random = 7 // Z shape

            when (random) {
                1 -> {
                    actualShape = "I"
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 0, 0)
                    tetromino_Ypos = arrayOf(3, 4, 5, 6)

                    //  .  .  .  0  1  2  3  .  .  .
                    //  .  .  .  .  .  .  .  .  .  .
                }
                2 -> {
                    actualShape = "O"
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 1, 1)
                    tetromino_Ypos = arrayOf(4, 5, 4, 5)

                    //  .  .  .  .  0  1  .  .  .  .
                    //  .  .  .  .  2  3  .  .  .  .
                }
                3 -> {
                    actualShape = "T"
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 0, 1)
                    tetromino_Ypos = arrayOf(3, 4, 5, 4)

                    //  .  .  .  0  1  2  .  .  .  .
                    //  .  .  .  .  3  .  .  .  .  .
                }
                4 -> {
                    actualShape = "J"
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 0, 1)
                    tetromino_Ypos = arrayOf(3, 4, 5, 5)

                    //  .  .  .  0  1  2  .  .  .  .
                    //  .  .  .  .  .  3  .  .  .  .
                }
                5 -> {
                    actualShape = "L"
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 0, 1)
                    tetromino_Ypos = arrayOf(3, 4, 5, 3)

                    //  .  .  .  0  1  2  .  .  .  .
                    //  .  .  .  3  .  .  .  .  .  .
                }
                6 -> {
                    actualShape = "S"
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 1, 1)
                    tetromino_Ypos = arrayOf(4, 5, 3, 4)

                    //  .  .  .  .  0  1  .  .  .  .
                    //  .  .  .  2  3  .  .  .  .  .
                }
                7 -> {
                    actualShape = "Z"
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 1, 1)
                    tetromino_Ypos = arrayOf(3, 4, 4, 5)

                    //  .  .  .  0  1  .  .  .  .  .
                    //  .  .  .  .  2  3  .  .  .  .
                }
            }
        }
    }
}
