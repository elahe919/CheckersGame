public class Hit_Move extends Game {

        public static boolean hit_move_forr(int row1, int row2, int col1, int col2) {

            if (col1 == 7 || col1 == 6) {
                if ((b.board[row1 - 1][Math.abs(col1 - 1)].mohre == 'b'||
                        b.board[row1 - 1][Math.abs(col1 - 1)].mohre == 'B')
                        && b.board[row1 - 2][Math.abs(col1 - 2)].mohre == '.' &&
                        row2 == (row1 - 2) && col2 == (Math.abs(col1 - 2))) {
                    b.board[row1][col1].mohre = '.';
                    b.board[row1 - 1][Math.abs(col1 - 1)].mohre = '.';
                    b.board[row1 - 2][Math.abs(col1 - 2)].mohre = 'r';
                    players[1].counter--;
                    draw.tableOfGame(b.board);
                    if ((b.board[row1 - 3][Math.abs(col1 - 3)].mohre == 'b'||
                            b.board[row1 - 3][Math.abs(col1 - 3)].mohre == 'B') &&
                            b.board[row1 - 4][Math.abs(col1 - 4)].mohre == '.') {
                        b.board[row1 - 2][col1 - 2].mohre = '.';
                        b.board[row1 - 3][Math.abs(col1 - 3)].mohre = '.';
                        b.board[row1 - 4][Math.abs(col1 - 4)].mohre = 'r';
                        players[1].counter--;
                        draw.tableOfGame(b.board);
                    }
                }
                else if ((b.board[row1 - 1][Math.abs(col1 - 1)].mohre == 'b'||
                        b.board[row1 - 1][Math.abs(col1 - 1)].mohre == 'B')
                        && b.board[row1 - 2][Math.abs(col1 - 2)].mohre == '.' &&
                        row2 == (row1 - 2) && col2 == (Math.abs(col1 - 2))) {
                    b.board[row1][col1].mohre = '.';
                    b.board[row1 - 1][Math.abs(col1 - 1)].mohre = '.';
                    b.board[row1 - 2][Math.abs(col1 - 2)].mohre = 'r';
                    players[1].counter--;
                    draw.tableOfGame(b.board);
                }
                else if (row1 - row2 == 1 && col1 - col2 == 1 ||
                        row1 - row2 == 1 && col1 - col2 == -1) {
                    b.board[row1][col1].mohre = '.';
                    b.board[row2][col2].mohre = 'r';
                    draw.tableOfGame(b.board);

                }
                else if (row1 - row2 != 1 || col1 - col2 != 1 || col1 - col2 != -1 ||
                        row1 - row2 == -1 ||
                        row1 < 0 || row2 < 0 || col1 < 0 || col2 < 0 ||
                        row1 >= 8 || row2 >= 8 || col1 >= 8 || col2 >= 8) {
                    if (makeking.makekingforR(row1, row2, col1, col2) == false)
                        System.out.println(" wrong choice ! try again ");
                    return true;
                }
            }
            else if (col1 == 0 || col1 == 1) {
                if ((b.board[row1 - 1][col1 + 1].mohre == 'b'||
                        b.board[row1 - 1][col1 + 1].mohre == 'B')
                        && b.board[row1 - 2][col1 + 2].mohre == '.' &&
                        row2 == (row1 - 2) && col2 == (col1 + 2)) {
                    b.board[row1][col1].mohre = '.';
                    b.board[row1 - 1][col1 + 1].mohre = '.';
                    b.board[row1 - 2][col1 + 2].mohre = 'r';
                    players[1].counter--;
                    draw.tableOfGame(b.board);
                }
                else if (row1 - row2 == 1 && col1 - col2 == 1 || row1 - row2 == 1 && col1 - col2 == -1) {
                    b.board[row1][col1].mohre = '.';
                    b.board[row2][col2].mohre = 'r';
                    draw.tableOfGame(b.board);
                }
                else if (row1 - row2 != 1 || col1 - col2 != 1 || col1 - col2 != -1 ||
                        row1 - row2 == -1 ||
                        row1 < 0 || row2 < 0 || col1 < 0 || col2 < 0 ||
                        row1 >= 8 || row2 >= 8 || col1 >= 8 || col2 >= 8) {
                    if (makeking.makekingforR(row1, row2, col1, col2) == false)
                        System.out.println(" wrong choice ! try again ");
                    return true;
                }
            }
            else if ((b.board[row1 - 1][col1 + 1].mohre == 'b'||
                    b.board[row1 - 1][col1 + 1].mohre == 'B')
                    && b.board[row1 - 2][col1 + 2].mohre == '.' &&
                    row2 == (row1 - 2) && col2 == (col1 + 2)) {
                b.board[row1][col1].mohre = '.';
                b.board[row1 - 1][col1 + 1].mohre = '.';
                b.board[row1 - 2][col1 + 2].mohre = 'r';
                players[1].counter--;
                draw.tableOfGame(b.board);
            }
            else if ((b.board[row1 - 1][Math.abs(col1 - 1)].mohre == 'b'||
                    b.board[row1 - 1][Math.abs(col1 - 1)].mohre == 'B')
                    && b.board[row1 - 2][Math.abs(col1 - 2)].mohre == '.' &&
                    row2 == (row1 - 2) && col2 == (Math.abs(col1 - 2))) {
                b.board[row1][col1].mohre = '.';
                b.board[row1 - 1][Math.abs(col1 - 1)].mohre = '.';
                b.board[row1 - 2][Math.abs(col1 - 2)].mohre = 'r';
                players[1].counter--;
                draw.tableOfGame(b.board);
            }
            else if (row1 - row2 == 1 && col1 - col2 == 1 || row1 - row2 == 1 && col1 - col2 == -1) {
                b.board[row1][col1].mohre = '.';
                b.board[row2][col2].mohre = 'r';
                draw.tableOfGame(b.board);
            }
            else if (row1 - row2 != 1 || col1 - col2 != 1 || col1 - col2 != -1 ||
                    row1 - row2 == -1 ||
                    row1 < 0 || row2 < 0 || col1 < 0 || col2 < 0 ||
                    row1 >= 8 || row2 >= 8 || col1 >= 8 || col2 >= 8) {
                if (makeking.makekingforR(row1, row2, col1, col2) == false)
                    System.out.println(" wrong choice ! try again ");
                return true;
            }
            return false;
        }
        public static boolean hit_move_forb(int row3, int row4, int col3, int col4) {
            if (col3 == 7 || col3 == 6) {
                if ((b.board[row3 + 1][Math.abs(col3 - 1)].mohre == 'r'||
                        b.board[row3 + 1][Math.abs(col3 - 1)].mohre == 'R')
                        && b.board[row3 + 2][Math.abs(col3 - 2)].mohre == '.' &&
                        row4 == (row3 + 2) && col4 == col3 - 2) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 + 1][Math.abs(col3 - 1)].mohre = '.';
                    b.board[row3 + 2][Math.abs(col3 - 2)].mohre = 'b';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                }
                else if (row3 - row4 == -1 && Math.abs(col3 - col4) == 1) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row4][col4].mohre = 'b';
                    draw.tableOfGame(b.board);
                }
                else if (row3 - row4 != -1 || col3 - col4 != 1 ||
                        row3 - row4 == -1 ||
                        row3 < 0 || row4 < 0 || col3 < 0 || col4 < 0 ||
                        row3 >= 8 || row4 >= 8 || col3 >= 8 || col4 >= 8) {
                    System.out.println(" wrong choice ! try again ");
                    currentPlayer.nobat = false;
                    return true;
                }
            }
            else if (col3 == 0 || col3 == 1) {
                if ((b.board[row3 + 1][col3 + 1].mohre == 'r'||
                        b.board[row3 + 1][col3 + 1].mohre == 'R')
                        && b.board[row3 + 2][col3 + 2].mohre == '.' &&
                        row4 == (row3 + 2) && col4 == (col3 + 2)) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 + 1][Math.abs(col3 + 1)].mohre = '.';
                    b.board[row3 + 2][Math.abs(col3 + 2)].mohre = 'b';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                }
                else if (row3 - row4 == -1 && Math.abs(col3 - col4) == 1) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row4][col4].mohre = 'b';
                    draw.tableOfGame(b.board);
                }
                else if (row3 - row4 != -1 || col3 - col4 != 1 ||
                        row3 - row4 == -1 ||
                        row3 < 0 || row4 < 0 || col3 < 0 || col4 < 0 ||
                        row3 >= 8 || row4 >= 8 || col3 >= 8 || col4 >= 8) {
                    System.out.println(" wrong choice ! try again ");
                    currentPlayer.nobat = false;
                    return true;
                }
            }
            else if (col3 != 0 && col3 != 7 && col3 != 1 && col3 != 6) {
                if ((b.board[row3 + 1][Math.abs(col3 - 1)].mohre == 'r'||
                        b.board[row3 + 1][Math.abs(col3 - 1)].mohre == 'R')
                        && b.board[row3 + 2][Math.abs(col3 - 2)].mohre == '.' &&
                        row4 == (row3 + 2) && col4 == col3 - 2) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 + 1][Math.abs(col3 - 1)].mohre = '.';
                    b.board[row3 + 2][Math.abs(col3 - 2)].mohre = 'b';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                }
                else if ((b.board[row3 + 1][col3 + 1].mohre == 'r'||
                        b.board[row3 + 1][col3 + 1].mohre == 'R')
                        && b.board[row3 + 2][col3 + 2].mohre== '.' &&
                        row4 == (row3 + 2) && col4 == (col3 + 2)) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row3 + 1][Math.abs(col3 + 1)].mohre = '.';
                    b.board[row3 + 2][Math.abs(col3 + 2)].mohre = 'b';
                    players[0].counter--;
                    draw.tableOfGame(b.board);
                }
                else if (row3 - row4 == -1 && Math.abs(col3 - col4) == 1) {
                    b.board[row3][col3].mohre = '.';
                    b.board[row4][col4].mohre = 'b';
                    draw.tableOfGame(b.board);
                }
                else if (row3 - row4 != -1 || col3 - col4 != 1 ||
                        row3 - row4 == -1 ||
                        row3 < 0 || row4 < 0 || col3 < 0 || col4 < 0 ||
                        row3 >= 8 || row4 >= 8 || col3 >= 8 || col4 >= 8) {
                    System.out.println(" wrong choice ! try again ");
                    currentPlayer.nobat = false;
                    return true;
                }
            }
            return false;
        }
    }