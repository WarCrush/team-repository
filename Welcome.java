
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
		switch(counter){
			case 1:
			 val = n1;
			 break;
			case 2:
			 val = n2;
			 break;
			case 3:
			 val = n3;
			 break;
			case 4:
			 val = n4;
			 break;
			case 5:
			 val = n5;
			 break;
			default:
				System.out.println("There is a problem! !");
			}
			for(int j = 1; j <= val; j++)
				System.out.print("*");

			System.out.println();
		}

}
}
