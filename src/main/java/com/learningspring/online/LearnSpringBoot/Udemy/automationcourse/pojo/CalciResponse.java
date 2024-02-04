package com.learningspring.online.LearnSpringBoot.Udemy.automationcourse.pojo;

public class CalciResponse {

    public CalciResponse(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.result = n1+n2;
    }

    private int n1;
    private int n2;

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getResult() {
        return result;
    }

    private int result;
}
