import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int solution(int n) {
        //0 1 2 10 11 12 20 21 22 100 101 102 110 111 112 120 121 122 200 201 202
        //0 1 2 3  4  5  6  7  8  9   10  11  12  13  14  15  16  17  18  19  20
        //3진법 202는 3의 2승이 2개 + 3의 1승이 0개 + 3의 0승이 2개 == 18 + 0 + 2 == 20
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            list.add(n%3);
            n/=3;
        }
        for(int i = 0; i < list.size(); i++){
            answer += Math.pow(3,list.size()-1-i)*list.get(i);
        }
        return answer;
    }
}