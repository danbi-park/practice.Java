package object2;

import java.awt.*;
import java.awt.event.*;
class Ex09{
    public static void main(String[] args)  {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
        f.setSize(500,300);
        f.setTitle("window를 열었어요");
        f.setVisible(true);
    }
}

class EventHandler extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
