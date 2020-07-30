package firstswingdemo;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FirstSwingDemo implements ActionListener {

    JLabel jlab;

    FirstSwingDemo() {
        //создать новый контейнер JFrame
        JFrame jfrm = new JFrame("A simple Swing Application");

        //начальные размеры фрейма
        jfrm.setSize(275, 100);

        jfrm.setLayout(new FlowLayout());

        //*завершить работу программы когда пользователь закрываем приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //создадим кнопки
        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");

        //создадим слушателя действий
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        jlab = new JLabel("Press a button");
        //добавить метку в панель содержимого
        jfrm.add(jlab);
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        //показать фрейм
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Up")) {
            jlab.setText("Up");
        } else {
            jlab.setText("Down");
        }
    }

    public static void main(String[] args) {
        //создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FirstSwingDemo();
            }
        });
    }

}
