package com.leo.decorator2;

public class Skills_Q extends Skills {

    private String skillName;

    public Skills_Q(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能Q"+skillName);
        super.learnSkills();
    }
}
