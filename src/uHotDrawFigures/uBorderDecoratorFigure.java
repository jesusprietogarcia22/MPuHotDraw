package uHotDrawFigures;
import java.awt.*;

public class uBorderDecoratorFigure extends uDecoratorFigure {

    public uBorderDecoratorFigure(IFigure figure) {
        super(figure);
    }
    
    @Override
    public void draw(Graphics g){
        super.draw(g);
        int dx = super.figura.displayBox().x;
        int dy = super.figura.displayBox().y;
        int h = super.figura.displayBox().height;
        int w = super.figura.displayBox().width;
        g.drawRect(dx,dy,h,w);
    }

}
