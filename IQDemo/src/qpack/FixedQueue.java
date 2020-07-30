
package qpack;

//класс реализующий очередь фксированного размера для хранения символов
public class FixedQueue implements ICharQ {
    private char q[]; //массив для хранения элементов очереди
    private int putloc, getloc; //индексы
    
    //конструктор очереди заданного размера
    public FixedQueue (int size) {
      q = new char[size+1]; //выделить память для очереди
      putloc = getloc = 0;    
    }
    
    //поместить символ в очередь
    public void put (char ch) throws QueueFullException {
      if (putloc==q.length-1)  throw new QueueFullException(q.length-1);
    putloc++;
    q[putloc] = ch;
    }
    
    //извлечь символ из очереди
    public char get() throws QueueEmptyException {
      if (getloc == putloc) throw new QueueEmptyException();
      getloc++;
      return q[getloc];
    }

    
    public void reset() {
        
        //for (int i=0; i < q.length; i++) q[i] = (char) 0;
        q = new char[q.length];
        putloc = getloc = 0;
       // System.out.println("Очередь очищена");
    }
    
    public int size() {
      return q.length-1;
    }
    
}
