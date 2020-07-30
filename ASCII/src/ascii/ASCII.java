
package ascii;

import java.io.IOException;


public class ASCII {

//большие буквы 65-90, маленькие 97-122
    public static void main(String[] args) throws IOException {
        char ch, ignore;
        int chcount=0;
       
        StringBuilder result = new StringBuilder("");
        
        
        for (;;) {
           ch = (char) System.in.read();
           do {
        ignore = (char) System.in.read();
        
        } while (ignore != '\n');
           
        if (ch=='.') {System.out.println("Спасибо"); result.append("."); break;}
           
         if ((ch>=65) && (ch<=90)) {
         ch+=32;
         
         result.append(ch);
         chcount++;
         }
         else if ((ch>=97) && (ch<=122)) {
         ch-=32;
         result.append(ch);
         chcount++;
         } else result.append(ch);
            
        }
        System.out.println("Преобразована строка: "+result);
        System.out.println("Преобразовано символов: "+chcount);
    }
}
