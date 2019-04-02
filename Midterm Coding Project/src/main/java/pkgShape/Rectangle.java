package pkgShape;

public class Rectangle extends Shape implements Comparable {
	
	public int iWidth, iLength;

	public Rectangle(int width, int length) {
		if (width < 0 || length < 0) {
			throw new IllegalArgumentException("Please provide positive numbers for width and length!");
		}
		this.iWidth = width;
		this.iLength = length;
		
	}
	
	public double area() {
		return iWidth * iLength;
	}
	
	public double perimeter() {
		return 2 * (iWidth + iLength);
	}
	
	public void setiWidth(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("cannot be zero or negative") ;
		}
		iWidth =i;
	}
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiLength(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("cannot be zero or negative") ;
		}
		iLength =i;
	}
	
	public int getiLength() {
		return iLength;
	}

	@Override
	public int compareTo(Object o) {
		Rectangle that = (Rectangle) o;
		if (this.area() - that.area() > 0) {
			return 1;
		} else if (this.area() - that.area() < 0){
			return -1;
		} else {
			return 0;
		}
	}

}
