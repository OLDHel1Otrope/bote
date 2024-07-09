public class Patterns {
    public static void p1(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void p2(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void p3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=(i<=n/2?i:n-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) System.out.print(' ');
            for (int j = 0; j < i+1; j++) System.out.print('x');
            System.out.println();
        }
    }

    public static void p6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>n-i-2) System.out.print('x');
                else System.out.print(' ');
            }System.out.println();
        }
    }

    public static void p7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j+1>i) System.out.print('x');
                else System.out.print(' ');
            }System.out.println();
        }
    }

    public static void p8(int n){//do it in two loops only///////////////
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j < i*2; j++) {
                System.out.print('x');
            }System.out.println();
        }
    }///////////////

    public static void p9(int n){//do it in two loops only///////////////
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(' ');
            }
            for (int j = n*2-2*i+1; j >0; j--) {
                System.out.print('x');
            }System.out.println();
        }
    }

    public static void p10(int n){
        for (int i = 1; i <= n*2; i++) {
            for (int j = 1; j < (i>n?2*n-i+1:i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i<=n?2*n+2-2*i:2*(i-n)); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        p10(5);
    }
}
