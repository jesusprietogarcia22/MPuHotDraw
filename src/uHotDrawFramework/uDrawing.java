package uHotDrawFramework;
import java.awt.*;
import java.util.ArrayList;
import uHotDrawFigures.IFigure;


public class uDrawing extends uHotDrawFigures.uCompositeFigure{

    private  ArrayList<IFigure> figures;
    public uDrawing() {
        super();
        super.setFigures(figures);
    }

    public IFigure findFigure(int dx, int dy) {
        int j = -1;
        for(int i = 0; i <= figures.size(); i++){
            if(figures.get(i).containsPoint(dx, dy))
                j = i;
        }
        if ( j >= 0)
            return figures.get(j);
        else return null;
    }

    public Iterable<IFigure> findFigures(Rectangle displayBox) {
        throw new UnsupportedOperationException("Not available");
    }
}
