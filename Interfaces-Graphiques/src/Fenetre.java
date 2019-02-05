import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    private JPanel pan = new JPanel();
    private JButton btn = new JButton("Mon Boutton");
    public Fenetre(){
        this.setVisible(true);
        this.setTitle("Ma première fenêtre Java");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null); // affiche la fenetre au centre
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // arrêter le processus lorsqu'on clique sur le croix rouge

        //ContentPane
        pan.setBackground(Color.ORANGE);

        //this.setContentPane(pan);
        //pan.add(btn);
        this.getContentPane().add(btn);
    }
}
