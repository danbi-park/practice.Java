package swing;

import javax.swing.*;
import java.awt.*;

public class LoginBox {
    public static void main(String[] args) {
        new SheetFrm(550,250,"Login");
    }
}


class LoginFrm extends BasicFrm{
    public LoginFrm(int width, int height, String title) {
        super(width, height, title);
    }



    private JPanel pnlNorth, pnlCenter, pnlSouth;
    private JLabel lbText, lbImage;

    private JTextField tfId;
    private JPasswordField pfPass;
    private JButton btnLogin, btnSignin;




    @Override
    public void init() {
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();
        lbText = new JLabel("Login");


        String imgPath = "src/images/penguin.jpg";
        ImageIcon icon = new ImageIcon(imgPath);
        Image img = icon.getImage();
        Image changedImg = img.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(changedImg);

        lbImage = new JLabel(icon1);
        tfId = new JTextField(10);
        pfPass = new JPasswordField(10);

    }

    @Override
    public void arrange() {
        pnlCenter.add(lbText);
        pnlCenter.add(lbImage);
        pnlSouth.add(tfId); pnlSouth.add(pfPass);

        add(pnlCenter, "North");
        add(pnlSouth, "Center");

    }


}