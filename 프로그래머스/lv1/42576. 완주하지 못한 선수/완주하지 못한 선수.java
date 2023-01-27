import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> completionList = new ArrayList<>(Arrays.asList(completion));
        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
        Collections.sort(completionList);
        Collections.sort(participantList);
        for (int i = 0; i < completionList.size(); i++) {
            if(!(participantList.get(i).equals(completionList.get(i)))){
                return participantList.get(i);
            }
        }
        return participantList.get(participantList.size()-1);
    }
}