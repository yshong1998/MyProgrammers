class Solution {
    public static int solution(int hp) {
        int generalAntNumber = hp / 5;
        hp %= 5;
        int armyAntNumber = hp / 3;
        hp %= 3;
        int workAntNumber = hp;
        return generalAntNumber + armyAntNumber + workAntNumber;
    }
}