    public static void biFunnel(int x){
        int start=0;
        int end=0;
        for (int i = 1; i <= x; i++)end+=i;
        end*=2;
        for (int i = 0; i <x ; i++) {
            for (int j = 0; j < i; j++) System.out.print("  ");
            for (int j = 0; j < x-i; j++)System.out.print(++start+" ");
            int m=end-x+i+1;
            end=m-1;
            for (int j = 0; j < x-i&&j<=end; j++)System.out.print(m+++" ");
            System.out.println();
        }
    }
