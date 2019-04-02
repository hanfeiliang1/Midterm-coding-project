package pkgShape;

import java.util.Comparator;
import java.lang.*; 

public class Cuboid extends Rectangle {
	public int iDepth;
	
	public Cuboid(int depth, int width, int length) {
		super(width, length);
		if (depth < 0) {
			throw new IllegalArgumentException("Please provide positive numbers for width and length!");
		}
		this.iDepth = depth;
	}

	public void setiDepth(int depth) {
		this.iDepth = depth;
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public double volume() {
		return super.area() * iDepth;
	}
	
	@Override
	public double area() {
		return 2 * (iDepth * iLength + iDepth * iWidth + iWidth * iLength);
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter is not supported in on this shape.");
	}

	@Override
	public int compareTo(Object o) {
		Cuboid that = (Cuboid) o;
		if (this.volume() - that.volume() > 0) {
			return 1;
		} else if (this.volume() - that.volume() < 0){
			return -1;
		} else {
			return 0;
		}
	}

	static class SortByArea implements Comparator<Cuboid> {
		public int compare(Cuboid a, Cuboid b) {
			if (a.area() - b.area() > 0) {
				return 1;
			} else if (a.area() - b.area() < 0) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	static class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			if (a.volume() - b.volume() > 0) {
				return 1;
			} else if (a.volume() - b.volume() < 0) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}




