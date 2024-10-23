public class Line {
    private Point p1, p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getPointOne(){
        return p1;
    }

    public void setPointOne(Point p){
        this.p1 = p;
    }

    public Point getPointTwo(){
        return p2;
    }

    public void setPointTwo(Point p){
        this.p2 = p;
    }

    public void ToString()
    {
        System.out.printf("Линия от {%s, %s} до {%s, %s}",p1.getX(), p1.getY(),p2.getX(), p2.getY());
    }
}

