package com.hitech.day08_code.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "小诗诗";
        gf1.age = 18;
        gf1.gender = "萌妹子";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);
        gf1.sleep();
        gf1.eat();

        System.out.println("===================");
        GirlFriend gf2 = new GirlFriend();
        gf2.name = "小丹丹";
        gf2.age = 19;
        gf2.gender = "萌妹子";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);
        gf2.sleep();
        gf2.eat();
    }
}
