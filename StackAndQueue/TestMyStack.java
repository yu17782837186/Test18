package cn.dataStructure2.com;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack);
        System.out.println(myStack.empty());
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        myStack.peek();
        System.out.println(myStack.peek());
        System.out.println(myStack);
    }
}
