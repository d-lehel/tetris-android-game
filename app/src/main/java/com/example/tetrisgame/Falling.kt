package com.example.tetrisgame

class Falling {
    companion object {

        fun fallingStep() {
            Tetromino.tetromino_Xpos[0] += 1
            Tetromino.tetromino_Xpos[1] += 1
            Tetromino.tetromino_Xpos[2] += 1
            Tetromino.tetromino_Xpos[3] += 1

            // remove old position
            Level.Z[Tetromino.tetromino_Xpos[0] - 1][Tetromino.tetromino_Ypos[0]] = 1111
            Level.Z[Tetromino.tetromino_Xpos[1] - 1][Tetromino.tetromino_Ypos[1]] = 1111
            Level.Z[Tetromino.tetromino_Xpos[2] - 1][Tetromino.tetromino_Ypos[2]] = 1111
            Level.Z[Tetromino.tetromino_Xpos[3] - 1][Tetromino.tetromino_Ypos[3]] = 1111

            // insert new position
            Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0]] = 0
            Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1]] = 0
            Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2]] = 0
            Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3]] = 0
        }

        fun willLanding(): Boolean {
            // todo - check if game ended

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
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
                            )
                                return true
                        }

                        2 -> {
                            // .  0  .  .
                            // .  1  .  .
                            // .  2  .  .
                            // .  3  .  .

                            if (Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
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
                        Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                        Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
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
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
                            )
                                return true
                        }
                        2 -> {
                            // .  0  .
                            //[3] 1  .
                            // . [2]  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
                            )
                                return true
                        }
                        3 -> {
                            // .  3  .
                            //[2][1][0]
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0
                            )
                                return true
                        }
                        4 -> {
                            // .  2  .
                            // .  1 [3]
                            // . [0] .
                            if (Tetromino.tetromino_Xpos[0] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0
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
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
                            )
                                return true
                        }
                        2 -> {
                            // .  0  .
                            // .  1  .
                            //[3][2]  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
                            )
                                return true
                        }
                        3 -> {
                            // 3  .  .
                            //[2][1][0]
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0
                            )
                                return true
                        }
                        4 -> {
                            // 2 [3] .
                            // 1  .  .
                            //[0] .  .
                            if (Tetromino.tetromino_Xpos[0] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0
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
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
                            )
                                return true
                        }
                        2 -> {
                            //[3] 0  .
                            // .  1  .
                            // . [2]  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
                            )
                                return true
                        }
                        3 -> {
                            // .  .  3
                            //[2][1][0]
                            // .  .  .
                            if (Tetromino.tetromino_Xpos[2] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0
                            )
                                return true
                        }
                        4 -> {
                            // 2  .  .
                            // 1  .  .
                            //[0][3] .
                            if (Tetromino.tetromino_Xpos[0] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0
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
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
                            )
                                return true
                        }
                        2 -> {
                            // 2  .  .
                            //[3] 0  .
                            // . [1]  .
                            if (Tetromino.tetromino_Xpos[1] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
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
                                Level.Z[Tetromino.tetromino_Xpos[2] + 1][Tetromino.tetromino_Ypos[2]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0] + 1][Tetromino.tetromino_Ypos[0]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
                            )
                                return true
                        }
                        2 -> {
                            // .  0  .
                            // 2 [1] .
                            //[3] .  .
                            if (Tetromino.tetromino_Xpos[3] == 21 ||
                                Level.Z[Tetromino.tetromino_Xpos[1] + 1][Tetromino.tetromino_Ypos[1]] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3] + 1][Tetromino.tetromino_Ypos[3]] == 0
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