
package stack;


public class FullStackException extends Exception {
    int size;
    public FullStackException (int s) {
    size = s;
    }
    
    public String toString() {
    return "Стэк заполнен. Размер: "+size;
    }
}
