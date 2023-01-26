class Solution {
    public int solution(int emptyColaCost, int colaCostPerNew, int myEmptyCola) {
        int returnedCola;
        int returnedColaCount = 0;
        while(myEmptyCola / emptyColaCost >0){
            returnedCola = myEmptyCola/emptyColaCost*colaCostPerNew;
            myEmptyCola = returnedCola + myEmptyCola%emptyColaCost;
            returnedColaCount += returnedCola;
        }

        return returnedColaCount;
    }
}