import java.util.Scanner;
/**
 *
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number between 1 and 10
    System.out.println("Please enter a number between 1 and 10");
    int userNum = input.nextInt();

    for(int count = 1; count <= userNum; count++){
      for(int count2 = 1; count2 <= userNum; count2++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
