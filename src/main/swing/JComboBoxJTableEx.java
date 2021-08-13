package swing;

import org.jdatepicker.JDatePicker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JComboBoxJTableEx {

    public static void main(String[] args) {
        new SheetFrm(700,500,"Sheet");
    }
}

class SheetFrm extends BasicFrm{
    public SheetFrm(int width, int height, String title) {
        super(width, height, title);
    }

    private String[] arr; //커피 메뉴
    /* 상단 메뉴바 */
    private JMenuBar menuBar;
    private JMenu mnFile, mnInfo;
    private JMenuItem miOpen, miSave, miInfo, mihelp;

    private JPanel pnl;
    /* 체크박스와 텍스트 넣기, 날짜 */
    JComboBox<String> cb;
    JTextField tf;

    JDatePicker dp;

    private JButton btnAdd, btnDel;
    /* 테이블 생성 (model) */
    private JTable table;
    private JScrollPane pane;

    private DefaultTableModel model;


    @Override
    public void init() {
        /* 테이블 생성 (model) */
        model = new DefaultTableModel(new String[]{"Date","Item","E/A"},0); //table속성
        table = new JTable(model);
        pane = new JScrollPane(table);

        /* 체크박스와 텍스트 넣기, 날짜 */
        tf = new JTextField(10);
        dp = new JDatePicker();

        /* 추가, 삭제 버튼만들기 */
        btnAdd = new JButton("Add");
        btnDel = new JButton("Del");
        //추가기능!
        btnAdd.addActionListener(new ActionListener() {  //interface의 이름으로 익명객체 만듦
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar valDate = (Calendar) dp.getModel().getValue();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal = (Calendar) valDate;
                String dateStr = sdf.format(cal.getTime());
                String item = cb.getSelectedItem().toString();
                String ea = tf.getText().toString();
                String[] arrRow = {dateStr, item, ea};
                model.addRow(arrRow);

            }
        });
        //삭제기능!
        btnDel.addActionListener(e -> { //이렇게 Lambda식으로도 작성 가능!
            int row = table.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this,"No selected Row");
                return;
            }
            model.removeRow(row);
        });




        /* 커피메뉴와 데이터 추가할 패널만들기 */
        arr = new String[]{"IceAmericano","Cappuccino","DolceLatte","Coco","Milk"};
        cb = new JComboBox<>(arr);
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
        pnl.add(dp);
        pnl.add(cb);
        pnl.add(tf);
        pnl.add(btnAdd);
        pnl.add(btnDel);

        add(pnl, "North");
        add(pane, "Center");

    }
}