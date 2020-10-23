package com.leo.decorator2;

public class Skills_E extends Skills{
    private String skillName;


    public Skills_E(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能e" + skillName);
        super.learnSkills();
    }
}
