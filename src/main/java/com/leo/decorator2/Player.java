package com.leo.decorator2;

public class Player {
    public static void main(String[] args) {
        Hero hero = new BlindMonk("李青");

        Skills skills = new Skills(hero);
        Skills q = new Skills_Q(skills, "天音波/回音击");
        Skills w = new Skills_W(q, "金钟罩/铁布衫");
        Skills e = new Skills_E(w, "天雷破/催筋断骨");
        Skills r = new Skills_R(e, "猛龙摆尾");

        r.learnSkills();

    }
}
