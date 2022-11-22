package com.example.tetrisgame

class MoveRight {
    companion object {
        fun moveRight() {

            // GHOST
            TetrominoGhost.searhContact()
            TetrominoGhost.setGhost()
            TetrominoGhost.removeGhost()
            TetrominoGhost.insertGhost()

            // todo if possible
            Tetromino.tetromino_Ypos[0] += 1
            Tetromino.tetromino_Ypos[1] += 1
            Tetromino.tetromino_Ypos[2] += 1
            Tetromino.tetromino_Ypos[3] += 1

            // remove old position
            Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] - 1] = 1111
            Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1] - 1] = 1111
            Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] - 1] = 1111
            Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] - 1] = 1111

            // insert new position
            Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0]] = 0
            Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1]] = 0
            Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2]] = 0
            Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3]] = 0
        }

        // if there obsticle (wall or piece) then cant move left
        fun isMovableRight(): Boolean {
            when (Tetromino.actualShape) {
                "I" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1  2 [3]
                            // .  .  .  .
                            // .  .  .  .
                            // .  .  .  .

                            if (Tetromino.tetromino_Ypos[3] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                            )
                                return false
                        }
                        2 -> {
                            // .  0  .  .
                            // .  1  .  .
                            // .  2  .  .
                            // .  3  .  .

                            if (Tetromino.tetromino_Ypos[3] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                            )
                                return false
                        }
                    }
                }
                "O" -> {
                    // .  0  1  .
                    // .  2 [3]  .
                    // .  .  .  .

                    if (Tetromino.tetromino_Ypos[3] + 1 > 9 ||
                        Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                    )
                        return false
                }
                "T" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1 [2]
                            // . [3] .
                            // .  .  .
                            if (Tetromino.tetromino_Ypos[2] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                            )
                                return false
                        }
                        2 -> {
                            // . [0]  .
                            // 3  1  .
                            // . [2]  .
                            if (Tetromino.tetromino_Ypos[2] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] == 0
                            )
                                return false
                        }
                        3 -> {
                            // . [3] .
                            // 2  1 [0]
                            // .  .  .
                            if (Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0
                            )
                                return false
                        }
                        4 -> {
                            // . [2] .
                            // .  1 [3]
                            // . [0] .
                            if (Tetromino.tetromino_Ypos[3] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0
                            )
                                return false
                        }
                    }
                }
                "J" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1 [2]
                            // .  . [3]
                            // .  .  .
                            if (Tetromino.tetromino_Ypos[2] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                            )
                                return false
                        }
                        2 -> {
                            // . [0]  .
                            // . [1]  .
                            // 3 [2]  .
                            if (Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1] + 1] == 0
                            )
                                return false
                        }
                        3 -> {
                            //[3] .  .
                            // 2  1 [0]
                            // .  .  .
                            if (Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0
                            )
                                return false
                        }
                        4 -> {
                            // 2 [3] .
                            //[1] .  .
                            //[0] .  .
                            if (Tetromino.tetromino_Ypos[3] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                            )
                                return false
                        }
                    }
                }
                "L" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0  1 [2]
                            //[3] .  .
                            // .  .  .
                            if (Tetromino.tetromino_Ypos[2] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                            )
                                return false
                        }
                        2 -> {
                            // 3 [0] .
                            // . [1] .
                            // . [2] .
                            if (Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1] + 1] == 0
                            )
                                return false
                        }
                        3 -> {
                            // .  . [3]
                            // 2  1 [0]
                            // .  .  .
                            if (Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0
                            )
                                return false
                        }
                        4 -> {
                            //[2] .  .
                            //[1] .  .
                            // 0 [3] .
                            if (Tetromino.tetromino_Ypos[3] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                            )
                                return false
                        }
                    }
                }
                "S" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // .  0 [1]
                            // 2 [3]  .
                            // .  .  .
                            if (Tetromino.tetromino_Ypos[1] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                            )
                                return false
                        }
                        2 -> {
                            //[2] .  .
                            // 3 [0] .
                            // . [1] .
                            if (Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[2]][Tetromino.tetromino_Ypos[2] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1] + 1] == 0
                            )
                                return false
                        }
                    }
                }
                "Z" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 0 [1] .
                            // .  2 [3]
                            // .  .  .
                            if (Tetromino.tetromino_Ypos[3] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0
                            )
                                return false
                        }
                        2 -> {
                            // . [0] .
                            // 2 [1] .
                            //[3] .  .
                            if (Tetromino.tetromino_Ypos[0] + 1 > 9 ||
                                Level.Z[Tetromino.tetromino_Xpos[0]][Tetromino.tetromino_Ypos[0] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[3]][Tetromino.tetromino_Ypos[3] + 1] == 0 ||
                                Level.Z[Tetromino.tetromino_Xpos[1]][Tetromino.tetromino_Ypos[1] + 1] == 0
                            )
                                return false
                        }
                    }
                }
            }
            return true
        }
    }
}