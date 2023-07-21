public class checkjump_possibility extends Game {

    //to in class check mikonim ke age ba ye mohre mitonest mohre harifo bezane ,be mohre digash ejaze harekat nade !

    public static boolean checkjumpforr(int row1, int row2, int col1, int col2) {

        //in halgheha bekhater ineke toye hame khone haei k 'r' ya 'R' hast ,
        //begarde va faghat be mohrei ejaze harekat bede ke betone mohre harifo bezane !

        for (row1 = 0; row1 < 8; row1++) {
            for (col1 = 0; col1 < 8; col1++) {
                if (b.board[row1][col1].mohre == 'r') {
                    if ((row1 == 3 || row1 == 4 || row1 == 5 || row1 == 6 || row1 == 7)
                            && (col1 == 0 || col1 == 1 || col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5)) {
                        if (b.board[row1 - 1][col1 + 1].mohre == 'b' &&
                                b.board[row1 - 2][col1 + 2].mohre == '.' &&
                                row2 != (row1 - 2) && col2 != col1 + 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt bala-rast harekat mikone

                    } else if ((row1 == 3 || row1 == 4 || row1 == 5 || row1 == 6 || row1 == 7)
                            && (col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5 || col1 == 6 || col1 == 7)) {
                        if (b.board[row1 - 1][col1 - 1].mohre == 'b' &&
                                b.board[row1 - 2][col1 - 2].mohre == '.' &&
                                (row2 != (row1 - 2) && col2 != col1 - 2)) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt bala-chap harekat mikone
                    }
                }
                else if (b.board[row1][col1].mohre == 'R') {
                    if ((row1 == 0 || row1 == 1 || row1 == 2 || row1 == 3 || row1 == 4 || row1 == 5)
                            && (col1 == 0 || col1 == 1 || col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5)) {
                        if (b.board[row1 + 1][col1 + 1].mohre == 'b' &&
                                b.board[row1 + 2][col1 + 2].mohre == '.' &&
                                row2 != (row1 + 2) && col2 != col1 + 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt paein-rast harekat mikone
                    }
                    else if ((row1 == 0 || row1 == 1 || row1 == 2 || row1 == 3 || row1 == 4 || row1 == 5)
                            && (col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5 || col1 == 6 || col1 == 7)) {
                        if (b.board[row1 + 1][col1 - 1].mohre == 'b' &&
                                b.board[row1 + 2][col1 - 2].mohre == '.' &&
                                row2 != (row1 + 2) && col2 != col1 - 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt paein-chap harekat mikone
                    }
                   else if ((row1 == 2 || row1 == 3 || row1 == 4 || row1 == 5 || row1 == 6 || row1 == 7)
                            && (col1 == 0 || col1 == 1 || col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5)) {
                        if (b.board[row1 - 1][col1 + 1].mohre == 'b' &&
                                b.board[row1 - 2][col1 + 2].mohre == '.' &&
                                row2 != (row1 - 2) && col2 != col1 + 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt bala-rast harekat mikone

                    }
                    else if ((row1 == 2 || row1 == 3 || row1 == 4 || row1 == 5 || row1 == 6 || row1 == 7)
                            && (col1 == 2 || col1 == 3 || col1 == 4 || col1 == 5 || col1 == 6 || col1 == 7)) {
                        if (b.board[row1 - 1][col1 - 1].mohre == 'b' &&
                                b.board[row1 - 2][col1 - 2].mohre == '.' &&
                                row2 != (row1 - 2) && col2 != col1 - 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt bala-chap harekat mikone
                    }
                }
            }
        }
        return false;
    } // payan method checkjumpforr

    public static boolean checkjumpforb(int row3, int row4, int col3, int col4) {

        //in halgheha bekhater ineke toye hame khone haei k 'b' ya 'B' hast ,
        //begarde va faghat be mohrei ejaze harekat bede ke betone mohre harifo bezane !

        for (row3 = 0; row3 < 8; row3++) {
            for (col3 = 0; col3 < 8; col3++) {
                if (b.board[row3][col3].mohre == 'b') {
                    if ((row3 == 0 || row3 == 1 || row3 == 2 || row3 == 3 || row3 == 4)
                            && (col3 == 0 || col3 == 1 || col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5)) {
                        if (b.board[row3 + 1][col3 + 1].mohre == 'r' &&
                                b.board[row3 + 2][col3 + 2].mohre == '.' &&
                                row4 != (row3 + 2) && col4 != col3 + 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt paein-rast harekat mikone

                    } else if ((row3 == 0 || row3 == 1 || row3 == 2 || row3 == 3 || row3 == 4)
                            && (col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5 || col3 == 6 || col3 == 7)) {
                        if (b.board[row3 + 1][col3 - 1].mohre == 'r' &&
                                b.board[row3 + 2][col3 - 2].mohre == '.' &&
                                row4 != (row3 + 2) && col4 != col3 - 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt paein-chap harekat mikone
                    }
                }
                else if (b.board[row3][col3].mohre == 'B') {
                    if ((col3 == 0 || col3 == 1 || col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5) &&
                            (row3 == 2 || row3 == 3 || row3 == 4 || row3 == 5 || row3 == 6 || row3 == 7)) {
                        if (b.board[row3 - 1][col3 + 1].mohre == 'r'
                                && b.board[row3 - 2][col3 + 2].mohre == '.' &&
                                row4 != (row3 - 2) && col4 != col3 + 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt bala-rast harekat mikone

                    } else if ((col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5 || col3 == 6 || col3 == 7) &&
                            (row3 == 2 || row3 == 3 || row3 == 4 || row3 == 5 || row3 == 6 || row3 == 7)) {
                        if (b.board[row3 - 1][col3 - 1].mohre == 'r'
                                && b.board[row3 - 2][col3 - 2].mohre == '.' &&
                                row4 != (row3 - 2) && col4 != col3 - 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt bala-chap harekat mikone

                    } else if ((col3 == 0 || col3 == 1 || col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5) &&
                            (row3 == 0 || row3 == 1 || row3 == 2 || row3 == 3 || row3 == 4 || row3 == 5)) {
                        if (b.board[row3 + 1][col3 + 1].mohre == 'r'
                                && b.board[row3 + 2][col3 + 2].mohre == '.' &&
                                row4 != (row3 + 2) && col4 != col3 + 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt paein-rast harekat mikone

                    } else if ((col3 == 2 || col3 == 3 || col3 == 4 || col3 == 5 || col3 == 6 || col3 == 7) &&
                            (row3 == 0 || row3 == 1 || row3 == 2 || row3 == 3 || row3 == 4 || row3 == 5)) {
                        if (b.board[row3 + 1][col3 - 1].mohre == 'r'
                                && b.board[row3 + 2][col3 - 2].mohre == '.' &&
                                row4 != (row3 + 2) && col4 != col3 - 2) {
                            System.out.println(" you must jump  !");
                            return true;
                        }// be samt bala-chap harekat mikone
                    }
                }
            }
        }
        return false;
    }// payan method checkjumpforb

}// payan class checkjump_possibility
