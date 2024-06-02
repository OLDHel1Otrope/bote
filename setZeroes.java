public void setZeroes1(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int i, j;
        List<List<Integer>> coordinates = new ArrayList<>();
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    coordinates.add(List.of(i, j));
                }
            }
        }
        for (List<Integer> a : coordinates) {
            for (i = 0; i < r; i++) {
                matrix[i][a.get(1)] = 0;
            }
            for (j = 0; j < c; j++) {
                matrix[a.get(0)][j] = 0;
            }
        }
        //System.out.println(coordinates);
    }
