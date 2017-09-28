package uHotDrawFigures;
import java.awt.*;


public class uDecoratorFigure extends uAbstractFigure {
    protected IFigure figura;
    
    public uDecoratorFigure(IFigure figura){
        this.figura = figura;
    }
    
    public void setDecoratedFigure(uAbstractFigure figura){
        this.figura = figura;
    }
    
    @Override
    public void draw(Graphics g){
        figura.draw(g);
    }

    @Override
    public Rectangle displayBox(){
        return figura.displayBox();
    }
    @Override
    public boolean containsPoint(int dx, int dy){
        return figura.containsPoint(dx, dy);
    }
    @Override
    public void moveBy(int dx, int dy){
        figura.moveBy(dx, dy);
    }
    @Override
    public IFigure clone(){
       return super.clone(); 
    }
}
