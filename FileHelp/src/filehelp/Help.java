
package filehelp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Help {
    String helpfile; //имя файла со справкой
    
    //конструктор
    Help (String fname) {
      helpfile = fname;
    }
    
    //метод извлечения информации по заданной теме
    boolean helpon (String what) {
      int ch;
      String topic, info;
      
      //открыть справочный файл
      try (BufferedReader helpRdr = 
              new BufferedReader (new FileReader(helpfile))) 
      {
         do {
          //читаем пока не встретим #
            ch = helpRdr.read();
            if (ch == '#') {
              topic = helpRdr.readLine();
              if (what.compareTo(topic) == 0) {
                do {
                    info = helpRdr.readLine();
                    if (info != null) System.out.println(info);
                } while ((info != null) && (info.compareTo("")!=0));
                return true;
              }
            }
          } while (ch != -1);
      }
      catch (IOException exc) {
          System.out.println("Ошибка при попытке доступа к файлу справки");
          return false;
      }
    return false;
    }
    
    //метод для получения темы справки
    String getSelection () {
    String topic = "";
    
    BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("Укажите тему: ");
        try {
        topic = br.readLine();
        }
        catch (IOException exc) {
            System.out.println("Ошибка при чтении с консоли");
        }
    return topic;
    }
}
