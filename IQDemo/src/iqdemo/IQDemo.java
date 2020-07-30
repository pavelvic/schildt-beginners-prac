package iqdemo;

import qpack.CircularDynQueue;
import qpack.CircularQueue;
import qpack.FixedQueue;
import qpack.DynQueue;
import qpack.ICharQ;
import qpack.QueueEmptyException;
import qpack.QueueFullException;

public class IQDemo {

    //q - исходная очередь, copyofq - копия исходной очереди
//    public static void copy (ICharQ q, ICharQ copyofq) {
//    copyofq.reset();
//    
//    
//    char t[] = new char[q.size()];  
//    int i=-1;    
//        //извлекаем элементы из исходной очереди и помещаем во временный массив
//    do {
//    i++;
//        t[i] = q.get();
//    } while (t[i] != (char) 0);
//        
//
//    //сбрасываем исходную очередь
//        q.reset();
//
//        //заполняем копию и исходную
//         for (int x=0; x<i;x++) {
//            copyofq.put(t[x]);
//            q.put(t[x]);
//        }
//    }
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
//      FixedQueue q1 = new FixedQueue(10);
//      DynQueue q2 = new DynQueue(5);
//      CircularQueue q3 = new CircularQueue(10);
//      CircularDynQueue q4 = new CircularDynQueue(3);
//      FixedQueue copyofq = new FixedQueue(10);
//      
//      
//      ICharQ iQ;
        char ch;
        int i;
//      
//      iQ=q1;
//      //поместить ряд символов в очередь фиксированного размера
//      for (i=0; i<10; i++)
//          iQ.put((char) ('A' + i));
//      
//      //отобразить содержимое очереди
//        System.out.print("Содержимое фиксированной очереди: ");
//        for (i=0;i<10;i++) {
//        ch = iQ.get();
//            System.out.print(ch);
//        }
//        System.out.println();
//        
//        iQ = q2;
//        //поместить ряд символов в динамическую очередь
//        for (i=0;i<10;i++)
//            iQ.put((char) ('Z'-i));
//        
//        
//        //отобразить содержимое очереди
//        System.out.print("Содержимое динамической очереди: ");
//        for (i=0;i<10;i++) {
//        ch = iQ.get();
//            System.out.print(ch);
//        }
//        System.out.println("");
//        
//        iQ = q3;
//        //поместить ряд символов в кольцевую очередь
//        for (i=0;i<10;i++)
//            iQ.put((char) ('A'+i));
//        
//        //отобразить содержимое очереди
//        System.out.print("Содержимое кольцевой очереди: ");
//        for (i=0;i<10;i++) {
//        ch = iQ.get();
//            System.out.print(ch);
//        }
//        
//        System.out.println();
//        
//        //поместить больше символов в кольцевую очередь
//        for (i=10;i<20;i++)
//            iQ.put((char) ('A'+i));
//        
//        //отобразить содержимое очереди
//        System.out.print("Содержимое кольцевой очереди: ");
//        for (i=0;i<10;i++) {
//        ch = iQ.get();
//            System.out.print(ch);
//        }
//        System.out.println();
//        
//        System.out.println("Сохранение и использование данных кольцевой очереди");
//        for (i=0; i<20; i++) {
//        iQ.put((char) ('A'+i));
//        ch = iQ.get();
//            System.out.print(ch);
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        
//        q2.reset();
//        q2.put('A');
//        q2.put('B');
//        q2.put('С');
//        copy(q2, copyofq);
//      
//        
//          System.out.println(copyofq.get());
//          System.out.println(copyofq.get());
//          System.out.println(copyofq.get());
////        System.out.println(copyofq.get());
////        System.out.println(copyofq.get());
//        
//        
//        
        try {
            //переполнение очереди
            for (i = 0; i < 11; i++) {
                System.out.print("Попытка сохранения: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();

        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (i = 0; i < 11; i++) {
                System.out.print("Получение очередного символа: ");
                ch = q.get();
                System.out.println(ch);
            }

        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

    }

}
