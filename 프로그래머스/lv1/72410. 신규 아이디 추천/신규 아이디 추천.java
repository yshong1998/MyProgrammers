class Solution {
    public static StringBuilder solution(String new_id) {
        new_id = removeExceptionString(new_id.toLowerCase());
        StringBuilder suggested_id = new StringBuilder();
        suggested_id.append(new_id.toLowerCase());
        removeDuplicatePeriod(suggested_id);
        removeFirstOrLastPeriod(suggested_id);
        if (isNullId(suggested_id)) {
            suggested_id.append("a");
        }
        checkRangeOverException(suggested_id);
        while (suggested_id.length() < 3) {
            makeMinLengthId(suggested_id);
        }
        return suggested_id;
    }
    // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다. - solution에서 자체 해결
    // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    public static String removeExceptionString(String id) {
        return id.replaceAll("[^a-z\\d\\-_.]*", "");
    }

    // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    public static StringBuilder removeDuplicatePeriod(StringBuilder id) {
        for (int i = 0; i < id.length() - 1; i++) {
            if (id.charAt(i) == '.' && id.charAt(i + 1) == '.') {
                id.deleteCharAt(i);
                i--;
            }
        }
        return id;
    }

    // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    public static StringBuilder removeFirstOrLastPeriod(StringBuilder id) {
        if (id.length() > 0 && id.charAt(0) == '.') {
            id.deleteCharAt(0);
        }
        if (id.length() > 0 && id.charAt(id.length() - 1) == '.') {
            id.deleteCharAt(id.length() - 1);
        }
        return id;
    }

    //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    public static boolean isNullId(StringBuilder id) {
        return id.length() == 0;
    }

    //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    //         만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    public static StringBuilder checkRangeOverException(StringBuilder id) {
        if (id.length() > 15) {
            id.replace(14, id.length(), String.valueOf(id.charAt(14)));
        }
        if (id.charAt(id.length() - 1) == '.') {
            removeFirstOrLastPeriod(id);
        }
        return id;
    }

    //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    public static void makeMinLengthId(StringBuilder id) {
        id.append(id.charAt(id.length() - 1));
    }
}