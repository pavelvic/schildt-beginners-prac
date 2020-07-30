
package genqdemo;


public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) { size = s;    }
    public String toString() {
    return "\nОчередь заполнена. Максммальный размер очереди" + size;
    }
    
}
