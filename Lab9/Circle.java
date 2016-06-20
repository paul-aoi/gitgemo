package Lab9;



public class Circle {

	private double radius;
	private double area;
	private double circumf;
	
	public Circle (double r){
		r = this.radius;
		

	}

	public double getArea() {
		return area;
	}

	public void setArea(double r) {
		this.area = Math.pow(r, 2) * Math.PI;
		
	}

	public double getCircumf() {
		return circumf;
	}

	public void setCircumf(double r) {
		this.circumf = r * 2 * Math.PI;
	}
	
//	public double getFormatArea(){
//	
//	}
}
