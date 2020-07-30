
package qpack;

//кольцевая очередь
public class CircularQueue implements ICharQ {
    private char q[]; //массив для хранения элементов
    private int putloc, getloc; //индексы вставляеых и извлекаемых элементов
    
    //конструктор пустой очереди заданного размера
    public CircularQueue (int size) {
    q = new char[size+1];
    putloc = getloc = 0;
    }
    
    //реадизация метода интерфейса put переопределение
    public void put (char ch) {
      if (putloc+1 == getloc | ((putloc == q.length-1) &(getloc==0))) {
          System.out.println(" - Очередь заполнена");
          return;
      }
      
      putloc++;
      if (putloc == q.length) putloc = 0;
      q[putloc] = ch;
    }
    
    public char get() {
      if (getloc == putloc) {
          System.out.println(" - Очередь пуста");
          return (char) 0;
      }
    getloc++;
    if (getloc == q.length) getloc = 0;
    return q[getloc];
    }
    
    public void reset() {
        
        for (int i=0; i < q.length; i++) q[i] = (char) 0;
        putloc = getloc = 0;
       // System.out.println("Очередь очищена");
    }
    
    public int size() {
      return q.length-1;
    }
}
