package com.leo.decorator2;

public class Skills implements Hero {

    Hero hero;

    public Skills( Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        hero.learnSkills();
    }
}
