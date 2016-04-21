public class Rectangle {
    
    public int width;
    public int height;
    public Point origin;
    
    public Rectangle(int width, int height) {
         this.width = width;
        this.height = height;
    }
    
    public Rectangle(Point origin , int width, int height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return width * height;
    }
    
    public void move(int x , int y) {
        origin.x = x;
        origin.y = y;
    }
}