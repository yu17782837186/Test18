package cn.dataStructure2.com;

public class MyStack implements Stack {
    private int top;
    private int[] array;
    private int Usesize;

    public MyStack(int size) {
        this.top = 0;
        array = new int[size];
        this.Usesize = 0;
    }
    private boolean isFull() {
        return this.Usesize == array.length;
    }
    @Override
    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("栈已经满了！！！！");
        }
        this.array[top++] = item;
        this.Usesize++;
    }

    @Override
    public int pop() {
        if (empty()) {
            throw new RuntimeException("栈为空！！！！！！");
        }
        int data = this.array[top-1];
        this.top--;
        this.Usesize--;
        return data;
    }

    @Override
    public int peek() {
        if (empty()) {
            throw new RuntimeException("栈为空！！！！！！");
        }
        return this.array[top-1];
    }

    @Override
    public boolean empty() {
        return this.Usesize == 0;
    }

    @Override
    public int size() {
        return this.Usesize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while(i < this.Usesize) {
            if (i == this.Usesize-1) {
                sb.append(array[i]);
            }else {
                sb.append(array[i]+",");
            }
            i++;
        }
        sb.append("]");
        return sb.toString();
    }
}
