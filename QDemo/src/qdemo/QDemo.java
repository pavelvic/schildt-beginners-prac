
package qdemo;

class Queue {
    private char q[];
    private int q_int[];
    private double q_doub[];
    private int putloc, getloc;
    
Queue (int size) { //конструктор объекта очереди класса
q = new char [size+1];
q_int = new int [size+1];
q_doub = new double [size+1];
putloc = getloc = 0;
}


//методы работы с очередью

//поместить символ в очередь
void put (char ch) {
  if (putloc == q.length-1) {
        System.out.println("- Очередь заполнена");
        return;
  }
putloc++;
q[putloc] = ch;
}

void put (int i) {
  if (putloc == q.length-1) {
        System.out.println("- Очередь заполнена");
        return;
  }
putloc++;
q_int[putloc] = i;
}

void put (double d) {
  if (putloc == q.length-1) {
        System.out.println("- Очередь заполнена");
        return;
  }
putloc++;
q_doub[putloc] = d;
}



char get_ch () {
if (getloc == putloc) {
    System.out.println("- Очередь пуста");
    return (char) 0;
}
getloc++;
return q[getloc];
}


int get_int () {
if (getloc == putloc) {
    System.out.println("- Очередь пуста");
    return (char) 0;
}
getloc++;
return q_int[getloc];
}

double get_doub () {
if (getloc == putloc) {
    System.out.println("- Очередь пуста");
    return (char) 0;
}
getloc++;
return q_doub[getloc];
}

}

public class QDemo {


    public static void main(String[] args) {
    Queue bigQueue = new Queue(100);
    //Queue smallQueue = new Queue(4);
    char ch;
    int i;
    double d;
    
    for (i=0;i<26;i++) bigQueue.put((char)('A' +i));
    for (i=0;i<26;i++) bigQueue.put(i);
    for (d = 0;d<1; d=d+0.1) bigQueue.put(d);
    
    System.out.print("biqQ_char: ");
    for (i=0;i<26;i++) System.out.print(bigQueue.get_ch()+" ");
    
    System.out.println();
    
    System.out.print("biqQ_int: ");
    for (i=0;i<26;i++) System.out.print(bigQueue.get_int()+" ");
    
    System.out.println();
    
    System.out.println("biqQ_double: ");
    for (d=0;d<1;d=d+0.1) System.out.println(bigQueue.get_doub()+ " ");
    
    System.out.println();
    
    
    }
    
}
