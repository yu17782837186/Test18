package cn.dataStructure2.com;

public class MyQueue implements Queue {
    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node first;
    private Node last;
    private int useSize;



    @Override
    public boolean empty() {
        return this.useSize == 0;
    }

    @Override
    public int peek() {
        if (empty()) {
            throw new RuntimeException("队列为空！！！！！！");
        }
        return this.first.data;
    }

    @Override
    public int poll() {
        if (empty()) {
            throw new RuntimeException("队列为空！！！！！！");
        }
        int data = this.first.data;
        if (this.useSize == 1) {
            this.first = null;
            this.last = null;
        }else {
            this.first =this.first.next;
        }
        this.useSize--;
        return data;
    }

    @Override
    public void add(int item) {
        Node node = new Node(item);
        if (empty()) {
            this.first = node;
            this.last = node;
        }else {
            this.last.next = node;
            this.last = node;
        }
        this.useSize++;
    }

    @Override
    public int size() {
        return this.useSize;
    }

    @Override
    public String toString() {
        Node p = this.first;
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while(i < this.useSize) {
            if (i == this.useSize -1) {
                sb.append(p.data);
            }else {
                sb.append(p.data+",");
            }
            i++;
            p = p.next;
        }
        sb.append("}");
        return sb.toString();
    }
}
