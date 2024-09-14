public static int closestCommonAncestor(TreeNode head, int firstVal, int secondVal){
           List<Integer> firstPath = new ArrayList<>();
         List<Integer> secondPath = new ArrayList<>();
         boolean foundFirst = searchDFS(head, firstVal, firstPath);
         boolean foundSecond = searchDFS(head, secondVal, secondPath);
         if (!foundFirst || !foundSecond) {
             return -1;
         }
         int i;
         for (i = 0; i < Math.min(firstPath.size(), secondPath.size()); i++) {
             if (!Objects.equals(firstPath.get(i), secondPath.get(i))) {
                 return firstPath.get(i - 1);
             }
         }
         return firstPath.get(i - 1);
     }
    public static boolean searchDFS(TreeNode root, int target, List<Integer> path) {
        if (root == null) {
            return false;
        }
        path.add(root.val);

        if (root.val == target) {
            return true;
        }

        if (searchDFS(root.left, target, path)) {
            return true;
        }
        if (searchDFS(root.right, target, path)) {
            return true;
        }
        path.removeLast();
        return false;
    }
