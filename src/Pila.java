import java.util.Vector;

/**
 * Implementa la interfaz Stack para almacenar los valores del .txt
 * @param <E> generico
 */
public class Pila<E> implements Stack<E> {

    Vector<E> vector = new Vector<>();

    /**
     * Agrega el numero al vector
     * @param item numero a agregar
     */
    @Override
    public void push(E item) {
        //Will be popped next if no intervening push
        vector.add(item);
    }

    /**
     * Obtiene el ultimo elemento agregado al vector
     * @return el numero retirado
     */
    @Override
    public E pop() {
        //Most recently pushed item is removed and returned
        return vector.remove(0);
    }

    /**
     * Muestra el siguiente numero que puede ser pop
     * @return el numero disponible
     */
    @Override
    public E peek() {
        //Top value (next to be popped) is returned
        return vector.get(0);
    }

    /**
     * verifica si el vector esta vacio
     * @return boolean segun su estado
     */
    @Override
    public boolean empty() {
        //Returns true if and only if the stack is empty
        return vector.isEmpty();
    }

    /**
     * obtiene el tamanio del vector
     * @return el tamanio del vector
     */
    @Override
    public int size() {
        //Returns the number of elements in the stack
        return vector.size();
    }
}
