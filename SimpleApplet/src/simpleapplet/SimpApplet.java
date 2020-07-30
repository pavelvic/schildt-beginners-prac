
package simpleapplet;

import java.applet.*;
import java.awt.*;



public class SimpApplet extends Applet {

    
    public void paint(Graphics g) {
        g.drawString("Java makes applets easy", 20, 20);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
