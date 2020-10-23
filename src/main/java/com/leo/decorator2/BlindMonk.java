package com.leo.decorator2;

public class BlindMonk implements Hero{
    String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    public void learnSkills() {
        System.out.println("学习了以上技能");
    }
}
