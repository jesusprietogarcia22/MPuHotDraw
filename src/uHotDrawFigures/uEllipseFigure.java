package uHotDrawFigures;
import java.awt.*;

public class uEllipseFigure extends uAbstractFigure{
    
    @Override
    public IFigure clone(){
        super.clone();
        return new uEllipseFigure();
    }
    
    @Override
    public void draw(Graphics g){
        int dx = (int) this.getCaja().getX();
        int dy = (int) this.getCaja().getY();
        int h = (int) this.getCaja().getHeight();
        int w = (int) this.getCaja().getWidth();
        
        g.drawOval(dx, dy, h, w);
        g.setColor(Color.red);
    }
}
