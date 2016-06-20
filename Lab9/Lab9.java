package Lab9;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		
		String choice = "y";
		double r;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
	while (choice.equalsIgnoreCase("y"))
		{
		System.out.println("enter a radius");
		r = scan.nextDouble();
		
		Circle circle = new Circle(r);
		circle.setArea(r);
		System.out.println("area is: 		 " + circle.getArea());
		System.out.println("circumference is:" + circle.getCircumf());
		System.out.println("try again?");
		choice = scan.nextLine();
		}
	}

}
