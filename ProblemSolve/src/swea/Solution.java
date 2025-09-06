package swea;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/swea/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.close();
    }
}
