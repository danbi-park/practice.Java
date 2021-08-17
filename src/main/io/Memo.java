package io;

import swing.BasicFrm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.awt.SystemColor.text;
import static java.awt.TextArea.SCROLLBARS_BOTH;

public class Memo extends BasicFrm {
    public Memo(int width, int height, String title) {
        super(width, height, title);
    }

    public static void main(String[] args) {
        new Memo(500, 500, "Memo");
    }

    /* ------------------ 상단 메뉴바 ------------------ */
    private JMenuBar menuBar;
    private JMenu mnFile, mnEdit, mnHelp;


    //메뉴 아이템
    private JMenuItem miNew, miOpen, miSave, miPrint,     //File
                      miCut, miCopy, miPaste, miTimeDate, //Edit
                      miHelp, miFeedBack, miInfo;         //Help


    //날짜 설정
    private Object Date = new Date();
    SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss ");


    /* ------------------ text Area ------------------ */
    private JPanel centerPnl;
    private JPanel southPnl;
    private JTextArea ta;
    private JScrollPane scp;


    /* ------------------ chooser, saver ------------------ */

    private JFileChooser fc; //file 창 열기

    /* ------------------ Button ------------------ */
    private JButton btnSubmit, btnCancel;



    @Override
    public void init() {
        /* ------------------ 상단 메뉴 옵션바 초기화 ------------------ */
        menuBar = new JMenuBar();

        mnFile = new JMenu("File(F)");
        mnFile.setMnemonic('F'); //alt + F

        mnEdit = new JMenu("Edit(E)");
        mnEdit.setMnemonic('E'); //alt + E

        mnHelp = new JMenu("Help(H)");
        mnHelp.setMnemonic('H'); //alt + H


        fc = new JFileChooser();
        //단축키 설정
        miNew = new JMenuItem("New");
        miNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
        miNew.addActionListener(e->{
            ta.setText("");
        });



        miOpen = new JMenuItem("Open");
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
        miOpen.addActionListener(e -> {
            int returnVal = fc.showOpenDialog(this);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                //실제 파일을 오픈
                BufferedReader br = null;
                String fn = fc.getSelectedFile().toString();
                try {
                    FileReader fr = new FileReader(fn);
                    br = new BufferedReader(fr);
                    StringWriter sw = new StringWriter(); //문자를 담는 변수?
                    String line = "";
                    while((line = br.readLine())!=null){
                        sw.write(line); sw.write('\n');
                    }
                    ta.setText(sw.toString());
                    String tmp = fn.substring(fn.lastIndexOf("\\")+1);// 역슬래시 \\
                    setTitle(tmp);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            } else {
                //사용자가 파일을 열지 않음. 취소함
            }
        });


        miSave = new JMenuItem("Save");
        miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK));
        miSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fc.showSaveDialog(getParent());
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    //save
                    BufferedWriter bw = null;
                    String fn = fc.getSelectedFile().toString();
                    try {
                        FileWriter fw = new FileWriter(fc.getSelectedFile().toString());
                        bw = new BufferedWriter(fw);
                        bw.write(ta.getText());
                        setTitle(fn);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } finally{
                        try {
                            if(bw != null) bw.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }else{
                    //cancel
                }
            }
        });

        miPrint = new JMenuItem("Print");
        miPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK));
        miPrint.addActionListener( e -> System.out.println("인쇄하기"));

        miCut = new JMenuItem("Cut");
        miCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK));
        miCut.addActionListener( e -> System.out.println("잘라내기"));

        miCopy = new JMenuItem("Copy");
        miCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));
        miCopy.addActionListener( e -> System.out.println("복사하기"));

        miPaste = new JMenuItem("Paste");
        miPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK));
        miPaste.addActionListener( e -> System.out.println("붙여넣기"));

        miTimeDate = new JMenuItem("Time/Date");

        miTimeDate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, Event.CTRL_MASK));
        miTimeDate.addActionListener( e -> System.out.println(date.format(new Date())));

        miHelp = new JMenuItem("Help");
        miHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, Event.CTRL_MASK));
        miHelp.addActionListener( e -> System.out.println("도움말"));

        miFeedBack = new JMenuItem("Feedback");
        miFeedBack.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, Event.CTRL_MASK));
        miFeedBack.addActionListener( e -> System.out.println("피드백보내기"));

        miInfo = new JMenuItem("Info");
        miInfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK));
        miInfo.addActionListener( e -> System.out.println("메모장 정보"));




        //옵션 안에 넣기!
        mnFile.add(miNew); mnFile.add(miOpen); mnFile.add(miSave); mnFile.add(miPrint); //File에 추가
        mnEdit.add(miCut); mnEdit.add(miCopy); mnEdit.add(miPaste); mnEdit.add(miTimeDate); //Edit에 추가
        mnHelp.add(miHelp); mnHelp.add(miFeedBack); mnHelp.add(miInfo); //Help에 추가

        //메뉴바에 추가하고 set!
        menuBar.add(mnFile); menuBar.add(mnEdit); menuBar.add(mnHelp);
        setJMenuBar(menuBar);

        /* ------------------ TextArea 초기화 ------------------ */
        centerPnl = new JPanel();

        setLayout(new BorderLayout());
        ta = new JTextArea("내용을 입력하세요",23,30);
        scp = new JScrollPane(ta);
        add(scp, BorderLayout.CENTER);


        /* ------------------ Button 초기화 ------------------ */
        southPnl = new JPanel();
        setLayout(new BorderLayout());
        btnSubmit = new JButton("제출");
        btnCancel = new JButton("취소");
    }


    @Override
    public void arrange() {
        /* text Area */
        centerPnl.add(scp);
        add(centerPnl,BorderLayout.CENTER);

        /* buttons */
        southPnl.add(btnSubmit);
        southPnl.add(btnCancel);
        add(southPnl,BorderLayout.SOUTH);

    }
}
