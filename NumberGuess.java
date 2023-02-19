import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class NumberGuess {
  public static void main(String[] args) {
    Random Random_number= new Random();
    int right_guess=Random_number.nextInt(100);
    int turns=0;
    String input;
    Scanner scan=new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );
    System.out.println("best of luck!");
    Boolean play = true;
while (play) {
    
    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
      input = JOptionPane.showInputDialog("Enter your guess");
      guess = Integer.parseInt(input);
      turns++;
    
    if(guess==right_guess) {
      win=true;
    }
    else if(i>8){
      JOptionPane.showMessageDialog(null,"You loose! the right answer was: "+right_guess);
      return;
    }
    else if(guess<right_guess){
      i++;
      JOptionPane.showMessageDialog(null,"Yor Guess is lower than the right guess! Turns left: "+(10-i));
      
      
      
    }
    else if(guess>right_guess) {
      i++;
      JOptionPane.showMessageDialog(null,"Your Guess Is Higher Than THe Right Guess! Turns left: "+(10-i));
      
    }
    
    
  }
    System.out.println("You win!");
    System.out.println("Then number was "+right_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    System.out.println("Would you like to play again Y/N?");
    play = scan.nextLine().trim().equalsIgnoreCase("y");
}

    
}
}