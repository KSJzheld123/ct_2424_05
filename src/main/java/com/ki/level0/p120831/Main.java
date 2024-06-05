package com.ki.level0.p120831;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(40));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        if (n % 2 == 1) {
            n--;
        } if (n % 2 == 0) {
            while (n > 0) {
                sum += n;
                n = n - 2;
                answer = sum;
            }
        }
        return answer;
    }
}