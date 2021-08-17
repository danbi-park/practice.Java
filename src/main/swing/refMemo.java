package swing;

import javax.swing.*;
import java.awt.*;

public class refMemo extends JFrame {
    public refMemo() {
        setTitle("메모장");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new CenterPanel(),BorderLayout.CENTER);
        c.add(new SouthPanel(),BorderLayout.SOUTH);
        setSize(300,300);
        setLocationRelativeTo(this); //setSize뒤에
        setVisible(true);
    }
    class CenterPanel extends JPanel {
        public CenterPanel() {
            setLayout(new BorderLayout());
            JTextArea ta = new JTextArea();
            JScrollPane sp = new JScrollPane(ta);
            add(sp, BorderLayout.CENTER);
        }
    }
    class SouthPanel extends JPanel {
        public SouthPanel() {
            setLayout(new FlowLayout());
            add(new JButton("확인"));
            add(new JButton("취소"));
        }
    }

    public static void main(String[] args) {
        new refMemo();
    }

}