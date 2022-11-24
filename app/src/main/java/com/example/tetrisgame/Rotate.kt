package com.example.tetrisgame

class Rotate {
    companion object {
        fun doRotate() {
            when (Tetromino.actualShape) {
                "I" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  2  3          .  0  .  .
                            // .  .  .  .          .  1  .  .
                            // .  .  .  .    =>    .  2  .  .
                            // .  .  .  .          .  3  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Ypos[0] += 1
                            Tetromino.tetromino_Xpos[1] += 1
                            Tetromino.tetromino_Xpos[2] += 2
                            Tetromino.tetromino_Ypos[2] -= 1
                            Tetromino.tetromino_Xpos[3] += 3
                            Tetromino.tetromino_Ypos[3] -= 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {
                            // 0  1  2  3          .  0  .  .
                            // .  .  .  .          .  1  .  .
                            // .  .  .  .    <=    .  2  .  .
                            // .  .  .  .          .  3  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Ypos[0] -= 1
                            Tetromino.tetromino_Xpos[1] -= 1
                            Tetromino.tetromino_Xpos[2] -= 2
                            Tetromino.tetromino_Ypos[2] += 1
                            Tetromino.tetromino_Xpos[3] -= 3
                            Tetromino.tetromino_Ypos[3] += 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "O" -> {
                    // do nothing
                }
                "T" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  2          .  0  .
                            // .  3  .          3  1  .
                            // .  .  .    =>    .  2  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Ypos[0] += 1
                            Tetromino.tetromino_Xpos[1] += 1
                            Tetromino.tetromino_Xpos[2] += 2
                            Tetromino.tetromino_Ypos[2] -= 1
                            Tetromino.tetromino_Ypos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {
                            // .  0  .          .  3  .
                            // 3  1  .          2  1  0
                            // .  2  .    =>    .  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] += 1
                            Tetromino.tetromino_Ypos[0] += 1
                            Tetromino.tetromino_Xpos[2] -= 1
                            Tetromino.tetromino_Ypos[2] -= 1
                            Tetromino.tetromino_Xpos[3] -= 1
                            Tetromino.tetromino_Ypos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 3
                        }
                        3 -> {
                            // .  3  .          .  2  .
                            // 2  1  0          .  1  3
                            // .  .  .    =>    .  0  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] += 1
                            Tetromino.tetromino_Ypos[0] -= 1
                            Tetromino.tetromino_Xpos[2] -= 1
                            Tetromino.tetromino_Ypos[2] += 1
                            Tetromino.tetromino_Xpos[3] += 1
                            Tetromino.tetromino_Ypos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 4
                        }
                        4 -> {
                            // .  2  .          0  1  2
                            // .  1  3          .  3  .
                            // .  0  .    =>    .  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] -= 2
                            Tetromino.tetromino_Ypos[0] -= 1
                            Tetromino.tetromino_Xpos[1] -= 1
                            Tetromino.tetromino_Ypos[2] += 1
                            Tetromino.tetromino_Ypos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "J" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  2          .  0  .
                            // .  .  3          .  1  .
                            // .  .  .    =>    3  2  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Ypos[0] += 1
                            Tetromino.tetromino_Xpos[1] += 1
                            Tetromino.tetromino_Xpos[2] += 2
                            Tetromino.tetromino_Ypos[2] -= 1
                            Tetromino.tetromino_Xpos[3] += 1
                            Tetromino.tetromino_Ypos[3] -= 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {
                            // .  0  .          3  .  .
                            // .  1  .          2  1  0
                            // 3  2  .    =>    .  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] += 1
                            Tetromino.tetromino_Ypos[0] += 1
                            Tetromino.tetromino_Xpos[2] -= 1
                            Tetromino.tetromino_Ypos[2] -= 1
                            Tetromino.tetromino_Xpos[3] -= 2
                            Tetromino.tetromino_Ypos[3] += 0
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 3
                        }
                        3 -> {
                            // 3  .  .          2  3  .
                            // 2  1  0          1  .  .
                            // .  .  .    =>    0  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] += 1
                            Tetromino.tetromino_Ypos[0] -= 2
                            Tetromino.tetromino_Ypos[1] -= 1
                            Tetromino.tetromino_Xpos[2] -= 1
                            Tetromino.tetromino_Ypos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 4
                        }
                        4 -> {
                            // 2  3  .          0  1  2
                            // 1  .  .          .  .  3
                            // 0  .  .    =>    .  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] -= 2
                            Tetromino.tetromino_Xpos[1] -= 1
                            Tetromino.tetromino_Ypos[1] += 1
                            Tetromino.tetromino_Ypos[2] += 2
                            Tetromino.tetromino_Xpos[3] += 1
                            Tetromino.tetromino_Ypos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "L" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  2          3  0  .
                            // 3  .  .          .  1  .
                            // .  .  .    =>    .  2  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Ypos[0] += 1
                            Tetromino.tetromino_Xpos[1] += 1
                            Tetromino.tetromino_Xpos[2] += 2
                            Tetromino.tetromino_Ypos[2] -= 1
                            Tetromino.tetromino_Xpos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {
                            // 3  0  .          .  .  3
                            // .  1  .          2  1  0
                            // .  2  .    =>    .  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] += 1
                            Tetromino.tetromino_Ypos[0] += 1
                            Tetromino.tetromino_Xpos[2] -= 1
                            Tetromino.tetromino_Ypos[2] -= 1
                            Tetromino.tetromino_Ypos[3] += 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 3
                        }
                        3 -> {
                            // .  .  3          2  .  .
                            // 2  1  0          1  .  .
                            // .  .  .    =>    0  3  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] += 1
                            Tetromino.tetromino_Ypos[0] -= 2
                            Tetromino.tetromino_Ypos[1] -= 1
                            Tetromino.tetromino_Xpos[2] -= 1
                            Tetromino.tetromino_Xpos[3] += 2
                            Tetromino.tetromino_Ypos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 4
                        }
                        4 -> {
                            // 2  .  .          0  1  2
                            // 1  .  .          3  .  .
                            // 0  3  .    =>    .  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] -= 2
                            Tetromino.tetromino_Xpos[1] -= 1
                            Tetromino.tetromino_Ypos[1] += 1
                            Tetromino.tetromino_Ypos[2] += 2
                            Tetromino.tetromino_Xpos[3] -= 1
                            Tetromino.tetromino_Ypos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "S" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // .  0  1          2  .  .
                            // 2  3  .          3  0  .
                            // .  .  .    =>    .  1  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] += 1
                            Tetromino.tetromino_Xpos[1] += 2
                            Tetromino.tetromino_Ypos[1] -= 1
                            Tetromino.tetromino_Xpos[2] -= 1
                            Tetromino.tetromino_Ypos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {
                            // 2  .  .          .  0  1
                            // 3  0  .          2  3  .
                            // .  1  .    =>    .  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Xpos[0] -= 1
                            Tetromino.tetromino_Xpos[1] -= 2
                            Tetromino.tetromino_Ypos[1] += 1
                            Tetromino.tetromino_Xpos[2] += 1
                            Tetromino.tetromino_Ypos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "Z" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  .          .  0  .
                            // .  2  3          2  1  .
                            // .  .  .    =>    3  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Ypos[0] += 1
                            Tetromino.tetromino_Xpos[1] += 1
                            Tetromino.tetromino_Ypos[2] -= 1
                            Tetromino.tetromino_Xpos[3] += 1
                            Tetromino.tetromino_Ypos[3] -= 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {
                            // .  0  .          0  1  .
                            // 2  1  .          .  2  3
                            // 3  .  .    =>    .  .  .

                            Level.removeOldPosition()
                            Tetromino.tetromino_Ypos[0] -= 1
                            Tetromino.tetromino_Xpos[1] -= 1
                            Tetromino.tetromino_Ypos[2] += 1
                            Tetromino.tetromino_Xpos[3] -= 1
                            Tetromino.tetromino_Ypos[3] += 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
            }
            // GHOST
            // set ghost
            TetrominoGhost.setGhost()
        }

        ////////////////////////////////////////////////////////
        ////// ROTABLE CHECK ROTABLE CHECK ROTABLE CHECK //////
        //////////////////////////////////////////////////////

        fun isRotable(): Boolean {
            when (Tetromino.actualShape) {
                "I" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  2  3          .  -  .  .
                            // .  .  .  .          .  1  .  .
                            // .  .  .  .    =>    .  2  .  .
                            // .  .  .  .          .  3  .  . ground check

                            if (
                                Tetromino.tetromino_Xpos[1] + 1 > 21 ||
                                Tetromino.tetromino_Xpos[2] + 2 > 21 ||
                                Tetromino.tetromino_Xpos[3] + 3 > 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 2][Tetromino.tetromino_Ypos[2] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 3][Tetromino.tetromino_Ypos[3] - 2] > 1
                            )
                                return false
                        }
                        2 -> {
                            // .  0  .  .          0  -  2  3
                            // .  1  .  .          .  .  .  .
                            // .  2  .  .    =>    .  .  .  .
                            // .  3  .  .          .  .  .  . left and right wall check

                            if (
                                Tetromino.tetromino_Ypos[0] - 1 < 0 ||
                                Tetromino.tetromino_Ypos[2] + 1 > 9 ||
                                Tetromino.tetromino_Ypos[3] + 2 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] - 2][Tetromino.tetromino_Ypos[2] + 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] - 3][Tetromino.tetromino_Ypos[3] + 2] > 1
                            )
                                return false
                        }
                    }
                }
                "O" -> {
                    // do nothing, there is no rotation
                }
                "T" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  2          .  -  .
                            // .  3  .          3  -  .
                            // .  .  .    =>    .  2  . ground check

                            if (
                                Tetromino.tetromino_Xpos[2] + 2 > 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 2][Tetromino.tetromino_Ypos[2] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] - 1] > 1
                            )
                                return false

                        }
                        2 -> {
                            // .  0  .          .  -  .
                            // 3  1  .          -  -  0
                            // .  2  .    =>    .  .  . righ wall check
                            if (
                                Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0] + 1] > 1
                            ) return false
                        }
                        3 -> {
                            // .  3  .          .  -  .
                            // 2  1  0          .  -  -
                            // .  .  .    =>    .  0  . ground check

                            if (
                                Tetromino.tetromino_Xpos[0] + 1 > 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0] - 1] > 1

                            ) return false


                        }
                        4 -> {
                            // .  2  .          0  -  2
                            // .  1  3          .  -  .
                            // .  0  .    =>    .  .  . left wall check

                            if (
                                Tetromino.tetromino_Ypos[0] - 1 < 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] - 2][Tetromino.tetromino_Ypos[0] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] > 1
                            ) return false
                        }
                    }
                }
                "J" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  2          .  -  .
                            // .  .  3          .  1  .
                            // .  .  .    =>    3  2  . ground wall check

                            if (
                                Tetromino.tetromino_Xpos[3] + 1 > 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 2][Tetromino.tetromino_Ypos[2] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3] - 2] > 1
                            ) return false
                        }
                        2 -> {
                            // .  0  .          3  .  .
                            // .  1  .          2  -  0
                            // 3  2  .    =>    .  .  . // right wall check

                            if (
                                Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0] + 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] - 1][Tetromino.tetromino_Ypos[2] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] - 2][Tetromino.tetromino_Ypos[3] + 0] > 1
                            ) return false
                        }
                        3 -> {
                            // 3  .  .          -  3  .
                            // 2  1  0          -  .  .
                            // .  .  .    =>    0  .  . ground wall check

                            if (
                                Tetromino.tetromino_Xpos[0] + 1 > 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0] - 2] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] > 1
                            ) return false
                        }
                        4 -> {
                            // 2  3  .          -  -  2
                            // 1  .  .          .  .  3
                            // 0  .  .    =>    .  .  . right wall check

                            if (
                                Tetromino.tetromino_Ypos[2] + 2 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 2] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3] + 1] > 1
                            ) return false
                        }
                    }
                }
                "L" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  2          -  -  .
                            // 3  .  .          .  1  .
                            // .  .  .    =>    .  2  . ground wall check

                            if (
                                Tetromino.tetromino_Xpos[2] + 2 > 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 2][Tetromino.tetromino_Ypos[2] - 1] > 1
                            ) return false
                        }
                        2 -> {
                            // 3  0  .          .  .  3
                            // .  1  .          2  -  0
                            // .  2  .    =>    .  .  . right wall check

                            if (
                                Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0] + 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] - 1][Tetromino.tetromino_Ypos[2] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 2] > 1
                            ) return false
                        }
                        3 -> {
                            // .  .  3          2  .  .
                            // 2  1  0          -  .  .
                            // .  .  .    =>    0  3  . ground wall check

                            if (
                                Tetromino.tetromino_Xpos[0] + 1 > 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0] - 2] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] - 1][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 2][Tetromino.tetromino_Ypos[3] - 1] > 1
                            ) return false
                        }
                        4 -> {
                            // 2  .  .          -  1  2
                            // 1  .  .          -  .  .
                            // 0  3  .    =>    .  .  . right wall check

                            if (
                                Tetromino.tetromino_Ypos[2] + 2 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] - 1][Tetromino.tetromino_Ypos[1] + 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 2] > 1
                            ) return false
                        }
                    }
                }
                "S" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // .  0  1          2  .  .
                            // 2  3  .          -  -  .
                            // .  .  .    =>    .  1  . ground wall check

                            if (
                                Tetromino.tetromino_Xpos[1] + 2 > 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 2][Tetromino.tetromino_Ypos[1] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] - 1][Tetromino.tetromino_Ypos[2]] > 1
                            ) return false

                        }
                        2 -> {
                            // 2  .  .          .  0  1
                            // 3  0  .          -  -  .
                            // .  1  .    =>    .  .  . right wall check

                            if (
                                Tetromino.tetromino_Ypos[1] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] - 1][Tetromino.tetromino_Ypos[0]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] - 2][Tetromino.tetromino_Ypos[1] + 1] > 1
                            ) return false
                        }
                    }
                }
                "Z" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  .          .  -  .
                            // .  2  3          2  -  .
                            // .  .  .    =>    3  .  . ground wall check

                            if (
                                Tetromino.tetromino_Xpos[3] + 1 > 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3] - 2] > 1
                            ) return false
                        }
                        2 -> {
                            // .  0  .          0  -  .
                            // 2  1  .          .  -  3
                            // 3  .  .    =>    .  .  . right wall check

                            if (
                                Tetromino.tetromino_Ypos[3] + 2 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] - 1] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] - 1][Tetromino.tetromino_Ypos[3] + 2] > 1
                            ) return false
                        }
                    }
                }
            }
            return true
        }
    }
}