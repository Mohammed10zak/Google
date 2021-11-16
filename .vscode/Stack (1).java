 package stack;
public class Stack {
   private  int size;
   private int a[];
    private int top ;
   public Stack(int s){
   a = new int[s];
   size=s;
    top = -1;
   }
    public void push(int val) {
        if (isfull()) {
            System.out.println("Stack is Full.");
        } else {
            top = top + 1;
            a[top] = val;
            System.out.println("The value is pushed in Stack = " + val);
        }
    }

    public int pop() {
        int x = 0;
        if (isempty()) {
            System.out.println("Empty!!");
        } else {
            x = a[top];
            top = top - 1;
    //        System.out.println("the pop value is:" + x);
        }
        return x;
    }

    public boolean isempty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isfull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Stack ss = new Stack(4);
        int a[] = {3,4,7,6};
        int i=0;
        int sum=0;
        while (!ss.isfull()) {
            ss.push(a[i]);
            i++;
        }
        while (!ss.isempty()) {
           int x =ss.pop();
           System.out.println("output:="+x);

        }
    }
} 
