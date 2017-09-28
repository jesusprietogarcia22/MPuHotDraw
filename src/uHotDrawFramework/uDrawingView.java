package uHotDrawFramework;

import Tools.ITool;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import uHotDrawFigures.IFigure;


public class uDrawingView extends JPanel implements MouseListener,MouseMotionListener {
    private uDrawing drawing = new uDrawing();
    private uDrawingEditor editor;
    private final ArrayList<IFigure> figurasseleccionadas;
    
    
    public uDrawingView() {
       super();
       this.figurasseleccionadas = new ArrayList<>();
       this.addMouseListener(this);
    }
    
    public void clearSelection(){
        this.figurasseleccionadas.clear();
    }
    public void addToSelection(IFigure f){
        
        this.figurasseleccionadas.add(f);
        
    }
    
    
    public ITool tool(){
     return editor.getCurrentTool();
    }
   

    public uDrawingEditor getEditor() {
        return editor;
    }

    public void setEditor(uDrawingEditor editor) {
        this.editor = editor;
    }
    

    @Override
    public void paint(Graphics g){
        
        drawing.draw(g);
    }
    public uDrawing getDrawing() {
        return drawing;
    }

    public void setDrawing(uDrawing drawing) {
        this.drawing = drawing;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
      
         tool().mouseDown(me);
         editor.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
           
            tool().mouseUp(me);
            editor.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void mouseDragged(MouseEvent me) {
         tool().mouseDrag(me);
         editor.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        tool().mouseMove(me);
        editor.repaint();
    }

    public void setDrawingEditor(uDrawingEditor aThis) {
        
        this.editor = aThis;
    }
    
}
