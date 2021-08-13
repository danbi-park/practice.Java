package swing;

import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;

import javax.swing.*;

public class ComponentsEx {
    public static void main(String[] args) {
        new MyComponents(700, 300, "Components");
    }
}

class MyComponents extends BasicFrm {
    JPanel pnlNorth, pnlCenter, pnlSouth;
    JRadioButton[] rbGender;
    JCheckBox[] cbHobby;
    ButtonGroup group;
    JTextArea ta;
    JScrollPane scp;
    JDatePanel datePanel;
    JDatePicker datePicker;


    public MyComponents(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        //초기화를 먼저 시켜주어야 한다! (순서주의)
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();
        pnlNorth = new JPanel();

        //datepicker 초기화
        datePanel = new JDatePanel();
        datePicker = new JDatePicker();
        datePanel.add(datePicker);

        rbGender = new JRadioButton[2];
        cbHobby = new JCheckBox[2];
        group = new ButtonGroup();


        String[] genders = {"Female","Male"};
        String[] hobbys = {"Reading","Music"};
        for (int i = 0; i < genders.length; i++) {
            cbHobby[i] = new JCheckBox(hobbys[i]);
            rbGender[i] = new JRadioButton(genders[i],(i==0)?true:false); //체크가 되서 나옴
            group.add(rbGender[i]); //이렇게 그룹으로 묶어줘야 함
            pnlCenter.add(cbHobby[i]);
            pnlSouth.add(rbGender[i]); //group으로 묶였지만 add 페널로 추가함
        }

        ta = new JTextArea(10, 20);
        scp = new JScrollPane(ta);
    }

    @Override
    public void arrange() {
        pnlNorth.add(datePanel);
        pnlNorth.add(datePicker);
        pnlNorth.add(scp);
        add(pnlNorth,"North");
        add(pnlCenter,"Center"); //이렇게 안하면 겹침
        add(pnlSouth, "South");
    }

}