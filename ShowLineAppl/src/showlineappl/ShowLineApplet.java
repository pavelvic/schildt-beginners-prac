
package showlineappl;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;


public class ShowLineApplet extends Applet implements MouseMotionListener, MouseListener {
int mouseX1, mouseY1, mouseX2, mouseY2 = 0;
boolean draw;
    public void init() {
        addMouseMotionListener(this);
        addMouseListener(this);
        draw = false;
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void mouseDragged(MouseEvent me) {
        mouseX2 = me.getX();
        mouseY2 = me.getY();
        repaint();
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
    }
    
    public void paint (Graphics g) {
        
    if (draw) g.drawLine(mouseX1, mouseY1, mouseX2, mouseY2);
    
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
        mouseX1 = me.getX();
        mouseY1 = me.getY();
        draw = true;
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    showStatus(" "+mouseX1+" "+mouseY1 +" "+ mouseX2 +" "+mouseY2);
    draw = false;
    repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
}
