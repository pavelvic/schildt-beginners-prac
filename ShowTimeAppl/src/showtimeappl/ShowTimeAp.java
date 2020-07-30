
package showtimeappl;

import java.applet.*;
import java.awt.*;
import java.text.*;
import java.util.*;


public class ShowTimeAp extends Applet implements Runnable {
String msg;
Thread t;
boolean stopFlag;
SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    

    public void init() {
        t = null;// TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    
        public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    public void run() {
        //перерисовать баннер
        for (;;) {
            try {
                repaint();
                Thread.sleep(1000);
                if (stopFlag) {
                    break;
                }
            } catch (InterruptedException exc) {
            }
        }
    }

    public void stop() {
        stopFlag = true;
        t = null;
    }

    //отобразить баннер
    public void paint(Graphics g) {
    GregorianCalendar date = new GregorianCalendar();    
        
        
        msg = dateFormat.format(date.getTime());
        
        g.drawString(msg, 50, 30);
    }
}
