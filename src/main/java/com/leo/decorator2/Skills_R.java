package com.leo.decorator2;

public class Skills_R extends Skills {
    private String skillName;

    public Skills_R(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能r"+skillName);
        super.learnSkills();
    }
}
