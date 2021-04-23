import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GameBoard extends JPanel {    
    int xcells = 30;    
    int ycells = 30;  /* add ";" to each sentence*/
    int szcell = 10;       
       
    public GameBoard() {
        setPreferredSize(new Dimension(xcells * szcell, ycells * szcell));        
        setBackground(Color.black); /*change color to Color*/
        setFocusable(true);        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
}
