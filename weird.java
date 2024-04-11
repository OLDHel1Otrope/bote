class HelloWorld {
    public static void pn(int n){
        if(n==0){
            return;
        }
        pn(n-1);
        System.out.println(n);
        pn(n-1);
    }
    public static void main(String[] args) {
        pn(5);
    }
    public static int fact(int n){
        if(n==2)return 2;
        if(n<=1)return 1;
        return n*fact(n-1);
    }
    
    public static int sumofdigits(int n){
        if(n==0) return 0;
        return n%10+sumofdigits(n/10);
    }
}
