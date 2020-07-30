package genqdemo;

public class GenDynQueue<T> implements IGenQ<T> {

    private T q[]; //массив для храрения элементов
    //private T t[];
    private int putloc, getloc; //индексы вставляемых и удаляемых элементов

    //конструктор пустой очереди
    public GenDynQueue(T[] o) {
        q = o;
        putloc = getloc = 0;
    }

    @Override
    public void put(T ch) throws QueueFullException {
        if (putloc == q.length - 1) {
            //увеличить размер очереди
            //char t[] = new char[q.length * 2];
            T t[] = (T[]) new Object[q.length * 2];

            //скопировать элементы в новую очередь
            for (int i = 0; i < q.length; i++) t[i] = q[i];
            q = t;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public T get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        getloc++;
        return q[getloc];

    }

}
