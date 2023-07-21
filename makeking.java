public class makeking extends Game {
    public static boolean makekingforR(int row1, int col1, int row2, int col2) {
        if (row1 == 1 && col1 % 2 == 0) {
            if (col1 == 0 && b.board[row1 - 1][col1 + 1].mohre== '.') {
                b.board[row1][col1].mohre = '.';
                b.board[row1 - 1][col1 + 1].mohre = 'R';
                draw.tableOfGame(b.board);
            }//be samt bala-rast harekat mikone

            else if (b.board[row1 - 1][col1 + 1].mohre == '.') {
                b.board[row1][col1].mohre = '.';
                b.board[row1 - 1][col1 + 1].mohre = 'R';
                draw.tableOfGame(b.board);
            }//be samt bala-rast harekat mikone

            else if (b.board[row1 - 1][col1 - 1].mohre == '.') {
                b.board[row1][col1].mohre = '.';
                b.board[row1 - 1][col1 - 1].mohre = 'R';
                draw.tableOfGame(b.board);
            }//be samt bala-chap harekat mikone

        } else if (row1 == 2 && col1 % 2 != 0) {
            if (col1 != 1 && b.board[row1 - 2][col1 - 2].mohre == '.'
                    &&( b.board[row1 - 1][col1 - 1].mohre == 'b'||
                    b.board[row1 - 1][col1 - 1].mohre == 'B')) {
                b.board[row1][col1].mohre = '.';
                b.board[row1 - 1][col1 - 1].mohre = '.';
                b.board[row1 - 2][col1 - 2].mohre = 'R';
                players[1].counter--;
                draw.tableOfGame(b.board);
            }//be samt bala-chap harekat mikonad

            else if (col1 != 7 && b.board[row1 - 2][col1 + 2].mohre == '.'
                    &&( b.board[row1 - 1][col1 + 1].mohre == 'b'||
                    b.board[row1 - 1][col1 + 1].mohre == 'B')) {
                b.board[row1][col1].mohre = '.';
                b.board[row1 - 1][col1 + 1].mohre = '.';
                b.board[row1 - 2][col1 + 2].mohre = 'R';
                players[1].counter--;
                draw.tableOfGame(b.board);
            }//be samt bala-rast harekat mikonad
        }

        if (b.board[row2][col2].mohre == 'R') {
            return true;
        } else return false;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean makekingforB(int row3, int col3, int row4, int col4) {
        if (row3 == 6 && col3 % 2 != 0) {
            if (col3 != 7) {
                if (b.board[row3 + 1][col3 + 1].mohre == '.') {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 + 1][col3 + 1].mohre = 'B';
                    draw.tableOfGame(b.board);
                }//be samt paein-rast harekat mikone

            } else if (b.board[row3 + 1][col3 - 1].mohre == '.') {
                b.board[row3][col3].mohre = '.';
                b.board[row3 + 1][col3 - 1].mohre = 'B';
                draw.tableOfGame(b.board);
            }//be samt paein-chap harekat mikone

        } else if (row3 == 5 && col3 % 2 == 0) {
            if (col3 != 6) {
                if ((b.board[row3 + 1][col3 + 1].mohre == 'r'||
                        b.board[row3 + 1][col3 + 1].mohre == 'R') &&
                        b.board[row3 + 2][col3 + 2].mohre == '.') {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 + 1][col3 + 1].mohre = '.';
                    b.board[row3 + 2][col3 + 2].mohre = 'B';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                }//be samt paein-rast harekat mikone

            } else if (col3 != 0) {
                if ((b.board[row3 + 1][col3 - 1].mohre == 'r'||
                        b.board[row3 + 1][col3 - 1].mohre == 'R' ) &&
                        b.board[row3 + 2][col3 - 2].mohre == '.') {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 + 1][col3 - 1].mohre = '.';
                    b.board[row3 + 2][col3 - 2].mohre = 'B';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                }//be samt paein-chap harekat mikone
            }
        }
        if (b.board[row4][col4].mohre == 'B') {
            return true;
        } else return false;
    }

}
