public class check_winner extends Game {
    public static boolean winner(){
        if (players[0].counter==0){
            System.out.println("****************************************");
            System.out.println("           End of the game      ");
            System.out.println("     ** congratulation to "+players[1].id+" **");
            System.out.println("           you won dear         ");
            System.out.println("****************************************");
            return true;
        }
        else if (players[1].counter==0){
            System.out.println("****************************************");
            System.out.println("           End of the game      ");
            System.out.println("     ** congratulation to "+players[0].id+" **");
            System.out.println("           you won dear         ");
            System.out.println("****************************************");
            return true;
        }
        return false;
    }
}
