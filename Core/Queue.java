package Core;


    import java.util.ArrayList;
    public class Queue {
// Generic 
public class Queue<E> {

    public ArrayList<E> list;

    public MyQueue() {
        list = new ArrayList<>();
    }

    void add(E obj) {
        list.add(obj);
    }

    void pop() {
        if(list.size() > 0) {
            // For Stack
            // list.remove(list.size()-1);
            list.remove(0);
        }   
    }

    @Override
    public String toString() {
        return list.toString();
    }
    
}
}
