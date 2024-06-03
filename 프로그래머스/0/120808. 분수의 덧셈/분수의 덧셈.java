import java.util.Arrays;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer3 = (numer1 * denom2) + (numer2 * denom1);
        int denom3 = (denom1 * denom2);
        int gcd = euclidean(numer3, denom3);
        numer3 = numer3 / gcd;
        denom3 = denom3 / gcd;
        return new int[]{numer3, denom3};

    }

    public int euclidean(int a, int b) {
        if (b == 0)
            return a;
        return euclidean(b, a % b);
    }
}