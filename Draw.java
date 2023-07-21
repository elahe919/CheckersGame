import java.util.Scanner;

public class Draw extends Game {
    public void background() {
        // moarefi bazi
        Scanner in = new Scanner(System.in);
        String yes = "yes";
        System.out.println();
        System.out.println("  *                                *");
        System.out.println(" ***     Welcome to checkers      ***");
        System.out.println("*****      Hope to enjoy!        *****");
        System.out.println(" ***                              ***");
        System.out.println("  *                                *");
        System.out.println();
        System.out.print(" would you like to read rules of checkers ? yes or no ? ");
        String answer = in.next();
        if (answer.equals(yes)) {
            System.out.println("\n Movement :");
            System.out.println(" Basic movement is to move a checker one space diagonally forward.\n" +
                    " You can not move a checker backwards until it becomes a King, as described below.\n" +
                    " If a jump is available, you must take the jump, as described in the next question and answer.");
            System.out.println("\n Jumping :\n" +
                    " If one of your opponent’s checkers is on a forward diagonal next to one of your checkers,\n" +
                    " and the next space beyond the opponent’s checker is empty,\n" +
                    " then your checker must jump the opponent’s checker and land in the space beyond.\n" +
                    " Your opponent’s checker is captured and removed from the board.");
            System.out.println("\n You Must Jump if Possible :\n" +
                    " If a jump is available for one of your pieces, you must make that jump.\n" +
                    " If more jumps are available with that same piece, you must continue to jump with it until it can jump no more.\n" +
                    " To make the second and third jump with a piece, you do not need to click that piece again.\n" +
                    " Just click the next space to which it will jump.\n" +
                    " If more than one of your pieces has a jump available at the start of your turn,\n" +
                    " you can choose which piece you will move. But then you must make all the jumps available for that piece.");
            System.out.println("\n Crowning :\n" +
                    " When one of your checkers reaches the opposite side of the board,\n" +
                    " it is crowned and becomes a King. Your turn ends there.\n" +
                    " A King can move backward as well as forward along the diagonals. It can only move a distance of one space.\n" +
                    " A King can also jump backward and forward. It must jump when possible,\n" +
                    " and it must take all jumps that are available to it.\n" +
                    " In each jump, the King can only jump over one opposing piece at a time,\n" +
                    " and it must land in the space just beyond the captured piece.\n" +
                    " The King can not move multiple spaces before or after jumping a piece.\n");
            System.out.println(" !!!!!!!! Lets start the game !!!!!!!!! ");

        }
        System.out.println();
    }
    //rasm board
    public void tableOfGame(Tile[][] b) {
        System.out.println("    0   1   2   3   4   5   6   7");
        System.out.println("  ---------------------------------");
        System.out.printf("0 | %c | %c | %c | %c | %c | %c | %c | %c |\n",
                Game.b.board[0][0].mohre, Game.b.board[0][1].mohre, Game.b.board[0][2].mohre, Game.b.board[0][3].mohre,
                Game.b.board[0][4].mohre, Game.b.board[0][5].mohre, Game.b.board[0][6].mohre, Game.b.board[0][7].mohre);
        System.out.println("  ---------------------------------");
        System.out.printf("1 | %c | %c | %c | %c | %c | %c | %c | %c |\n",
                Game.b.board[1][0].mohre, Game.b.board[1][1].mohre, Game.b.board[1][2].mohre, Game.b.board[1][3].mohre
                , Game.b.board[1][4].mohre, Game.b.board[1][5].mohre, Game.b.board[1][6].mohre, Game.b.board[1][7].mohre);
        System.out.println("  ---------------------------------");
        System.out.printf("2 | %c | %c | %c | %c | %c | %c | %c | %c |\n",
                Game.b.board[2][0].mohre, Game.b.board[2][1].mohre, Game.b.board[2][2].mohre, Game.b.board[2][3].mohre
                , Game.b.board[2][4].mohre, Game.b.board[2][5].mohre, Game.b.board[2][6].mohre, Game.b.board[2][7].mohre);
        System.out.println("  ---------------------------------");
        System.out.printf("3 | %c | %c | %c | %c | %c | %c | %c | %c |\n",
                Game.b.board[3][0].mohre, Game.b.board[3][1].mohre, Game.b.board[3][2].mohre, Game.b.board[3][3].mohre
                , Game.b.board[3][4].mohre, Game.b.board[3][5].mohre, Game.b.board[3][6].mohre, Game.b.board[3][7].mohre);
        System.out.println("  ---------------------------------");
        System.out.printf("4 | %c | %c | %c | %c | %c | %c | %c | %c |\n",
                Game.b.board[4][0].mohre, Game.b.board[4][1].mohre, Game.b.board[4][2].mohre, Game.b.board[4][3].mohre
                , Game.b.board[4][4].mohre, Game.b.board[4][5].mohre, Game.b.board[4][6].mohre, Game.b.board[4][7].mohre);
        System.out.println("  ---------------------------------");
        System.out.printf("5 | %c | %c | %c | %c | %c | %c | %c | %c |\n",
                Game.b.board[5][0].mohre, Game.b.board[5][1].mohre, Game.b.board[5][2].mohre, Game.b.board[5][3].mohre
                , Game.b.board[5][4].mohre, Game.b.board[5][5].mohre, Game.b.board[5][6].mohre, Game.b.board[5][7].mohre);
        System.out.println("  ---------------------------------");
        System.out.printf("6 | %c | %c | %c | %c | %c | %c | %c | %c |\n",
                Game.b.board[6][0].mohre, Game.b.board[6][1].mohre, Game.b.board[6][2].mohre, Game.b.board[6][3].mohre
                , Game.b.board[6][4].mohre, Game.b.board[6][5].mohre, Game.b.board[6][6].mohre, Game.b.board[6][7].mohre);
        System.out.println("  ---------------------------------");
        System.out.printf("7 | %c | %c | %c | %c | %c | %c | %c | %c |\n",
                Game.b.board[7][0].mohre, Game.b.board[7][1].mohre, Game.b.board[7][2].mohre, Game.b.board[7][3].mohre
                , Game.b.board[7][4].mohre, Game.b.board[7][5].mohre, Game.b.board[7][6].mohre, Game.b.board[7][7].mohre);
        System.out.println("  ---------------------------------");

    }
}
