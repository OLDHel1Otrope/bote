private static String[] findStrArr(char x){
        HashMap<Character, String[]> map = new HashMap<>();
        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});
        try {
            return map.get(x);
        } catch (Exception e) {
            return new String[]{""};
        }
    }

    private static String[] xadd(String[] newArr, String[] solvedArr){
        if(solvedArr==null) return newArr;
        if(newArr==null) return solvedArr;
        String[] result=new String[newArr.length* solvedArr.length];
        int count=0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < solvedArr.length; j++) {
                result[count++]=newArr[i]+solvedArr[j];
            }
        }
        return  result;
    }

    public static String[] phoneCombinations(String combination){
        if(combination.length()==1){
            return findStrArr(combination.charAt(0));
        }
        return xadd(findStrArr(combination.charAt(0)),phoneCombinations(combination.substring(1)));

    }
