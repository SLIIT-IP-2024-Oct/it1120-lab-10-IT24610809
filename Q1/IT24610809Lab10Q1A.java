import java.util.Scanner;

public class IT24610809Lab10Q1A {
    public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter a mark (0-100):");
	int mark = input.nextInt();
	
	assert (mark >= 0 && mark <= 100) : "Invalid Mark";
	
	System.out.println("Mark is Validated.");
	
	}
	
}