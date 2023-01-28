import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> solution(int n, int[] numlist) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0){
                intList.add(numlist[i]);
            }
        }
        return intList;
    }
}