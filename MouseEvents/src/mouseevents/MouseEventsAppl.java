package mouseevents;

import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;





public class MouseEventsAppl extends Applet implements MouseListener, 
        MouseMotionListener, MouseWheelListener {
    String msg;
    int mX,mY=0;

    public void init() {
        addMouseListener(this);
        addMouseWheelListener(this);
        addMouseMotionListener(this);
    }
    
    public void paint(Graphics g) {
        g.drawString(msg, mX, mY);
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mX=0;
        mY=10;
        msg = "Кликнуто";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mX = e.getX();
        mY = e.getY();
        msg = "Нажато";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mX = e.getX();
        mY = e.getY();
        msg = "Отпущено";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mX=0;
        mY=10;
        msg = "Наведено на область";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mX=0;
        mY=10;
        msg = "Вышло из области";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mX = e.getX();
        mY = e.getY();
        msg = "*";
        showStatus("Перетаскиваем в "+mX+", "+mY);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        showStatus("Перемещаем в "+e.getX()+", "+e.getY());
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        mX=0;
        mY=10;
        msg = "Крутим колесико";
      repaint();
              
    }

    
}
