package suriya;

public class Rectangular {
	private int  length;
	private int  breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	Rectangular(int length,int breadth){
		this.breadth=breadth;
		this.length=length;
		
		}
	 public int display() {
		return breadth*length;
		
	}

}