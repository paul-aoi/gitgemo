package lab13;

public class Sheep implements Countable, Cloneable {

	private int count = 0;
	@Override
	public void incrementCount() {
		count++;
		
	}

	@Override
	public void resetCount() {
		
	}

	@Override
	public int getCount() {
		return count;	}

//	@Override
//	public String getCountString() {
//		return count(toString());
//		
//	}

//	private String count(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
