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
}
