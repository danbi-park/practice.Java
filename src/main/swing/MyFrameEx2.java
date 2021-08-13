package swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MyFrameEx2 extends BasicFrm{
    public static void main(String[] args) {
        new MyFrameEx2(500, 300, "componets");
    }

    private JPanel pnlCenter, pnlSouth;
    private JLabel lbText, lbImage;//surface를 찍어냄 텍스트
    private JTextField tfName;
    private JPasswordField pfPass;


    public MyFrameEx2(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        pnlCenter = new JPanel(); pnlSouth = new JPanel();
        lbText = new JLabel("Basic component");

        String imgPath = "src/images/penguin.jpg";
        ImageIcon icon = new ImageIcon(imgPath);
        Image img = icon.getImage();
        Image changedImg = img.getScaledInstance(150,150,Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(changedImg);

        lbImage = new JLabel(icon1);
        tfName = new JTextField(10);
        pfPass = new JPasswordField(10);

    }

    @Override
    public void arrange() {
        pnlCenter.add(lbText);  pnlCenter.add(lbImage);
        pnlSouth.add(tfName); pnlSouth.add(pfPass);

        add(pnlCenter, "North");
        add(pnlSouth, "Center");

    }


}
