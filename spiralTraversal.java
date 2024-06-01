public class spiralTraversal {
    static void swapReduce(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int totalElements = matrix.length * matrix[0].length;
        int rowrange[] = { 0, matrix.length };
        int colrange[] = { 0, matrix[0].length };
        int i = 0, j = 0;
        int d = 1;
        while (result.size() < totalElements) {
            //contains big errors
            for (i = colrange[0]; i <= colrange[1]; i += d) {
                result.add(matrix[j][i]);
            }
            i -= d;
            for (j = colrange[0]; j <= colrange[1]; j += d) {
                System.out.println(" ");
                result.add(matrix[j][i]);
            }
            j -= d;
            d *= -1;
            swapReduce(colrange);
            swapReduce(rowrange);
        }

        return result;

    }


public static ArrayList<Integer> spiralOrder2(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {        //l to r
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {        //t to b
                result.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {        //r to l
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {        //b to t
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
