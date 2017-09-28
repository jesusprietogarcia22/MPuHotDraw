package PracticaMP;

import java.awt.*;
import java.util.ArrayList;
import uHotDrawFramework.uDrawing;
import uHotDrawFramework.uDrawingEditor;
import uHotDrawFramework.uDrawingView;
import uHotDrawFigures.IFigure;


public class PracticaMP {
    public static void main(String[] args) {
        
        uDrawingView view;
        uDrawing drawing;
 
     
        ArrayList<IFigure> figuras = new ArrayList();
       
       
        drawing = new uDrawing();
        drawing.setFigures(figuras);
        
        view = new uDrawingView();
        view.setDrawing(drawing);
        view.setPreferredSize(new Dimension(640,640));
        
        uDrawingEditor editor = new uDrawingEditor();
        editor.getView().setDrawing(drawing);
        editor.setVisible(true);
    }
    
}
