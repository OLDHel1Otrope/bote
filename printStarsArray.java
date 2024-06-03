public class printStarsArray {
    public static void prints(int[] arr){
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        System.out.println(maxVal);
        for(int j=0;j<maxVal;j++){
            for(int i = 0; i < arr.length; i++){
                if((arr[i]-j)>=0){
                    System.out.print("*");
                }
                else System.out.print("_");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,0,5};
        prints(arr);
        
    }
}
