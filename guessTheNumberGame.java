import java.util.*;

public class guessTheNumberGame {
    
     public void User(){
         Scanner sc = new Scanner(System.in);
         System.out.println("\t\t\t\t--------------------Number Guessing Game------------------------");
         System.out.print("\n\nEnter your name: ");
         String name = sc.nextLine();
         System.out.println("Hello "+name+"! Welcome to this game");
    }
    public void Game(){
         try (Scanner scanner = new Scanner(System.in)) {
            Random obj = new Random();
             System.out.println("Guess the number [between 1 to 10]: ");
             int input = scanner.nextInt();
             int randomNumber = obj.nextInt(10);
             int lives = 05;
             if(input == randomNumber){
                 System.out.println("Lives: "+lives);
                 System.out.println("You guessed the right number which is: "+input);
                 System.out.println("Do you want to continue? [y --> yes | n--> no]: ");
                 String option = scanner.next();           
                        if(option == "y"){
                             Game();}else if(option == "n"){
                                System.out.println("Game Exited.");
                             }else{
                                System.out.println("Invalid input.");
                             }
                }else if(input != randomNumber){
                    lives--;
                    System.out.println("lives: "+lives);
                    System.out.println("You have guessed a wrong number");
                    Game();
            }else if(randomNumber > 10){
                System.out.println("You have enetered a wrong input.");
            }
        }
    }               
    public static void main(String[] args) {
        guessTheNumberGame object = new guessTheNumberGame();
        object.User();
        object.Game();
    }
}
