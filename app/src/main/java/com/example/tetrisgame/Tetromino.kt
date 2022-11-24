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
        var colorCode: Int = 0

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
                    colorCode = 2
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 0, 0)
                    tetromino_Ypos = arrayOf(3, 4, 5, 6)

                    //  .  .  .  0  1  2  3  .  .  .
                    //  .  .  .  .  .  .  .  .  .  .
                }
                2 -> {
                    actualShape = "O"
                    colorCode = 3
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 1, 1)
                    tetromino_Ypos = arrayOf(4, 5, 4, 5)

                    //  .  .  .  .  0  1  .  .  .  .
                    //  .  .  .  .  2  3  .  .  .  .
                }
                3 -> {
                    actualShape = "T"
                    colorCode = 4
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 0, 1)
                    tetromino_Ypos = arrayOf(3, 4, 5, 4)

                    //  .  .  .  0  1  2  .  .  .  .
                    //  .  .  .  .  3  .  .  .  .  .
                }
                4 -> {
                    actualShape = "J"
                    colorCode = 5
                    shapeDirection = 1
                    tetromino_Xpos = arrayOf(0, 0, 0, 1)
                    tetromino_Ypos = arrayOf(3, 4, 5, 5)

                    //  .  .  .  0  1  2  .  .  .  .
                    //  .  .  .  .  .  3  .  .  .  .
                }
                5 -> {
                    actualShape = "L"
                    shapeDirection = 1
                    colorCode = 6
                    tetromino_Xpos = arrayOf(0, 0, 0, 1)
                    tetromino_Ypos = arrayOf(3, 4, 5, 3)

                    //  .  .  .  0  1  2  .  .  .  .
                    //  .  .  .  3  .  .  .  .  .  .
                }
                6 -> {
                    actualShape = "S"
                    shapeDirection = 1
                    colorCode = 7
                    tetromino_Xpos = arrayOf(0, 0, 1, 1)
                    tetromino_Ypos = arrayOf(4, 5, 3, 4)

                    //  .  .  .  .  0  1  .  .  .  .
                    //  .  .  .  2  3  .  .  .  .  .
                }
                7 -> {
                    actualShape = "Z"
                    shapeDirection = 1
                    colorCode = 8
                    tetromino_Xpos = arrayOf(0, 0, 1, 1)
                    tetromino_Ypos = arrayOf(3, 4, 4, 5)

                    //  .  .  .  0  1  .  .  .  .  .
                    //  .  .  .  .  2  3  .  .  .  .
                }
            }
        }

        private fun insertNextPiece(nextShape: Int, level: Array<Array<Int>>) {
            when (nextShape) {
                1 -> { // I
                    level[0][0] = 2
                    level[1][0] = 2
                    level[2][0] = 2
                    level[3][0] = 2
                }
                2 -> { // O
                    level[2][0] = 3
                    level[3][0] = 3
                    level[2][1] = 3
                    level[3][1] = 3
                }
                3 -> { // T
                    level[1][0] = 4
                    level[2][0] = 4
                    level[3][0] = 4
                    level[2][1] = 4
                }
                4 -> { // J
                    level[1][1] = 5
                    level[2][1] = 5
                    level[3][1] = 5
                    level[3][0] = 5
                }
                5 -> { // L
                    level[1][0] = 6
                    level[2][0] = 6
                    level[3][0] = 6
                    level[3][1] = 6
                }
                6 -> { // S
                    level[3][0] = 7
                    level[3][1] = 7
                    level[2][1] = 7
                    level[2][2] = 7
                }
                7 -> { // Z
                    level[3][1] = 8
                    level[3][2] = 8
                    level[2][0] = 8
                    level[2][1] = 8
                }
            }
        }
        private fun clearNextPiece(nextShape: Int, level: Array<Array<Int>>){
            for (i in 0..3) {
                for (j in 0..2) {
                    level[i][j] = 0
                }
            }
        }
    }
}
