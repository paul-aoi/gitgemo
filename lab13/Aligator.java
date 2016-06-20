package lab13;

public class Aligator implements Countable {
	
	private int count = 0;
		
	public Aligator(int count){
		this.count = count;
	}
	
	public int formatCount(){
		int c = count;
		return c;
	}
	

	@Override
	public void incrementCount() {
		count++;
		
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

//	@Override
//	public void getCountString() {
//		
//	}

}
