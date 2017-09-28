package Tools;

import java.awt.event.MouseEvent;


public interface ITool {
    void mouseUp(MouseEvent me);
    
    void mouseMove(MouseEvent me);

    void mouseDown(MouseEvent me);

    void mouseDrag(MouseEvent me);
}
