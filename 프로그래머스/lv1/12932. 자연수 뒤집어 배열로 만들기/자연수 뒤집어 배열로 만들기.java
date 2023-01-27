class Solution {
    public long[] solution(long n) {
        long k = n;
        int cnt = 0;
        while (k!=0){
            k /= 10;
            cnt++;
        }
        long[] array = new long[cnt];
        for (int i = 0; i <array.length; i++){
            array[i] = n%10;
            n/=10;

        }
        return array;
    }
}