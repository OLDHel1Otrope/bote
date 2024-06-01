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
