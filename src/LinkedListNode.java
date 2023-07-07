class LinkedListNode<K, V> {
    private Entry<K, V> entry;
    private LinkedListNode<K, V> next;

    public LinkedListNode(Entry<K, V> entry) {
        this.entry = entry;
    }

    public Entry<K, V> getEntry() {
        return entry;
    }

    public LinkedListNode<K, V> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<K, V> next) {
        this.next = next;
    }
}