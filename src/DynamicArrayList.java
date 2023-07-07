import java.util.Arrays;

public class DynamicArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public DynamicArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(E element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size] = element;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        elements[size] = null;
    }

    public int size() {
        return size;
    }

    public int countOccurrences(E element) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(element)) {
                count++;
            }
        }
        return count;
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
