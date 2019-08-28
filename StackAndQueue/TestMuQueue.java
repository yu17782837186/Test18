package cn.dataStructure2.com;

public class TestMuQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue);
        System.out.println(myQueue.empty());
        System.out.println(myQueue.size());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
        System.out.println(myQueue.size());
    }
}
