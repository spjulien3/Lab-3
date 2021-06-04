/*Samuel Julien
* Lab 3
* 9-18-17*/
import java.util.ArrayList;
public class MyStack<E> extends ArrayList<E> {
    public boolean isEmpty() {
        return isEmpty();
        }
    public int getSize() {
         return size();
        }
    public Object peek() {
         return get(getSize() - 1);
        }
    public Object pop() {
         Object o = get(getSize() - 1);
         super.remove(getSize() - 1);
        return o;
        }
    public void push(E o) {
        super.add(o);
        }

         @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}