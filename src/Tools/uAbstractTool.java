package Tools;

import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;

public  class uAbstractTool implements ITool {
    
    protected uDrawingView view;
    
    public uAbstractTool(uDrawingView view){
      
      this.view = view;
    }
    
    public void setView(uDrawingView view) {
        this.view = view;
    }
    
    public uDrawingView getView() {
        return view;
    }

    @Override
    public void mouseUp(MouseEvent me) {}

    @Override
    public void mouseMove(MouseEvent me) {}

    @Override
    public void mouseDown(MouseEvent me) {}

    @Override
    public void mouseDrag(MouseEvent me) {}
  
    
}
