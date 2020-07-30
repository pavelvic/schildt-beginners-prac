
package qpack;


public class DynQueue implements ICharQ {
    private char q[]; //массив для храрения элементов
    private int putloc, getloc; //индексы вставляемых и удаляемых элементов
    
    //конструктор пустой очереди
    public DynQueue (int size) {
      q = new char [size+1];
      putloc = getloc = 0;
    }
    
    public void put (char ch) {
      if (putloc == q.length-1) {
      //увеличить размер очереди
      char t[] = new char [q.length*2];
      
      //скопировать элементы в новую очередь
      for (int i=0; i <q.length;i++) t[i] = q[i];
      q=t;
      }
      putloc++;
      q[putloc] = ch;
    }
    public char get() {
      if (getloc == putloc) {
          System.out.println(" - Очередь пуста");
          return (char) 0;
      }
      getloc++;
      return q[getloc];
    
    
    }
    
    public void reset() {
        
        for (int i=0; i < q.length; i++) q[i] = (char) 0;
        putloc = getloc = 0;
        //System.out.println("Очередь очищена");
    }
    
    public int size() {
      return q.length-1;
    }
}
