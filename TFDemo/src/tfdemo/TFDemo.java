
package tfdemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class TFDemo implements ActionListener {
    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;
    
    TFDemo () {
        //создать контейнер
        JFrame jfrm = new JFrame ("Use a text Field");
        
        //уточняем компоновку
        jfrm.setLayout(new FlowLayout());
        
        //исходные размеры фрейма
        jfrm.setSize(240,120);
        
        //завершение программы вместе с закрытием окна
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //создать текстовое поле
        jtf = new JTextField(10);
        
        //установить команду дейсвтия для текстового поля
        jtf.setActionCommand("myTF");
        
        //оздать кнопку Reverse
        jbtnRev = new JButton("Reverse");
        
        //добавить слушатетей событий
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);
        
        //создать надписи
        jlabPrompt = new JLabel("Enter text");
        jlabContents = new JLabel("");
        
        //добавить компоненты в панель
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);
        
        //показать фрейм
        jfrm.setVisible(true);
            
    }        
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getActionCommand().equals("Reverse"))   {
          //была нажата Reverse
          String orgStr = jtf.getText();
          String resStr="";
          
          //обратить строку 
          for (int i = orgStr.length()-1; i>=0; i--)
              resStr +=orgStr.charAt(i);
          //сохранить строку в текстовом поле
          jtf.setText(resStr);}
      
      else  {
      jlabContents.setText("You pressed ENTER. Text is " +jtf.getText());
      }
    }
    
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }


    
}
