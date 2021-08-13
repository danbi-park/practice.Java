package swing;

import javax.swing.*;
import java.awt.*;


public class LoginBox extends BasicFrm{
    public static void main(String[] args) {
        new LoginBox(400,150,"Login");
    }

    public LoginBox(int width, int height, String title) {
        super(width, height, title);
    }


    private JPanel pnlNorth, pnlCenter, pnlSouth;
    private JLabel id, pw;

    private JTextField tfId;
    private JPasswordField pfPass;
    private JButton btnLogin, btnCancel, btnSignin;



    @Override
    public void init() {
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();
        btnLogin = new JButton("로그인");
        btnSignin = new JButton("회원가입");
        btnCancel = new JButton("취소");


        id = new JLabel("ID               ");
        pw = new JLabel("password");
        tfId = new JTextField(10);
        pfPass = new JPasswordField(10);

    }

    @Override
    public void arrange() {

        pnlNorth.add(id);
        pnlNorth.add(tfId);
        pnlCenter.add(pw);
        pnlCenter.add(pfPass);
        pnlSouth.add(btnLogin);
        pnlSouth.add(btnSignin);
        pnlSouth.add(btnCancel);


        add(pnlNorth, "North");
        add(pnlCenter, "Center");
        add(pnlSouth, "South");

    }


}