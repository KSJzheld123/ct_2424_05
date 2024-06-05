package com.ki.level0.p120829;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int angle) {
        int answer = -1;
        if (angle == 180) {
            answer = 4;
            return answer;
        } else if (angle < 180) {
            if(angle > 90) {
                answer = 3;
                return  answer;
            } else if(angle == 90) {
                answer = 2;
            } else if (angle < 90) {
                answer = 1;
            }
        }
        return answer;
    }
}