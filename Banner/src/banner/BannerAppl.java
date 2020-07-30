package banner;

import java.applet.*;
import java.awt.*;


public class BannerAppl extends Applet implements Runnable {

    String msg = "Java rules the Web"; //текст баннера
    Thread t; //поток для аниации баннера
    boolean stopFlag; //признак остановки потока анимации

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        t = null; //инициализируем поток   
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
                Thread.sleep(Integer.parseInt(getParameter("delayTimeMs")));
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
        char ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
