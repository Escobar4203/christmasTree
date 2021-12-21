
package chrismastree;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class Chrismastree extends Canvas{

    public void paint(Graphics g)  {
   
     
        
        g.setColor(Color.YELLOW);
        g.drawString(" MERRY CHRISMAS", 130, 30);
        g.setColor(Color.gray);
        g.fillRect(155, 260, 50, 60);
        setBackground(Color.BLUE);
        g.setColor(Color.green);
        g.fillArc(80, -100, 200, 300, -130, 80);
        g.fillArc(80, -60, 200, 300, -130, 80);
        g.fillArc(80, -20, 200, 300, -130, 80);
        g.setColor(Color.PINK);
        g.fillOval(150, 150, 20, 20);
        g.setColor(Color.ORANGE);
        g.fillOval(160, 100, 20, 20);
        g.setColor(Color.magenta);
        g.fillOval(190, 140, 20, 20);
        g.setColor(Color.red);
        g.fillOval(180, 190, 20, 20);
        g.setColor(Color.CYAN);
        g.fillOval(150, 200, 20, 20);
        //----------------------------------------------------------------------
      

    }

    public static void main(String[] args) {
        Chrismastree m = new Chrismastree();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
    }

}



