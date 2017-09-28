package Tools;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import uHotDrawFigures.uPolyLineFigure;
import uHotDrawFigures.IFigure;
import uHotDrawFramework.uDrawingView;


public class uPolyLineCreationTool extends uCreationTool{
    private final ArrayList<Point> points = new ArrayList();
    private uPolyLineFigure figura;

    
    public uPolyLineCreationTool(uDrawingView view, IFigure figure) {
        super(view, figure);
    }
    
    @Override
    public IFigure createFigure(){
        return new uPolyLineFigure();
    }
    
    @Override
    public void mouseUp(MouseEvent e){
        int dx = e.getX();
        int dy = e.getY();
        Point p = new Point(dx,dy);
        points.add(p);

        int longitud = points.size();
        if(longitud>1){
            figura.setP1(points.get(longitud - 2));
            figura.setP2(points.get(longitud- 1));
            super.view.getDrawing().addFigura(figura);
        }
    }
    @Override
     public void mouseDown (MouseEvent e){
         this.figura = new uPolyLineFigure();
    }
}
