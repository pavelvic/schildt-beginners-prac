package swingfc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener, ItemListener {

    JTextField jtfFirst, jtfSecond; //хранит имена файлов
    JButton jbtnComp; //кнопка сравнения
    JLabel jlabFirst, jlabSecond, jlabResult; //подсказки и результат
    JCheckBox jShowMism;//флажок показывать первую позицию расхождения

    SwingFC() {
        JFrame jfrm = new JFrame("Compare files");
        jfrm.setLayout(new FlowLayout());
        
        jfrm.setSize(200, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        //jtfFirst.setActionCommand("fileA");
        //jtfSecond.setActionCommand("fileB");

        jbtnComp = new JButton("Compare");
        jbtnComp.addActionListener(this);

        jlabFirst = new JLabel("First file");
        jlabSecond = new JLabel("Second file");
        jlabResult = new JLabel("");
        
        jShowMism = new JCheckBox("Show mismatch position");

        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jShowMism);
        jfrm.add(jlabResult);
        
        

        jfrm.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int i, j, pos = 0;
        
        if (jtfFirst.getText().equalsIgnoreCase("")) {
            jlabResult.setText("First file name missing");
            return;
        }

        if (jtfSecond.getText().equalsIgnoreCase("")) {
            jlabResult.setText("Second file name missing");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
                FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            do {
                i = f1.read();
                j = f2.read();
                pos=pos+1;
                if (i != j)  { break;}
                

            } while (i != -1 && j != -1);

            
            if (i != j) {
               if(jShowMism.isSelected()) jlabResult.setText("Files are not the same at pos "  + pos);
               else jlabResult.setText("Files are not the same");
                
            } else {
                jlabResult.setText("Files Compare equal");
            }

        } catch (IOException exc) {
            jlabResult.setText("File Error");
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingFC();
            }
        });
    }


}
