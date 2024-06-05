package com.ki.level0.p120837;

public class Main {
    public static void main(String[] args) {
            System.out.println(new Solution().solution(40));
    }
}
class Solution {
    public int solution(int hp) {
        int answer = 0;
        int j = 5;
        int b = 3;
        int l = 1;
        int a = 0;

        while (hp >= 5) {
            hp = hp - 5;
            answer ++;
        } while (hp >= 3) {
            hp = hp - 3;
            answer ++;
        } while (hp > 0) {
            hp = hp - 1;
            answer ++;
        }
        return answer;
    }
}
