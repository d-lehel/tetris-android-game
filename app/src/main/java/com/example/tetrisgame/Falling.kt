package com.example.tetrisgame

class Falling {
    companion object {
        fun fallingStep() {

            Tetromino.tetromino_Xpos[0] += 1
            Tetromino.tetromino_Xpos[1] += 1
            Tetromino.tetromino_Xpos[2] += 1
            Tetromino.tetromino_Xpos[3] += 1

            // remove old position
            Level.Z[Tetromino.tetromino_Xpos[0] - 1][Tetromino.tetromino_Ypos[0]] = 0
            Level.Z[Tetromino.tetromino_Xpos[1] - 1][Tetromino.tetromino_Ypos[1]] = 0
            Level.Z[Tetromino.tetromino_Xpos[2] - 1][Tetromino.tetromino_Ypos[2]] = 0
            Level.Z[Tetromino.tetromino_Xpos[3] - 1][Tetromino.tetromino_Ypos[3]] = 0

            // insert new position
            Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0]] = Tetromino.colorCode
            Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1]] = Tetromino.colorCode
            Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2]] = Tetromino.colorCode
            Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3]] = Tetromino.colorCode

            TetrominoGhost.setGhost()
        }

        fun willLanding(iX: Int): Boolean {
            // for ghost check
            if (Tetromino.tetromino_Xpos[0] + iX > 21 ||
                Tetromino.tetromino_Xpos[1] + iX > 21 ||
                Tetromino.tetromino_Xpos[2] + iX > 21 ||
                Tetromino.tetromino_Xpos[3] + iX > 21
            )
                return true

            when (Tetromino.actualShape) {
                "I" -> {
                    when (Tetromino.shapeDirection) {

                        1 -> {
                            // 0  1  2  3
                            // .  .  .  .
                            // .  .  .  .
                            // .  .  .  .

                            if (Tetromino.tetromino_Xpos[0] == 21 || Tetromino.tetromino_Xpos[1] == 21 ||
                                Tetromino.tetromino_Xpos[2] == 21 || Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + iX][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }

                        2 -> {
                            // .  0  .  .
                            // .  1  .  .
                            // .  2  .  .
                            // .  3  .  .

                            if (Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                    }
                }
                "O" -> {
                    // .  0  1  .
                    // . [2][3]  .

                    if (
                        Tetromino.tetromino_Xpos[2] == 21 || Tetromino.tetromino_Xpos[3] == 21 ||
                        Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                        Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                    )
                        return true
                }
                "T" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //[0] 1 [2]
                            // . [3] .
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            // .  0  .
                            //[3] 1  .
                            // . [2]  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                        3 -> {
                            // .  3  .
                            //[2][1][0]
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + iX][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1
                            )
                                return true
                        }
                        4 -> {
                            // .  2  .
                            // .  1 [3]
                            // . [0] .
                            if (Tetromino.tetromino_Xpos[0] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1
                            )
                                return true
                        }
                    }
                }
                "J" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //[0][1] 2
                            // .  . [3]
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + iX][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            // .  0  .
                            // .  1  .
                            //[3][2]  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                        3 -> {
                            // 3  .  .
                            //[2][1][0]
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + iX][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1
                            )
                                return true
                        }
                        4 -> {
                            // 2 [3] .
                            // 1  .  .
                            //[0] .  .
                            if (Tetromino.tetromino_Xpos[0] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1
                            )
                                return true
                        }
                    }
                }
                "L" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0 [1][2]
                            //[3] .  .
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + iX][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            //[3] 0  .
                            // .  1  .
                            // . [2]  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                        3 -> {
                            // .  .  3
                            //[2][1][0]
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + iX][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1
                            )
                                return true
                        }
                        4 -> {
                            // 2  .  .
                            // 1  .  .
                            //[0][3] .
                            if (Tetromino.tetromino_Xpos[0] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1
                            )
                                return true
                        }
                    }
                }
                "S" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // .  0 [1]
                            //[2][3] .
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + iX][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            // 2  .  .
                            //[3] 0  .
                            // . [1]  .
                            if (Tetromino.tetromino_Xpos[1] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + iX][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                    }
                }
                "Z" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //[0] 1  .
                            // . [2][3]
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + iX][Tetromino.tetromino_Ypos[2]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + iX][Tetromino.tetromino_Ypos[0]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            // .  0  .
                            // 2 [1] .
                            //[3] .  .
                            if (Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + iX][Tetromino.tetromino_Ypos[1]] > 1 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + iX][Tetromino.tetromino_Ypos[3]] > 1
                            )
                                return true
                        }
                    }
                }
            }
            return false
        }
    }
}