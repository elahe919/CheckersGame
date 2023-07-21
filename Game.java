import java.util.Scanner;

public class Game {
    static Board b = new Board();
    static Player[] players = new Player[2];// vizhegihaye har bazikon vared in array mishe
    static Player currentPlayer = new Player();// nobat bazikon feli
    static Player player = new Player();
    static Draw draw = new Draw();

    public static void main(String[] arg) {
        draw.background();
        Scanner input = new Scanner(System.in);
        System.out.printf("- First player please enter your name :");
        players[0] = new Player(input.next());
        System.out.printf(" Nice ! (you will play with 'r' bead )\n");
        System.out.printf("- Second player please enter your name :");
        players[1] = new Player(input.next());
        while (players[0].id.equals(players[1].id)) {
            // here we prevent from writing same id
            System.out.println(" OoOps same name  ! ");
            System.out.print("- player 2 please change your name :");
            players[1] = new Player(input.next());
        }
        if (!players[0].id.equals(players[1].id)) {
            System.out.printf(" Nice ! (you will play with 'b' bead )\n");
        }
        System.out.println();
        System.out.println("* * * Dear " + players[0].id + " && " + players[1].id + " This is the board * * *");
        System.out.println();
        Game.b.settable();
        draw.tableOfGame(b.board);
        System.out.println();
        act();
    }

    public static void act() {
        int row1, col1, row2, col2;
        Scanner input = new Scanner(System.in);
        System.out.printf(" And you must play like \n" +
                " From where : 5 0  \n" +
                " to where   : 4 1\n");
        System.out.println("-------------------------------");
        while (players[0].counter != 0 || players[1].counter != 0) {
            //bazi ta tamom shodan mohre yeki edame peyda mikone

            if (currentPlayer.nobat == true) {
                //currenPlayer.nobet -> nobat har mohraro moshakhas mikone
                // agar 'true' bashe -> nobat 'r' va agar 'false' -> nobat 'b'

                System.out.println(" " + players[0].id + " turn with 'r' bead ");
                System.out.print(" From where :");
                row1 = input.nextInt();
                col1 = input.nextInt();
                System.out.print(" to where   :");
                row2 = input.nextInt();
                col2 = input.nextInt();
                if (row1 < 0 || row1 > 8 || row2 < 0 || row2 > 8 ||
                        col1 < 0 || col1 > 8 || col2 < 0 || col2 > 8) {
                    System.out.println(" out of range ! try again ");
                    continue;
                }
                Position position1 = new Position(row1, col1);
                Position position2 = new Position(row2, col2);

                if (makeking.makekingforR(position1.getRow(), position1.getColumn(), position2.getRow(), position2.getColumn()) == true) {

                    if (check_winner.winner() == true) {
                        //shart bord ro check mikone
                        System.exit(0);
                    }
                    // dar sorati ke mohre 'r' harkat karde bashe va shah shode bashe nobat avaz mishe
                    currentPlayer.nobat = false;
                    continue;
                }
                if (checkjump_possibility.checkjumpforr(position1.getRow(), position2.getRow(), position1.getColumn(), position2.getColumn())) {
                    continue;
                    // agar mogheat zadan harif ro dasht va nazad dobare noghte migire
                }
                if (Hit_Move_forking.hitforR(position1.getRow(), position2.getRow(), position1.getColumn(), position2.getColumn()) == true) {

                    if (check_winner.winner() == true) {
                        //shart bord ro check mikone
                        System.exit(0);
                    }
                    // dar sorati ke mohre 'R' harif ro zade bashe nobat avaz mish
                    currentPlayer.nobat = false;
                    continue;

                } else if (Hit_Move_forking.moveforR(position1.getRow(), position2.getRow(), position1.getColumn(), position2.getColumn()) == true) {

                    if (check_winner.winner() == true) {
                        //shart bord ro check mikone
                        System.exit(0);
                    }
                    // dar sorati ke mohre 'R' harkat karde bashe nobat avaz mish
                    currentPlayer.nobat = false;
                    continue;

                } else if (!Hit_Move.hit_move_forr(position1.getRow(),position2.getRow(),position1.getColumn(),position2.getColumn()));

                else if (Hit_Move.hit_move_forr(position1.getRow(),position2.getRow(),position1.getColumn(),position2.getColumn()) == true) {
                    continue;
                    // tabe 'Hit_Move.hit_move_forr' dar sorati 'true' return mikone ke bazikon noghte eshtedah vared karde bashe
                }
                if (check_winner.winner() == true) {
                    //shart bord ro check mikone
                    System.exit(0);
                }
            }

            // nobat avaz mishe
            if (currentPlayer.nobat == true) {
                currentPlayer.nobat = false;
            } else {
                currentPlayer.nobat = false;
            }
            if (currentPlayer.nobat == false) {
                //currenPlayer.nobet -> nobat har mohraro moshakhas mikone
                // agar 'true' bashe -> nobat 'r' va agar 'false' -> nobat 'b'

                int row3, col3, row4, col4;
                System.out.println(" " + players[1].id + " turn with 'b' bead ");
                System.out.print(" From where :");
                row3 = input.nextInt();
                col3 = input.nextInt();
                System.out.print(" to where   :");
                row4 = input.nextInt();
                col4 = input.nextInt();
                if (row3 < 0 || row3 > 8 || row4 < 0 || row4 > 8 ||
                        col3 < 0 || col3 > 8 || col4 < 0 || col4 > 8) {
                    System.out.println(" out of range ! try again ");
                    continue;
                }
                Position position3 = new Position(row3, col3);
                Position position4 = new Position(row4, col4);

                if (makeking.makekingforB(position3.getRow(), position3.getColumn(), position4.getRow(), position4.getColumn()) == true) {

                    if (check_winner.winner() == true) {
                        //shart bord ro check mikone
                        System.exit(0);
                    }
                    // dar sorati ke mohre 'b' harkat karde bashe va shah shode bashe nobat avaz mishe
                    currentPlayer.nobat = true;
                    continue;
                }
                if (checkjump_possibility.checkjumpforb(position3.getRow(), position4.getRow(), position3.getColumn(), position4.getColumn())) {
                    continue;
                    // agar mogheat zadan harif ro dasht va nazad dobare noghte migire

                }
                if (Hit_Move_forking.hitforB(position3.getRow(), position4.getRow(), position3.getColumn(), position4.getColumn()) == true) {
                    if (check_winner.winner() == true) {
                        //shart bord ro check mikone
                        System.exit(0);
                    }
                    // dar sorati ke mohre 'B' harif ro zade bashe nobat avaz mish
                    currentPlayer.nobat = true;
                    continue;


                } else if (Hit_Move_forking.moveforB(position3.getRow(), position4.getRow(), position3.getColumn(), position4.getColumn()) == true) {

                    if (check_winner.winner() == true) {
                        //shart bord ro check mikone
                        System.exit(0);
                    }
                    // dar sorati ke mohre 'B' harkat karde bashe nobat avaz mish
                    currentPlayer.nobat = true;
                    continue;

                } else if (!Hit_Move.hit_move_forb(position3.getRow(), position4.getRow(), position3.getColumn(), position4.getColumn()))
                    ;

                else if (Hit_Move.hit_move_forb(position3.getRow(), position4.getRow(), position3.getColumn(), position4.getColumn()) == true) {
                    continue;
                    // tabe 'Hit_Move.hit_move_forb' dar sorati 'true' return mikone ke bazikon noghte eshtedah vared karde bashe
                }
                //shart bord ro check mikone
                if (check_winner.winner() == true) {
                    System.exit(0);
                }
            }
            if (currentPlayer.nobat == true) {
                currentPlayer.nobat = false;
            } else {
                currentPlayer.nobat = true;
            }
        }
    }
}
