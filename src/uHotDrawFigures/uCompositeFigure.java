package uHotDrawFigures;
import java.awt.*;
import java.util.ArrayList;


public class uCompositeFigure extends uAbstractFigure{
    
    protected ArrayList<IFigure> figuras;

    public uCompositeFigure() {
        figuras = new ArrayList();
    }

    public void setFigures(ArrayList<IFigure> figuras) {
        this.figuras = figuras;
    }
    
    public ArrayList<IFigure> getFigures() {
        return figuras;
    }
    
    @Override
    public void draw(Graphics g){
        figuras.forEach((figura) -> {figura.draw(g);});
    }
    
    @Override
    public boolean containsPoint(int dx,int dy){
        boolean bool = false;
        for (IFigure f : figuras){
          if( super.containsPoint(dx, dy) == true){
              bool = true;
          }
        }
        return bool; 
    }
    
    @Override
    public void moveBy(int dx, int dy){
        figuras.forEach((f) -> {f.moveBy(dx, dy);});
    }
    
    public void addFigura(IFigure figura){
        this.figuras.add(figura);
    }
    
    public void remove(IFigure figura){
        this.figuras.remove(figura);
    }

}
