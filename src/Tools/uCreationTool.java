package Tools;

import java.awt.*;
import java.awt.event.MouseEvent;
import uHotDrawFigures.IFigure;
import uHotDrawFramework.uDrawingView;


public class uCreationTool extends uAbstractTool {
    protected IFigure prototype;
    
    public uCreationTool(uDrawingView view, IFigure figura) {
        super(view);
        super.setView(view);
        this.prototype = figura;
    }

    public void setPrototype(IFigure prototype) {
        this.prototype = prototype;
    }
    
    public IFigure getPrototype() {
        return prototype.clone();
    }
    
    public IFigure createFigure(){
        return prototype.clone();
    }

    @Override
      public void mouseDown (MouseEvent e){
        IFigure figura = createFigure();
        Rectangle r = figura.displayBox();
        Point p = new Point(e.getX()-r.x,e.getY()-r.y);
        int dx = (int) p.getX();
        int dy = (int) p.getY();
        figura.moveBy(dx,dy);
        view.getDrawing().addFigura(figura);
    }
    
 
    @Override
    public void mouseUp(MouseEvent e){}

}
