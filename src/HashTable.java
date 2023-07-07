import java.util.*;

public class HashTable<K, V> {
    private final int size;
    private final LinkedListNode<K, V>[] table;

    public HashTable(int size) {
        this.size = size;
        this.table = new LinkedListNode[size];
    }

    private int hashFunction(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(K key, V value) {
        int index = hashFunction(key);
        LinkedListNode<K, V> newNode = new LinkedListNode<>(new Entry<>(key, value));

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            LinkedListNode<K, V> current = table[index];
            while (current.getNext() != null) {
                if (current.getEntry().getKey().equals(key)) {
                    current.getEntry().setValue(value);
                    return;
                }
                current = current.getNext();
            }
            if (current.getEntry().getKey().equals(key)) {
                current.getEntry().setValue(value);
            } else {
                current.setNext(newNode);
            }
        }
    }

    public V get(K key) {
        int index = hashFunction(key);
        LinkedListNode<K, V> current = table[index];
        while (current != null) {
            if (current.getEntry().getKey().equals(key)) {
                return current.getEntry().getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public V getOrDefault(K key, V defaultValue) {
        V value = get(key);
        return value != null ? value : defaultValue;
    }

    public void remove(K key) {
        int index = hashFunction(key);
        LinkedListNode<K, V> current = table[index];
        LinkedListNode<K, V> prev = null;

        while (current != null) {
            if (current.getEntry().getKey().equals(key)) {
                if (prev == null) {
                    table[index] = current.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
                return;
            }
            prev = current;
            current = current.getNext();
        }
    }
}
