class LRUCache {
    Node head = new Node(0, 0), tail = new Node(0, 0);

    Map<Integer, Node> map = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node data = map.get(key);

            // move data to the top
            // remove the node
            remove(data);

            // insert (node)
            insert(data);

            return data.value;
        }

        return -1;
    }

    public void put(int key, int value) {
        // if the value is already present then we will move to the top

        if (map.containsKey(key)) {
            remove(map.get(key));
        }

        // if cach is full  we need to remove one node

        if (map.size() == capacity) {
            remove(tail.prev);
        }

        // tail.prev -- least recently used cache

        insert(new Node(key, value));
    }

    void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void insert(Node node) {
        map.put(node.key, node);

        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
    }

    class Node {
        Node prev, next;
        int key, value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
