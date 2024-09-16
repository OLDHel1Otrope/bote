    public boolean colorGraph(int[][] adjacency, int colors) {
        int[] colorAssignment = new int[adjacency.length];
        Arrays.fill(colorAssignment, -1);
        return colorGraphHelper(adjacency, colors, colorAssignment, 0);
    }

    private boolean colorGraphHelper(int[][] adjacency, int colors, int[] colorAssignment, int state) {
        if (state == adjacency.length) {
            return true;
        }
        for (int color = 0; color < colors; color++) {
            boolean k=true;
            for (int i = 0; i < adjacency.length; i++) {
            if (adjacency[state][i] == 1 && colorAssignment[i] == color) {
                k=false;}}
            if (k)) {
                colorAssignment[state] = color;
                if (colorGraphHelper(adjacency, colors, colorAssignment, state + 1)) {//check further states
                    return true;
                }
                colorAssignment[state] = -1;
            }
        }
        return false;
    }
