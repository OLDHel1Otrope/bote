class Solution {
    public static int findMinDifference(List<String> timePoints) {
        int[] angles=new int[timePoints.size()];
        int i=0;
        for(String time: timePoints){
            String[] timeParts = time.split(":");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);
            angles[i]=(hours * 60) + (minutes);
            i++;
        }
        Arrays.sort(angles);
        int min = Integer.MAX_VALUE;
        for (int j = 1; j < angles.length; j++) {
            int diff = angles[j] - angles[j-1];
            min =Math.min(min, diff);
        }
        return Math.min(min, 24*60 - (angles[angles.length-1] - angles[0]));
    }
}
