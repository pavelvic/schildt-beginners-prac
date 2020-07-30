
package qpack;

public interface ICharQ {
    void put (char ch) throws QueueFullException; //добавить символ в очередь
    char get() throws QueueEmptyException; //извлечь символ из очереди
    void reset(); //сброс
    int size(); //размер очереди
}
