public class Hit_Move_forking extends Game {
    ////////////////////////////////////////////////////////
    public static boolean moveforR(int row1, int row2, int col1, int col2) {
        if (b.board[row1][col1].mohre == 'R' &&
                b.board[row2][col2].mohre == '.' &&
                row1 - row2 == 1 && col1 - col2 == -1) {
            b.board[row1][col1].mohre = '.';
            b.board[row2][col2].mohre = 'R';
            draw.tableOfGame(b.board);
            return true;
        }//be samt bala-rast harekat mikone

        else if (b.board[row1][col1].mohre == 'R' &&
                b.board[row2][col2].mohre == '.' &&
                row1 - row2 == 1 && col1 - col2 == 1) {
            b.board[row1][col1].mohre = '.';
            b.board[row2][col2].mohre = 'R';
            draw.tableOfGame(b.board);
            return true;
        }//be samt bala-chap harekat mikone

        else if (b.board[row1][col1].mohre == 'R' &&
                b.board[row2][col2].mohre == '.' &&
                row1 - row2 == -1 && col1 - col2 == 1) {
            b.board[row1][col1].mohre = '.';
            b.board[row2][col2].mohre = 'R';
            draw.tableOfGame(b.board);
            return true;
        }//be samt paein-chap harekat mikone

        else if (b.board[row1][col1].mohre == 'R' &&
                b.board[row2][col2].mohre == '.' &&
                row1 - row2 == -1 && col1 - col2 == -1) {
            b.board[row1][col1].mohre = '.';
            b.board[row2][col2].mohre = 'R';
            draw.tableOfGame(b.board);
            return true;
        } //be samt paein-rast harekat mikone

        else return false;
    }
    public static boolean hitforR(int row1, int row2, int col1, int col2) {
        if (b.board[row1][col1].mohre == 'R') {
            if ((row1 == 2 || row1 == 3 || row1 == 4 || row1 == 5 || row1 == 6 || row1 == 7)
                    && (col1 == 0 || col1 == 1 || col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5)) {
                if ((b.board[row1 - 1][col1 + 1].mohre == 'b'||
                        b.board[row1 - 1][col1 + 1].mohre == 'B') &&
                        b.board[row1 - 2][col1 + 2].mohre == '.' &&
                        row2 == (row1 - 2) && col2 == col1 + 2) {
                    b.board[row1][col1].mohre = '.';
                    b.board[row1 - 1][col1 + 1].mohre = '.';
                    b.board[row1 - 2][col1 + 2].mohre = 'R';
                    players[1].counter--;
                    draw.tableOfGame(b.board);
                    return true;
                }//be samt bala-rast harekat mikone
            }
            if ((row1 == 2 || row1 == 3 || row1 == 4 || row1 == 5 || row1 == 6 || row1 == 7)
                    && (col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5 || col1 == 6 || col1 == 7)) {
                if ((b.board[row1 - 1][col1 - 1].mohre == 'b'||
                        b.board[row1 - 1][col1 - 1].mohre == 'B') &&
                        b.board[row1 - 2][col1 - 2].mohre == '.' &&
                        row2 == (row1 - 2) && col2 == col1 - 2) {
                    b.board[row1][col1].mohre = '.';
                    b.board[row1 - 1][col1 - 1].mohre = '.';
                    b.board[row1 - 2][col1 - 2].mohre = 'R';
                    players[1].counter--;
                    draw.tableOfGame(b.board);
                    return true;
                }//be samt bala-chap harekat mikone
            }
            if ((row1 == 0 || row1 == 1 || row1 == 2 || row1 == 3 || row1 == 4 || row1 == 5)
                    && (col1 == 0 || col1 == 1 || col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5)) {
                if ((b.board[row1 + 1][col1 + 1].mohre == 'b'||
                        b.board[row1 + 1][col1 + 1].mohre == 'B') &&
                        b.board[row1 + 2][col1 + 2].mohre == '.' &&
                        row2 == (row1 + 2) && col2 == col1 + 2) {
                    b.board[row1][col1].mohre = '.';
                    b.board[row1 + 1][col1 + 1].mohre = '.';
                    b.board[row1 + 2][col1 + 2].mohre = 'R';
                    players[1].counter--;
                    draw.tableOfGame(b.board);
                    return true;
                }//be samt  paein-rast harekat mikone
            }
            if ((row1 == 0 || row1 == 1 || row1 == 2 || row1 == 3 || row1 == 4 || row1 == 5)
                    && (col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5 || col1 == 6 || col1 == 7)) {
                if ((b.board[row1 + 1][col1 - 1].mohre == 'b'||
                        b.board[row1 + 1][col1 - 1].mohre == 'B') &&
                        b.board[row1 + 2][col1 - 2].mohre == '.' &&
                        row2 == (row1 + 2) && col2 == col1 - 2) {
                    b.board[row1][col1].mohre = '.';
                    b.board[row1 + 1][col1 - 1].mohre = '.';
                    b.board[row1 + 2][col1 - 2].mohre = 'R';
                    players[1].counter--;
                    draw.tableOfGame(b.board);
                    return true;
                }//be samt  paein-chap harekat mikone
            }
        }
        return false;
    }

    public static boolean moveforB(int row3, int row4, int col3, int col4) {
        if (b.board[row3][col3].mohre == 'B' &&
                b.board[row4][col4].mohre == '.' &&
                row3 - row4 == 1 && col3 - col4 == -1) {
            b.board[row3][col3].mohre = '.';
            b.board[row4][col4].mohre = 'B';
            draw.tableOfGame(b.board);
            return true;
        } //be samt bala-rast harekat mikone

        else if (b.board[row3][col3].mohre == 'B' &&
                b.board[row4][col4].mohre == '.' &&
                row3 - row4 == 1 && col3 - col4 == 1) {
            b.board[row3][col3].mohre = '.';
            b.board[row4][col4].mohre = 'B';
            draw.tableOfGame(b.board);
            return true;
        }//be samt bala-chap harekat mikone

        else if (b.board[row3][col3].mohre == 'B' &&
                b.board[row4][col4].mohre == '.' &&
                row3 - row4 == -1 && col3 - col4 == 1) {
            b.board[row3][col3].mohre = '.';
            b.board[row4][col4].mohre = 'B';
            draw.tableOfGame(b.board);
            return true;
        } //be samt paein-chap harekat mikone

        else if (b.board[row3][col3].mohre == 'B' &&
                b.board[row4][col4].mohre == '.' &&
                row3 - row4 == -1 && col3 - col4 == -1) {
            b.board[row3][col3].mohre = '.';
            b.board[row4][col4].mohre = 'B';
            draw.tableOfGame(b.board);
            return true;
        }  //be samt paein-rast harekat mikone

        else return false;
    }
    public static boolean hitforB(int row3, int row4, int col3, int col4) {
        if (b.board[row3][col3].mohre == 'B') {
            if ((row3 == 2 || row3 == 3 || row3 == 4 || row3 == 5 || row3 == 6 || row3 == 7)
                    && (col3 == 0 || col3 == 1 || col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5)) {
                if ((b.board[row3 - 1][col3 + 1].mohre == 'r'||
                        b.board[row3 - 1][col3 + 1].mohre == 'R') &&
                        b.board[row3 - 2][col3 + 2].mohre == '.' &&
                        row4 == (row3 - 2) && col4 == col3 + 2) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 - 1][col3 + 1].mohre = '.';
                    b.board[row3 - 2][col3 + 2].mohre = 'B';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                    return true;
                }//be samt bala-rast harekat mikone
            }
            if ((row3 == 2 || row3 == 3 || row3 == 4 || row3 == 5 || row3 == 6 || row3 == 7)
                    && (col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5 || col3 == 6 || col3 == 7)) {
                if ((b.board[row3 - 1][col3 - 1].mohre == 'r'||
                        b.board[row3 - 1][col3 - 1].mohre == 'R') &&
                        b.board[row3 - 2][col3 - 2].mohre == '.' &&
                        row4 == (row3 - 2) && col4 == col3 - 2) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 - 1][col3 - 1].mohre = '.';
                    b.board[row3 - 2][col3 - 2].mohre = 'B';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                    return true;
                }//be samt bala-chap harekat mikone
            }
            if ((row3 == 0 || row3 == 1 || row3 == 2 || row3 == 3 || row3 == 4 || row3 == 5)
                    && (col3 == 0 || col3 == 1 || col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5)) {
                if ((b.board[row3 + 1][col3 + 1].mohre == 'r'||
                        b.board[row3 + 1][col3 + 1].mohre == 'R') &&
                        b.board[row3 + 2][col3 + 2].mohre == '.' &&
                        row4 == (row3 + 2) && col4 == col3 + 2) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 + 1][col3 + 1].mohre = '.';
                    b.board[row3 + 2][col3 + 2].mohre = 'B';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                    return true;
                }//be samt  paein-rast harekat mikone
            }
            if ((row3 == 0 || row3 == 1 || row3 == 2 || row3 == 3 || row3 == 4 || row3 == 5)
                    && (col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5 || col3 == 6 || col3 == 7)) {
                if ((b.board[row3 + 1][col3 - 1].mohre == 'r'||
                        b.board[row3 + 1][col3 - 1].mohre == 'R') &&
                        b.board[row3 + 2][col3 - 2].mohre == '.' &&
                        row4 == (row3 + 2) && col4 == col3 - 2) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 + 1][col3 - 1].mohre = '.';
                    b.board[row3 + 2][col3 - 2].mohre = 'B';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                    return true;
                }//be samt  paein-chap harekat mikone
            }
        }
        return false;
    }

}
