public class HuffmanCoding{
      class huffNode implements Comparable<huffNode> {
    int occurances;
    char character;

    huffNode(char character,int occurances){
        this.occurances=occurances;
        this.character=character;
    }
    huffNode(int occurances, huffNode left, huffNode right){
        //this constructor responds to the tree creation process
        this.occurances=occurances;
        this.left=left;
        this.right=right;
    }
    huffNode left;
    huffNode right;

    public int compareTo(huffNode other) {
        return Integer.compare(this.occurances, other.occurances);
    }
}
  
      public static HashMap<Character, Integer> codes(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }
        // Create a list to store all huffNode elements
        List<huffNode> list = new ArrayList<>();
        // Iterate through the map and add huffNode elements to the list
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(new huffNode(entry.getKey(), entry.getValue()));
        }
        // Sort the list based on frequency (huffNode's compareTo method)
        Collections.sort(list);//this is ready to be converted to a tree now
        while(list.size()>1){
            //take the first two elements, create a new node add them to left and right, remove them from the array
            //and add the new node in the list and sort the list once again
            list.add(new huffNode(list.get(0).occurances+list.get(1).occurances,list.get(0),list.get(1)));
            list.removeFirst();
            list.removeFirst();
            Collections.sort(list);
        }
        //now only one element is left in the list, that is the root node of the tree;
        //for each leaf node calculate the integer value, that a particular character will be represented as
        map.clear();
        huffDfs(list.getFirst(),0,map);

        return map;
    }

    private static void huffDfs(huffNode node, int val,HashMap<Character,Integer> map){
        if(node.left == null || node.right == null){
            map.put(node.character,val);
            System.out.println(node.character+" "+ val);
            return;
        }
        else{
            huffDfs(node.left,2*val,map);
            huffDfs(node.right,2*val+1,map);
        }
    }
}
