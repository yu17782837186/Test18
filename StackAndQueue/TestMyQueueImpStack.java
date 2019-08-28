package cn.dataStructure2.com;

public class TestMyQueueImpStack {
    public static void main(String[] args) {
        MyQueueImpStack is = new MyQueueImpStack();
        System.out.println(is.empty());
        System.out.println(is.size());
        is.push(1);
        is.push(2);
        is.push(3);
        is.push(4);
        System.out.println(is.pop());
        System.out.println(is.size());
    }
}
