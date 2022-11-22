package com.example.tetrisgame

class Tetromino {
    companion object {
        // tetromino body coordinates
        var tetromino_Xpos = arrayOf(0)
        var tetromino_Ypos = arrayOf(0)

        var actualShape = "";
        var nextShape = 0;
        var next2Shape = 0;
        var next3Shape = 0;
        var next4Shape = 0;
        var shapeDirection = 0;
        var speed: Long = 500;

        fun newPiece() {
            nextShape = next2Shape
            next2Shape = next3Shape
            next3Shape = next4Shape
            next4Shape = (1..7).random()

            clearNextPiece(next2Shape,Level.next2Z)
            insertNextPiece(next2Shape,Level.next2Z)

            clearNextPiece(next3Shape,Level.next3Z)
            insertNextPiece(next3Shape,Level.next3Z)

            clearNextPiece(next4Shape,Level.next4Z)
            insertNextPiece(next4Shape,Level.next4Z)

            // just for development
            // val random = 1 // I shape
            // val random = 2 // O shape
            // val random = 3 // T shape
            // val random = 4 // J shape
            // val random = 5 // L shape
            // val random = 6 // S shape
            // val random = 7 // Z shape

            when (nextShape) {
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

        private fun insertNextPiece(nextShape: Int, level: Array<Array<Float>>) {
            when (nextShape) {
                1 -> { // I
                    level[0][0] = 0f
                    level[1][0] = 0f
                    level[2][0] = 0f
                    level[3][0] = 0f
                }
                2 -> { // O
                    level[2][0] = 0f
                    level[3][0] = 0f
                    level[2][1] = 0f
                    level[3][1] = 0f
                }
                3 -> { // T
                    level[1][0] = 0f
                    level[2][0] = 0f
                    level[3][0] = 0f
                    level[2][1] = 0f
                }
                4 -> { // J
                    level[1][1] = 0f
                    level[2][1] = 0f
                    level[3][1] = 0f
                    level[3][0] = 0f
                }
                5 -> { // L
                    level[1][0] = 0f
                    level[2][0] = 0f
                    level[3][0] = 0f
                    level[3][1] = 0f
                }
                6 -> { // S
                    level[3][0] = 0f
                    level[3][1] = 0f
                    level[2][1] = 0f
                    level[2][2] = 0f
                }
                7 -> { // Z
                    level[3][1] = 0f
                    level[3][2] = 0f
                    level[2][0] = 0f
                    level[2][1] = 0f
                }
            }
        }
        private fun clearNextPiece(nextShape: Int, level: Array<Array<Float>>){
            for (i in 0..3) {
                for (j in 0..2) {
                    level[i][j] = 1111f
                }
            }
        }
    }
}
