package lab13;

public class countUtil {
	
public static void counter (Countable obj, int count) {
	for (int i = 0; i < count; i++) {
		obj.incrementCount();
		System.out.println(obj.getCount());
	}
}
	
}
