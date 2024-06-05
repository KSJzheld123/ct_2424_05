package com.ki.level0.p120830;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int nw = 12000;
        int ns = 0;
        int kw = 2000;
        int ks = 0;

        ns = nw * n;

        while(n >= 10) {
            k = k - 1;
            n = n - 10;
        } if(n < 10) {
            ks = k * kw;
        }


        answer = ns + ks;

        return answer;
    }
}