
package genqdemo;


public interface IGenQ<T> {
    void put (T ch) throws QueueFullException; //поместить в очередь
    T get() throws QueueEmptyException; //извлечь из очереди
}
