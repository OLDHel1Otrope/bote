static class directionHolder{
        byte dir;
        int val;
    }

    public static String subSeq(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        directionHolder[][] matrix = new directionHolder[m + 1][n + 1];

        // Initialize the matrix with `directionHolder` objects
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                matrix[i][j] = new directionHolder();
            }
        }

        // Fill the first row and column with 0 direction and value
        for (int i = 0; i <= m; i++) {
            matrix[i][0].dir = 0;
            matrix[i][0].val = 0;
        }
        for (int j = 0; j <= n; j++) {
            matrix[0][j].dir = 0;
            matrix[0][j].val = 0;
        }

        // Fill the matrix with comparison logic
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // Characters match: move diagonally (top left)
                    matrix[i][j].dir = 2;
                    matrix[i][j].val = matrix[i - 1][j - 1].val + 1;
                } else if (matrix[i][j - 1].val >= matrix[i - 1][j].val) {
                    // Move left
                    matrix[i][j].dir = 3;
                    matrix[i][j].val = matrix[i][j - 1].val;
                } else {
                    // Move up
                    matrix[i][j].dir = 1;
                    matrix[i][j].val = matrix[i - 1][j].val;
                }
            }
        }

        // Backtrack to find the longest common subsequence
        int a = m;
        int b = n;
        StringBuilder sb = new StringBuilder();
        while (a > 0 && b > 0) {
            if (matrix[a][b].dir == 2) {
                sb.insert(0, s1.charAt(a - 1));
                a--;
                b--;
            } else if (matrix[a][b].dir == 3) {
                b--;
            } else {
                a--;
            }
        }

        return sb.toString();
    }
