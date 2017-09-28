package Tools;

import java.awt.event.MouseEvent;
import uHotDrawFigures.uRectangleFigure;
import uHotDrawFramework.uDrawingView;
import uHotDrawFigures.IFigure;


public class uSelectAreaTool implements ITool{
    
    private uDrawingView view;
    private uRectangleFigure rectangle;
    
    public uSelectAreaTool(uDrawingView view){
        this.view=view;
    }
    
    public void mouseDown(MouseEvent e){
        int dx = e.getX();
        int dy = e.getY();
        rectangle = new uRectangleFigure(dx,dy,0,0);
        view.getDrawing().addFigura(rectangle);
    }
    
    public void mouseUp(MouseEvent e){
        view.getDrawing().remove(rectangle);
        view.clearSelection();
        for(IFigure figura:view.getDrawing().findFigures(rectangle.displayBox())){
            view.addToSelection(figura);
        }
    }
    
    public void mouseDrag(MouseEvent e){
        int dx = e.getX();
        int dy = e.getY();
        int recx = rectangle.displayBox().x;
        int recy = rectangle.displayBox().y;
        int width = dx - recx;
        int height = dy - recy;
        rectangle.setSize(width,height);
    }
    
    public void mouseMove(MouseEvent e){}
    
    uSelectAreaTool() {
        throw new UnsupportedOperationException("Not available"); //To change body of generated methods, choose Tools | Templates.
    }
}

