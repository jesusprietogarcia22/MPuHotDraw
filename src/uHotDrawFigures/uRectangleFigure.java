package uHotDrawFigures;
import java.awt.*;


public class uRectangleFigure extends uAbstractFigure {

    public uRectangleFigure(int x, int y, int j, int j2) {
        throw new UnsupportedOperationException("Not available");
    }
    
    public uRectangleFigure(){}

    @Override
    public void draw(Graphics g){
        int dx = this.getCaja().x;
        int dy = this.getCaja().y;
        int h = this.getCaja().height;
        int w = this.getCaja().width;
        
        g.drawRect(dx, dy, h, w);
        g.setColor(Color.black);
    }
    
    @Override
    public IFigure clone(){
        super.clone();
        return new uRectangleFigure();
    }
    
    public void setSize(int w, int h) {
        throw new UnsupportedOperationException("Not available");
    }
}    
