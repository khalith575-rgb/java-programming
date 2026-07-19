class Fibonacci number {
    public int fib(int n) {
        if(n<=1)return n;
        int a=0,b=1;
        for(int i=2;i<=n;i++){
            int next = a+b;//1235
            a=b;//1123
            b=next;//1235
        }
        return b;
    }
}