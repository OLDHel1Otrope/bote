class Solution {
    public static int findMinDifference(List<String> timePoints) {
        List<Integer> angles=new ArrayList<>();
        for(String time: timePoints){
            String[] timeParts = time.split(":");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);
            int k=(hours * 60) + (minutes);
            angles.add(k);
        }
        Collections.sort(angles);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < angles.size(); i++) {
            int diff = angles.get(i) - angles.get(i - 1);
            min =Math.min(min, diff);
        }
        return Math.min(min, 24*60 - (angles.getLast() - angles.getFirst()));
    }
}
