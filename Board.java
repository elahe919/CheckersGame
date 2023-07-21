public class Board {
    // board bazi inja dorost mishe
    Tile[][] board = new Tile[8][8];

    public void makeTable() {
        //to in method ma vizhegihaye composition Tile ro be har khone mifretim
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Tile();
            }
        }
    }

    public void settable() {
        //khone haye siah ke qabel harekat hastan inja moshakhas mishe
        makeTable();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
                    board[i][j].mohre = '.';
                }
            }
        }
        //in code mohre 'b' ro bala va mohre 'r' ro paein board gharar mide
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i <= 2) {
                    if (i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0) {
                        board[i][j].mohre = 'b';
                    }
                } else if (i >= 5) {
                    if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
                        board[i][j].mohre = 'r';
                    }
                }
            }
        }
    }
}