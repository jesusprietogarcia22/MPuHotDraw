package uHotDrawFigures;
import java.awt.*;

public interface IFigure {
    public void draw(Graphics g);
    public Rectangle displayBox();
    public IFigure clone();
    public boolean containsPoint(int dx, int dy);
    public void moveBy(int dx,int dy);
}
