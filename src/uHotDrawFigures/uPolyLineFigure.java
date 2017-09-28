package uHotDrawFigures;
import java.awt.*;


public class uPolyLineFigure extends uAbstractFigure{
    
    private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
    
    public void setP1(Point punto) {
        p1 = punto;
    }

    public void setP2(Point punto) {
        p2 = punto;
    }

    @Override
    public void draw(Graphics g){
        int x1 = p1.x;
        int y1 = p1.y;
        int x2 = p2.x;
        int y2 = p2.y;
        g.drawLine(x1, y1, x2, y2);
    }
    
    
}
