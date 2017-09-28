package uHotDrawFramework;

import Tools.ITool;
import Tools.uCreationTool;
import Tools.uPolyLineCreationTool;
import Tools.uSelectionTool;
import uHotDrawFigures.uPolyLineFigure;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import uHotDrawFigures.uEllipseFigure;
import uHotDrawFigures.uRectangleFigure;


public class uDrawingEditor extends JFrame implements ActionListener{
    protected uDrawingView view;
    private ArrayList<ITool> tool = new ArrayList();
    private ITool currentTool;
    private final  ITool eT;
    private final ITool rT;
    private final ITool pT;
    private final ITool sT;
    JButton b4,b5,b6,b7;
    
    public uDrawingEditor() {
        
        super();
        JPanel barraHerramientas = new JPanel();
        b4 = new JButton("Rectangle");
        b4.setActionCommand("r");
        b4.addActionListener(this);
        barraHerramientas.add(b4);
        b5 = new JButton("Ellipse");
        b5.setActionCommand("e");
        b5.addActionListener(this);
        barraHerramientas.add(b5);
        b6 = new JButton("Polyline");
        b6.setActionCommand("p");
        b6.addActionListener(this);
        barraHerramientas.add(b6);
        b7 = new JButton("Selection");
        b7.setActionCommand("s");
        b7.addActionListener(this);
        barraHerramientas.add(b7);
        uDrawing d = new uDrawing();
        view = new uDrawingView();
        
        view.setDrawingEditor(this);
         
        rT=new uCreationTool(this.view,new uRectangleFigure());
        eT=new uCreationTool(this.view,new uEllipseFigure());
        pT = new uPolyLineCreationTool(this.view,new uPolyLineFigure());
        sT = new uSelectionTool(this.view);
        
        this.getContentPane().setLayout(new BorderLayout());             
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add((uDrawingView)view, BorderLayout.CENTER);
       
        this.setVisible(true);
        this.pack();
    }

    public ArrayList<ITool> getTool() {
        return tool;
    }

    public void setTool(ArrayList<ITool> tool) {
        this.tool = tool;
    }

    public ITool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ITool currentTool) {
        this.currentTool = currentTool;
    }
    
    public uDrawingView getView() {
        return view;
    }

    public void setView(uDrawingView view) {
        this.view = view;
        this.setContentPane(view);
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {
        if ("e".equals(e.getActionCommand())) {
           
            setCurrentTool(eT);
        }
        if ("r".equals(e.getActionCommand())) {
            
            setCurrentTool(rT);
        }
        if ("p".equals(e.getActionCommand())) {
            
            setCurrentTool(pT);
        }
        if ("s".equals(e.getActionCommand())) {
            
            setCurrentTool(sT);
        }
    }

    
    
    
}
