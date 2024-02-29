public class Box extends Rectangle {
  private int height;

  public box() {
    super();
    height = 0;
  }
  
  public box(int length, int width, int h) {
    super(length, width);
    height = h > 0? h : 0;
  }
  
  public void set(int len,int wid,int h) {
    super.set(len, wid);
    height = h > 0? h : 0;
  }

  public int getHeight() {
    return height;
  }

  public String toString() {
    return super.toString() + " height = " + height;
  }
  
  public void print (){
    super.print();
    System.out.println("height = " + height);
  }

  public boolean equals(Box b) {
    return super.equals(b) && height == b.height;
  }

  public void copy(Box b) {
    super.copy(b);
    height = b.height;
    
  }

  public Box getCopy() {
    return new Box(getLength(), getWidth(), height);
  }
    
  public int volume() {
    return super.getArea() * height;
  }

  public int area() {
    return 2 * (super.Area() + getHeight() * getWidth() * height);
  }
  

  

}
