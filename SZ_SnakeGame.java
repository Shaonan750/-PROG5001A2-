import java.awt.EventQueue;
import javax.swing.JFrame; /* import java JFrame*/

public class SZ_SnakeGame extends JFrame {

    public SZ_SnakeGame(String gameTille) {        
        setTitle(gameTille);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();        
    }
    
    public static void main(String[] args) {        
        EventQueue.invokeLater(() -> {
            //create the game with a game title as follow: The Snake Game (C) Your_Name
            JFrame sgame = new SZ_SnakeGame("SnakeGame"); /*add string name*/
            sgame.setVisible(true);
        });
    }
}
