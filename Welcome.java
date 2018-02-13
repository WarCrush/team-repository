
import java.util.Scanner;

public class Graph {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number: ");
    int n1 = input.nextInt();
    System.out.print("Enter number: ");
    int n2 = input.nextInt();
    System.out.print("Enter number: ");
    int n3 = input.nextInt();
    System.out.print("Enter number: ");
    int n4 = input.nextInt();
    System.out.print("Enter number: ");
    int n5 = input.nextInt();


	int val = 0;

    for(int counter = 1; counter <= 5; counter++){
	 if(counter == 1)
	  val = n1;
	 else if (counter == 2)
	  val = n2;
	 else if (counter == 3)
	  val = n3;
	 else if (counter == 4)
	  val = n4;
	 else if (counter == 5)
	  val = n5;
	for(int j = 1; j <= val; j++){
      System.out.print("*");

	      }
	      System.out.println();
    }
  }
}
