package io;

import swing.BasicFrm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

public class NotePad {
    public static void main(String[] args) {
        new Note(800,500,"Note");
    }
}

class Note extends BasicFrm {
    JMenuBar menuBar = new JMenuBar();
    JMenu mnFile, mnEdit, mnForm, mnView, mnHelp;
    JMenuItem miNew, miWindow, miOpen, miSave, miPrint,miExit, miUndo, miFont, miZoom, miHelp;
    JTextArea ta;
    JScrollPane scp;
    JFileChooser fc;

    public Note(int width, int height, String title) {super(width, height, title);}

    @Override
    public void init() {
        ta = new JTextArea(10,80);
        menuBar = new JMenuBar();
        mnFile = new JMenu("File");
        mnFile.setMnemonic('F');
        mnEdit = new JMenu("Edit");
        mnEdit.setMnemonic('E');
        mnForm = new JMenu("Form");
        mnForm.setMnemonic('F');
        mnView = new JMenu("View");
        mnView.setMnemonic('V');
        mnHelp = new JMenu("Help");
        mnHelp.setMnemonic('H');

        miNew = new JMenuItem("New");
        miWindow = new JMenuItem("Window");
        miOpen = new JMenuItem("Open");
        miSave = new JMenuItem("Save");
        miPrint = new JMenuItem("Print");
        miExit = new JMenuItem("Exit");
        miUndo = new JMenuItem("Undo");
        miFont = new JMenuItem("Font");
        miZoom = new JMenuItem("Zoom");
        miHelp = new JMenuItem("Help");
        fc = new JFileChooser();
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
        miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK));
        miOpen.addActionListener(e -> {
            int returnVal = fc.showOpenDialog(this);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                //실제 파일을 오픈
                BufferedReader br = null;
                String fn =fc.getSelectedFile().toString();
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
        miSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fc.showOpenDialog(getParent());
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    //save
                    BufferedWriter bw = null;
                    String fn = fc.getSelectedFile().toString();
                    try {
                        FileWriter fw = new FileWriter(fn);
                        bw = new BufferedWriter(fw);
                        bw.write(ta.getText());
                        setTitle(fn);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }finally {
                        try {
                            if(bw!=null) bw.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                } else {
                    //cancel
                }
            }
//        pnl = new JPanel();
        });
        miNew.addActionListener(e->{
            ta.setText("");
        });
        mnFile.add(miNew);
        mnFile.add(miWindow);
        mnFile.add(miOpen);
        mnFile.add(miSave);
        mnFile.add(miPrint);
        mnFile.add(miExit);
        mnEdit.add(miUndo);
        mnForm.add(miFont);
        mnView.add(miZoom);
        mnHelp.add(miHelp);
        menuBar.add(mnFile);
        menuBar.add(mnEdit);
        menuBar.add(mnForm);
        menuBar.add(mnView);
        menuBar.add(mnHelp);
        setJMenuBar(menuBar);
        scp = new JScrollPane(ta);
    }

    @Override
    public void arrange() {
//        pnl.add(ta);
        add(scp,"Center");
    }
}