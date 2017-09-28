package Tools;

import java.awt.*;
import java.awt.event.MouseEvent;
import uHotDrawFigures.IFigure;
import uHotDrawFramework.uDrawingView;

public class uDragTool implements ITool
{
    private uDrawingView view;
    private IFigure figura;
    
    public uDragTool(uDrawingView dview,IFigure faux){
        view=dview;
        figura=faux;
    }

    uDragTool() {}
    
    @Override
    public void mouseDown(MouseEvent e){}
    
    @Override
    public void mouseUp(MouseEvent e){}
    
    @Override
    public void mouseDrag(MouseEvent e){
        Rectangle r = figura.displayBox();
        Point p=new Point(e.getX()-r.x,e.getY()-r.y);
        int dx = p.x;
        int dy = p.y; 
        figura.moveBy(dx,dy);
    }

    @Override
    public void mouseMove(MouseEvent e){}
}
