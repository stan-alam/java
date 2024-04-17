class FixedStack implements IntStack {
    private int stack[];
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    //pop an item from the stack
    public int popfromstack() {
        if(tos < 0) {
            System.out.println("stack underflow?.");
            return 0;
        }
        else
            return stack[tos--];
    }

    //push an item to the stack
    public void pushinstack(int item) {
        if(tos == stack.length-1)
            System.out.println("stack overflow.");
        else
            stack[++tos] = item;
    }
} //not complete