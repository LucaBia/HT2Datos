import java.util.Vector;

public class Pila<E> implements Stack<E> {

    Vector<E> vector = new Vector<>();

    @Override
    public void push(E item) {
        //Will be popped next if no intervening push
        vector.add(item);
    }

    @Override
    public E pop() {
        //Most recently pushed item is removed and returned
        return vector.remove(0);
    }

    @Override
    public E peek() {
        //Top value (next to be popped) is returned
        return vector.get(0);
    }

    @Override
    public boolean empty() {
        //Returns true if and only if the stack is empty
        return vector.isEmpty();
    }

    @Override
    public int size() {
        //Returns the number of elements in the stack
        return vector.size();
    }
}
