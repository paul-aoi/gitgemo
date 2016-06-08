	import java.util.Scanner;
	
	public class nest {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
						
			System.out.println("Learn your squares and cubes!");
			
			boolean repeat = true;
			
			while(repeat){
				System.out.print("Enter a Integer: ");
				int n = scan.nextInt();
				System.out.println("Number \t Squared  Cubed");
				System.out.println("=======\t =======  =======");
				
			for (int i=1; i<=n; i++){
				System.out.println(i + "\t " + i*i + "\t  " + i*i*i);
			}
			
			System.out.print("Cotinue? (y/n) ");
			String d = scan.next();
			
			if (d.equalsIgnoreCase("y"))
				repeat = true;
			else {
				System.out.println("Have a nice day! ");repeat = false;
				}
			}
			scan.close();
		}
	}
