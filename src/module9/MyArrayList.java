package module9;

public class MyArrayList {

    private int size = 0;

    private Object[] data = new Object[10];

    public void add(Object value) {
        data[size] = value;
        size++;
        if (size >= data.length) {
            Object[] dataTemporary = new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                dataTemporary[i] = data[i];
            }
            data = dataTemporary;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size] = null;
        size--;
    }

    public void clear() {
        data = new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return data[index];
    }
}
