package uHotDrawFigures;
import java.awt.*;

public class uAbstractFigure implements IFigure{
    protected Rectangle caja;
    
    public uAbstractFigure(){
        this.caja = new Rectangle(20,20,30,30);
    }
    
    public Rectangle getCaja() {
        return caja;
    }

    public void setCaja(Rectangle box) {
        this.caja = box;
    }

    @Override
    public void draw(Graphics g) {
        int dx = this.getCaja().x;
        int dy = this.getCaja().y;
        int h = this.getCaja().height;
        int w = this.getCaja().width;
        g.drawOval(dx,dy,h,w);
        g.setColor(Color.red);
    }

    @Override
    public boolean containsPoint(int dx, int dy) {
        boolean bool;
        bool = this.getCaja().contains(dx, dy);
        return bool;
    }
    
    @Override
    public void moveBy(int dx, int dy) {
        this.getCaja().translate(dx,dy);
    }
    
    @Override
    public Rectangle displayBox() {
        return this.getCaja();
    }

    @Override
    public IFigure clone() {
        return this;
    }
    
}
