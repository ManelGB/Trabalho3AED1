class Entry<K, V> {
    private final K key;
    private V value;
    private int frequency;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
// public class Entry {
//     private final String documentId;
//     private int frequency;

//     public Entry(String documentId, int frequency) {
//         this.documentId = documentId;
//         this.frequency = frequency;
//     }

//     public String getDocumentId() {
//         return documentId;
//     }

//     public int getFrequency() {
//         return frequency;
//     }

//     public void setFrequency(int frequency) {
//         this.frequency = frequency;
//     }
// }
