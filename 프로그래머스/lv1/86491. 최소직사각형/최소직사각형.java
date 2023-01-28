class Solution {
    public static int solution(int[][] sizes){
        int[][] reversedSizes = new int[sizes.length][2];
        for (int i = 0; i < sizes.length; i++) {
            reversedSizes[i][0] = Math.max(sizes[i][0],sizes[i][1]);
            reversedSizes[i][1] = Math.min(sizes[i][0],sizes[i][1]);
        }
        int maxWidth = 0;
        int maxHeight = 0;
        for (int i = 0; i < sizes.length; i++) {
            maxWidth = Math.max(maxWidth,reversedSizes[i][0]);
            maxHeight = Math.max(maxHeight,reversedSizes[i][1]);
        }
        return maxHeight * maxWidth;
    }
}
