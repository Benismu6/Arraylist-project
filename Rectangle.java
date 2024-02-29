public class Rectangle {
  private int len;
  private int wid;
  
  public Rectangle() {
    len = 0;
    wid = 0;
  }  
  
  public Rectangle(int length, int width) {
    len = length > 0? length : 0;
    wid = width > 0 ? width : 0;
  }

  public int getLength() {
    return len;
  }

  public int getWidth() {
    return wid;
  }
  
  public boolean equals (Rectangle r) {
    return length == r.length() && width == r.width;
  }

  public String toString() {
    return "length =" + length + "width = " + width;
  }
  
  public void print() {
    System.out.println("length =" + length + "width = " + width);
  }

  public void copy (Rectangle r) {
    len = r.len;
    wid = r.wid;
  }

  public Rectangle getCopy() {
    return new Rectangle(len, wid);
  }

  public int getArea() {
    return len * wid;
  }

  public int getPerimeter() {
    return 2 * (len + wid);
  }


  
}