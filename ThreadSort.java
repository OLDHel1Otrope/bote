package algorithms;

public class ThreadSort {
  public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            final int index = i;
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(arr[index]*1);
                        System.out.print(arr[index]+" ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
