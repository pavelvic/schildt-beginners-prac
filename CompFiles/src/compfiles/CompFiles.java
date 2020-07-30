
package compfiles;
import java.io.*;

public class CompFiles {


    public static void main(String[] args) {
      int i=0, j=0, k = 1;
      
      //проверяем, что программе передаются имена обоих файлов
      if (args.length !=2) {
          System.out.println("Использование: CompFiles файл1 файл2");
          return;
      }
      
      //сравнить файлы
      
      try (FileInputStream f1 = new FileInputStream(args[0]);
           FileInputStream f2 = new FileInputStream(args[1])) 
      {
      //проверить содержимое каждого файла
        do {
          i = f1.read();
          j = f2.read();
          
          //приводим все к верхнему регистру, чтобы сделать сравнение файлов не чувствительным к регистру
          if (i>='a' & i<='z') i-=32;
          if (j>='a' & j<='z') j-=32;
          
            //System.out.println(i);
          if (i!=j) break;
          k++;
        } while (i!= -1 && j!= -1);
        if (i != j) System.out.println("Содержимое файлов отличается на позиции "+k);
        else System.out.println("Содержимое файлов совпадает");
      } catch (IOException exc) {
          System.out.println("Ошибка ввода-вывода: " + exc);
      
        }
      }
    }