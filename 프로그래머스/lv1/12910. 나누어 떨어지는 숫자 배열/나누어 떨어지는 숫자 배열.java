import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        ArrayList<Integer> divised = new ArrayList<>();
        for(int i  = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                divised.add(arr[i]);
            }
        }
        if(divised.size() == 0){
            divised.add(-1);
        }
        return divised;
    }
}