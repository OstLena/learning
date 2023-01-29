package module9;

public class MyArrayList<T> {

    private int size = 0;

    private T[] data = (T[]) new Object[10];

    public void add(T value) {
        data[size] = value;
        size++;
        if (size >= data.length) {
            T[] dataTemporary = (T[]) new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                dataTemporary[i] = data[i];
            }
            data = dataTemporary;
        }
    }

    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size] = null;
        size--;
    }

    public void clear() {
        data = (T[]) new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }
        return data[index];
    }
}
