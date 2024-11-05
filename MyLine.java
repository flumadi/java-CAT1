public class MyLine {
   MyPoint begin;
   MyPoint end;

    // Constructor
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Overloaded Constructor
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Getters
    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    // Setters
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getters for begin and end coordinates
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Setters for begin and end coordinates
    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Method to return length of the line
    public double getLength() {
        return begin.distance(end);
    }

    // Method to return gradient of the line
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "MyLine begin=" + begin + 
        ", end=" + end;
    }
}