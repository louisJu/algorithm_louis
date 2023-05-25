package programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Trytrytry {

    /*public int solution(int n) {
        int[] arr = new int[n + 1];
        int answer = 0;
        arr[0] = 0;
        arr[1] = 1;
        int result = 1;
        for(int i = 2; i<=n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        return arr[n];
    }*/

/*    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int t: tangerine) {
            map.put(t,map.getOrDefault(t,0) + 1);
        }
        List<Map.Entry<Integer, Integer>> sortedList =
                map.entrySet().stream()
                        .sorted(
                                new Comparator<Map.Entry<Integer, Integer>>() {
                                    @Override
                                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                                        return o2.getValue().compareTo(o1.getValue());
                                    }
                                }

                        )
                .collect(Collectors.toList());
        //Collections.re

        for(Map.Entry<Integer, Integer> sl: sortedList) {
            k -= sl.getValue();
            answer++;
            if(k <= 0){
                return answer;
            }
        }
        return answer;
    }*/

/*    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i<prices.length; i++) {
            for(int j = i+1; j<prices.length; j++) {
                if(prices[i] <= prices[j]) {
                    answer[i]++;
                }else {
                    answer[i]++;
                    break;
                }
            }
            if(i == prices.length -1) {
                answer[i] = 0;
            }
        }
        return answer;
    }*/
/*public int solution(int k, int m, int[] score) {
    int answer = 0;
    Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
    Arrays.sort(arr,Collections.reverseOrder());

    int totalBoxCount = score.length / m;

    for(int i =0; i< totalBoxCount; i++) {
        int minIdx = m * i + (m-1);
        answer += arr[minIdx] * m;
    }
    return answer;
}*/
/*
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> ss = new Stack<>();


        char[] arr = s.toCharArray();

        if(arr[0] == ')') return false;
        for(int i =0; i< arr.length; i++) {
            if(arr[i] == '(') {
                ss.push(arr[i]);
            }else if(arr[i] ==')' && !ss.isEmpty()) {
                ss.pop();
            }else {
                return false;
            }
        }
        answer = ss.isEmpty();

        return answer;
    }*/

/*    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankings = new HashMap<String, Integer>();

        for (int i = 0; i < players.length; i++) {
            rankings.put(players[i], i);
        }

        for (String calling : callings) {
            Integer currentIdx = rankings.get(calling);
            String tmp = players[currentIdx-1];
            players[currentIdx-1] = players[currentIdx];
            players[currentIdx] = tmp;
            rankings.put(players[currentIdx-1], currentIdx-1);
            rankings.put(players[currentIdx], currentIdx);
        }


        // 정렬된 선수들의 이름 배열로 반환
        String[] answer = new String[players.length];
        for (int i = 0; i < players.length; i++) {
            answer[i] = players[i];
        }

        return answer;
    }*/

/*    public int solution(int[] elements) {
        int answer = 0;
        //Map numSum = new HashMap<Integer, HashSet<Integer>>();
        Set numSum = new HashSet<Integer>();

        int k = 1;
        for(int i =0; i< elements.length; i++) {
            for(int j =0; j< elements.length; j++) {
                int result = 0;
                for (int j = 0; j < k; j++) {
                    result += elements[i + j];
                }
            }
            k++;
        }
        return numSum.size();
    }*/
/*public static int solution(int[] topping) {
    int answer = 0;
    HashMap<Integer, Integer> rightMap = new HashMap<>();
    HashMap<Integer, Integer> leftMap = new HashMap<>();

    for(int i =0; i< topping.length; i++) {
        rightMap.put(topping[i], rightMap.getOrDefault(topping[i], 0) + 1);
    }

    for(int j =0; j<topping.length; j++) {
        leftMap.put(topping[j], leftMap.getOrDefault(topping[j], 0) + 1);
        rightMap.put(topping[j], rightMap.get(topping[j]) -1);
        if(rightMap.get(topping[j]) == 0) {
            rightMap.remove(topping[j]);
        }

        if(leftMap.size() == rightMap.size()) {
            answer++;
        }
    }
    return answer;
}*/
/*

    public int solution(int[] topping) {
        int answer = 0;
        Set leftSet = new HashSet<Integer>();
        Set rightSet = new HashSet<Integer>();
        List<Integer> totalList = Arrays.asList(topping);

        for(int i =0; i< topping.length-1; i++) {
            List sublist = totalList.subList(0, i+1);
            List sublist2 = totalList.subList(i+1, topping.length-1);
            leftSet = new HashSet<Integer>(sublist);
            rightSet = new HashSet<Integer>(sublist2);


*/
/*
            for(int j = 0; j<= i; j++){
                leftSet.add(topping[j]);
            }
            for(int k = i+1; k < topping.length; k++){
                rightSet.add(topping[k]);
            }*//*

            if(leftSet.size() == rightSet.size()) {
                answer++;
            }
        }
        return answer;
    }
*/


    /*    public int solution(int[][] sizes) {
            int answer = 0;
            int vertical = 0;
            int horizen = 0;

            for(int[] tag: sizes) {
                Arrays.sort(tag);
                if(vertical < tag[0]) {
                    vertical = tag[0];
                }
                if(horizen < tag[1]) {
                    horizen = tag[1];
                }
            }
            answer = vertical * horizen;
            return answer;
        }*/
/*
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1
                    && stack[sp - 2] == 3
                    && stack[sp - 3] == 2
                    && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }*/
/*    public int solution(String s) {
        int answer = 1;
        char first = s.charAt(0);
        int firstCount = 0;
        int otherCount = 0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) == first) firstCount++;
            else if(s.charAt(i) != first) otherCount++;

            if(firstCount == otherCount) {
                firstCount = 0;
                otherCount = 0;
                if(i < s.length() -1) {
                    first = s.charAt(i+1);
                    answer++;
                }
            }
        }
        return answer;
    }*/
/*    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int cardOneIdx = 0;
        int cardTwoIdx = 0;
        for(int i = 0; i<goal.length; i++){
            if(cardOneIdx < cards1.length && cards1[cardOneIdx].equals( goal[i])){
                cardOneIdx++;
            } else if(cardTwoIdx < cards2.length && cards2[cardTwoIdx].equals(goal[i])){
                cardTwoIdx++;
            } else {
                return "No";
            }
        }
        answer = "Yes";
        return answer;
    }*/

    public int solution(int[] nums) {
        int answer = 0;
        int maxNum = nums.length / 2;
        List<Map<Integer, Integer>> data = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        if(maxNum > map.size()) {
            answer = map.size();
        }else {
            answer = maxNum;
        }


        return answer;
    }
}
