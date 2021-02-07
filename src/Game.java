
import java.util.Scanner;

public class Game {

    public void start(){
        boolean isGameOver = false;
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        System.out.println("Player 1, place your ships on the game field");
        player1.battlefield.initField();
        changeTurn();

        System.out.println("Player 2, place your ships on the game field");
        player2.battlefield.initField();
        changeTurn();

        while(!isGameOver){
            player2.battlefield.printBattlefield(true);
            System.out.println("---------------------");
            player1.battlefield.printBattlefield(false);
            System.out.println("Player 1, it's your turn: ");
            isGameOver = player2.battlefield.makeShot();

            if(isGameOver){
                break;
            }
            changeTurn();

            player1.battlefield.printBattlefield(true);
            System.out.println("---------------------");
            player2.battlefield.printBattlefield(false);
            System.out.println("Player 2, it's your turn: ");
            isGameOver = player1.battlefield.makeShot();

            if(isGameOver){
                break;
            }
            changeTurn();
        }
    }

    public void changeTurn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Press enter and pass the move to another player");
        scan.nextLine();
    }
}
