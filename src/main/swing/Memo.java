package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Memo extends BasicFrm {
    public static void main(String[] args) {
        new Memo(500, 500, "Memo");
    }

    public Memo(int width, int height, String title) {
        super(width, height, title);
    }
    private JPanel pnl;

    /* 상단 메뉴바 */
    private JMenuBar menuBar;
    private JMenu mnFile, mnInfo;
    private JMenuItem miOpen, miSave, miInfo, mihelp;

    JTextArea textArea;



    @Override
    public void init() {
        textArea = new JTextArea();
        pnl = new JPanel(); //패널!!!

        /* 상단 메뉴 옵션바 */
        menuBar = new JMenuBar();

        mnFile = new JMenu("File");
        mnFile.setMnemonic('F'); //alt + F누르면 file메뉴가 뜸

        mnInfo = new JMenu("info");
        mnInfo.setMnemonic('I'); //alt + I 누르면 info메뉴가 뜸


        miOpen = new JMenuItem("Open");
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
        miOpen.addActionListener( e -> System.out.println("Open"));

        miSave = new JMenuItem("Save");
        miInfo = new JMenuItem("Info");
        mihelp = new JMenuItem("Help");

        //옵션 넣기!
        mnFile.add(miOpen); mnFile.add(miSave); //File에 추가
        mnInfo.add(miInfo); mnInfo.add(mihelp); //Info에 추가

        //메뉴바에 추가하기
        menuBar.add(mnFile); menuBar.add(mnInfo);
        setJMenuBar(menuBar);

    }



    @Override
    public void arrange() {
        pnl.add(textArea);

        add(pnl, "North");

    }

}
