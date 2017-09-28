package Tools;

import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;
import uHotDrawFigures.IFigure;


public class uSelectionTool implements ITool{
    private uDrawingView view;
    private ITool child;

    public uSelectionTool(uDrawingView view){
        this.view=view;
    }
    
    IFigure findFigure(int dx,int dy){
        return view.getDrawing().findFigure(dx,dy);
    }
    
    @Override
    public void mouseDown(MouseEvent e){
        int dx = e.getX();
        int dy = e.getY();
        IFigure figure = findFigure(dx,dy);
        if(figure != null){
            child = (ITool) new uDragTool(view,figure);
        } else{
            child = (ITool) new uSelectAreaTool(view);
        }
        child.mouseDown(e);
    }
    
    @Override
    public void mouseUp(MouseEvent e){
        child.mouseUp(e);
    }
    
    @Override
    public void mouseDrag(MouseEvent e){
        child.mouseDrag(e);
    }
    
    @Override
    public void mouseMove(MouseEvent e){}
}




