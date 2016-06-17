package Lab10;


import java.util.ArrayList;
import java.util.Scanner;

public class Movies {
	
	private String name;
	private String catagory;
	
	public Movies(String n, String c) {
		name = n;
		catagory = c;
		
	}

	public String getName() {
		return name;
	}

	public String getCatagory() {
		return catagory;
	}
	

//	public class Welcome {
//		
//		
//		 
//	public String getMovie() {
//		switch(){
//		case "drama": return 
//		}
//		
//	}
//	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input;
		
		ArrayList<Movies> ML = new ArrayList<Movies>();
		
		//MovieList.add(new Movies("star wars", "sci fi"));		
		
		Movies m1 = new Movies("star wars", "sci fi");
		ML.add(m1);
		
		Movies m2 = new Movies("star wars2", "sci fi");
		ML.add(m2);
	
		Movies m3 = new Movies("jaws", "comedy");
		ML.add(m3);
		
		Movies m4 = new Movies("xmen", "action");
		ML.add(m4);
		
		Movies m5 = new Movies("godfather", "drama");
		ML.add(m5);
		
		Movies m6 = new Movies("interstellar", "comedy");
		ML.add(m6);
		
		Movies m7 = new Movies("beetlejuice", "comedy");
		ML.add(m7);
		
		Movies m8 = new Movies("maze runner", "action");
		ML.add(m8);
		
		Movies m9 = new Movies("inception", "action");
		ML.add(m9);
//			System.out.println("chose a catagory");
//		input = scan.nextLine();
		
			for(Movies cat: ML) {
		
			for (int i = 0; i < ML.size(); i++){
			
			System.out.println(ML.indexOf(i));	
			System.out.println(cat);
					
				}
			//if (cat.getCatagory().equalsIgnoreCase("sci-fi")) {
				
			}
				
		
		
		
	//	}
		
		
		
//		System.out.println("welcome to the movie database. select a catagory to \n  view a list of movies");
//		System.out.println("sci-fi, action, comedy, drama");
//		input = scan.nextLine();
//		
//		switch (input) {
//		case "sci-fi":
//			return
//		}
	}
}
