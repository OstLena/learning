package module9;

public class MyHashMap<K, V> {

    private int size = 0;
    private List<K, V>[] buckets = new List[16];


    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);

        List<K, V> bucket;
        if (buckets[bucketIndex] == null) {
            bucket = new List<K, V>();
            buckets[bucketIndex] = bucket;
        } else {
            bucket = buckets[bucketIndex];
        }
        boolean added = bucket.add(new Entry<K, V>(key, value));
        if (added) {
            size++;
        }

        if (size >= buckets.length * 3 / 4) {
            List<K, V>[] bucketsTemporary = new List[buckets.length * 2];

            for (int i = 0; i < buckets.length; i++) {
                List<K, V> toMove = buckets[i];
                if (toMove != null) {
                    Integer hashCode = toMove.getHashCode();
                    Integer index = hashCode % bucketsTemporary.length;
                    bucketsTemporary[index] = toMove;
                }
            }
            buckets = bucketsTemporary;
        }
    }

    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        if (buckets[bucketIndex] != null) {
            List<K, V> bucket;
            bucket = buckets[bucketIndex];
            boolean removed = bucket.remove(key);
            if (removed) {
                size--;
            }
        }

    }

    public void clear() {
        buckets = new List[16];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);

        if (buckets[bucketIndex] != null) {
            List<K, V> bucket = buckets[bucketIndex];
            return bucket.get(key);
        }
        return null;
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        int bucketIndex = hashCode % buckets.length;
        return bucketIndex;
    }

    class Entry<K, V> {

        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    class Node<K, V> {
        private Entry<K, V> entry;
        private Node<K, V> next;

        public Node(Entry<K, V> entry) {
            this.entry = entry;
        }
    }

    class List<K, V> {
        private Node<K, V> first;
        private Integer hashCode;

        public boolean add(Entry<K, V> entry) {
            if (first == null) {
                first = new Node<K, V>(entry);
                hashCode = entry.key.hashCode();
            } else {
                Node<K, V> find = first;
                while (find != null) {
                    if (find.entry.key.equals(entry.key)) {
                        find.entry = entry;
                        return false;
                    }
                    if (find.next != null) {
                        find = find.next;
                    } else {
                        break;
                    }
                }
                find.next = new Node<K, V>(entry);
            }
            return true;
        }

        public V get(K key) {
            Node<K, V> element = first;
            while (!key.equals(element.entry.key)) {
                element = element.next;
                if (element == null) {
                    return null;
                }
            }
            return element.entry.value;
        }

        public boolean remove(K key) {
            Node<K, V> find = first;
            if (find != null) {
                if (find.entry.key.equals(key)) {
                    first = find.next;
                    return true;
                } else {
                    while (find != null) {
                        Node<K, V> prev = find;
                        find = find.next;
                        if (find.entry.key.equals(key)) {
                            prev.next = find.next;
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public Integer getHashCode() {
            return hashCode;
        }
    }
}
