package swing;

import javax.swing.*;
import java.awt.*;

class LoginFirm {
    public static void main(String[] args) {
        new SheetFrm(550,250,"Login");
    }
}

public class LoginBox extends BasicFrm{
    public LoginBox(int width, int height, String title) {
        super(width, height, title);
    }


    private JPanel pnlNorth, pnlCenter, pnlSouth;
    private JLabel id;
    private JLabel pw;

    private JTextField tfId;
    private JPasswordField pfPass;
    private JButton btnLogin, btnSignin;




    @Override
    public void init() {
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();

        id = new JLabel("ID");
        pw = new JLabel("password");
        tfId = new JTextField(10);
        pfPass = new JPasswordField(10);

    }

    @Override
    public void arrange() {
        pnlNorth.add(tfId);
        pnlCenter.add(tfId,pfPass);
        pnlSouth.add(btnLogin,"로그인");
        pnlSouth.add(btnSignin,"회원가입");


        add(pnlNorth, "North");
        add(pnlCenter, "Center");
        add(pnlSouth, "South");

    }


}