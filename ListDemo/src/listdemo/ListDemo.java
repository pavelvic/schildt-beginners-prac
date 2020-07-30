package listdemo;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;




public class ListDemo implements ListSelectionListener {

    JList<String> jlist;
    JLabel jlab;
    JScrollPane jscrlp;
    
    //массив имен
    String names[] = {"Sheryy", "Jon","Rachel","Sasha",
                      "Josselyn","Randy","Tom","Mary","Gucch",
                      "Andrew","Matt","Todd"};
    
    ListDemo () {
    JFrame jfrm = new JFrame("JList Demo");
    jfrm.setLayout(new FlowLayout());
    
    jfrm.setSize(200, 160);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jlist = new JList<String>(names);
    jlist.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    jscrlp = new JScrollPane(jlist);
    jscrlp.setPreferredSize(new Dimension(120, 90));
    jlab = new JLabel("Please choose a name");
    jlist.addListSelectionListener(this);
    jfrm.add(jscrlp);
    jfrm.add(jlab);
    
    jfrm.setVisible(true);
    
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        //получить индекс элемента, состояние которого было изменено
        int idx[] = jlist.getSelectedIndices();
        String result = "";
        for (int i =0; i<idx.length; i++) result = result +names[idx[i]]+" ";
        // Отобрзаить результат, если элемент выбран 
        if (idx.length != 0) jlab.setText("Current selection: "+result);
        else jlab.setText("Please choose a name");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new ListDemo();
            }
        });
    }
    
}
