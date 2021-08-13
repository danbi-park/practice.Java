package swing;

import javax.swing.*;
import java.awt.*;

public class MyFrameEx1 {
    public static void main(String[] args) {
        new MyFrm1(500, 300, "");
    }
}


class MyFrm1 extends BasicFrm{
    private JButton[] btns;
    private String[] arr;
    private JPanel[] pnl;


    public MyFrm1(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        pnl = new JPanel[5];
        btns = new JButton[5];
        arr = new String[]{"North", "South", "Center", "East", "West"};
        for (int i = 0; i < btns.length; i++) {
            pnl[i] = new JPanel();
            btns[i] = new JButton(arr[i]);
            pnl[i].add(btns[i],arr[i]);
            add(pnl[i]);
        }
    }

    @Override
    public void arrange() {
        setLayout(new BorderLayout()); //기본레이아웃
//      setLayout(new FlowLayout()); //순서대로 자신의 크키로
//      setLayout(null); //Absoulte Layout 절대배치(JFrame이 좌표를 정해줘야함)

        setLayout(new GridLayout(2,3)); //그리드로 2행 3열 화면분할
    }

}

