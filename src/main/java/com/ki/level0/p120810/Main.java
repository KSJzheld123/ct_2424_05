package com.ki.level0.p120810;

public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        while (num1 >= 0) {
            answer = num1;
            num1 -= num2;
        }
        return answer;
    }
}
