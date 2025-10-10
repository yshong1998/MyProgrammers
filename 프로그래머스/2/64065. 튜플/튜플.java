import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(1);
        List<int[]> list = new ArrayList<>();
        while (s.indexOf("}") != s.lastIndexOf("}")) {
            String elements = s.substring(s.indexOf("{") + 1, s.indexOf("}"));
            s = s.substring(s.indexOf("}") + 2);
            list.add(Arrays.stream(elements.split(",")).mapToInt(Integer::parseInt).toArray());
        }
        for (int i = 0; i < list.size(); i++) {
            Arrays.sort(list.get(i));
        }
        Collections.sort(list, (arr1, arr2) -> {
            return arr1.length - arr2.length;
        });
        int[] answer = new int[list.get(list.size() - 1).length];
        answer[0] = list.get(0)[0];
        for (int i = 0; i < list.size() - 1; i++) {
            int diffNum = compare(list.get(i + 1), list.get(i));
            answer[i + 1] = diffNum;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public int compare(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return arr1[i];
            }
        }
        return arr1[arr1.length - 1];
    }
}