package genqdemo;

public class GenCircularQueue<T> implements IGenQ<T> {

    private T q[]; //массив для хранения элементов
    private int putloc, getloc; //индексы вставляеых и извлекаемых элементов

    //конструктор пустой очереди заданного размера
    public GenCircularQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    //реадизация метода интерфейса put переопределение
    public void put(T ch) throws QueueFullException {
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            throw new QueueFullException(q.length);
        }

        putloc++;
        if (putloc == q.length) {
            putloc = 0;
        }
        q[putloc] = ch;
    }

    public T get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        getloc++;
        if (getloc == q.length) {
            getloc = 0;
        }
        return q[getloc];
    }

}
