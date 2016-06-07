package area;

import java.util.Scanner; 

public class Area {
	
	static Scanner d = new Scanner(System.in);

	public static void main(String[] args) {
	
	
				
	
		while(true){
			System.out.print("enter length ");
			double l = d.nextDouble();
			
			
			System.out.print("enter width ");		
			double w = d.nextDouble();			
			
			
			double area = l * w;			
			double perimeter = (l *2) + (w *2);	
			
			
			System.out.println("area = " + area);
			
			System.out.println("perimeter = " + perimeter);			
			
			System.out.println("again? 'N' for no, hit enter to calculate another room.");
			
			String garbage = d.nextLine();
			String input = d.nextLine();
			
			
			 if (input.equals("N")) { break; }
			
			 
			
			
		
		}	
		
	
		
		
		
		
		
	}

}

