/**
 * Стек
 */
public class MyStack<T> {
    int counter = 0;
    Object[] data = new Object[0];

    public void push(T value) {
        ++counter;
        if (data.length < counter) {
            Object[] newData = new Object[counter];
            // System.arraycopy(data, 0, newData, 0, data.length);
            for (int i = 0; i < data.length; ++i)
                newData[i] = data[i];
            data = newData;
        }
        data[counter - 1] = value;
    }

    public int size() {
        return counter;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        Object value = data[data.length - 1];
        Object[] newData = new Object[data.length - 1];
        System.arraycopy(data, 0, newData, 0, data.length - 1);
        data = newData;
        return (T) value;
    }
}
