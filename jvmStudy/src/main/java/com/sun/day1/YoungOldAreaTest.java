package com.sun.day1;

/** 测试：大对象直接进入老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * @author shkstart  shkstart@126.com
 * @create 2020  21:48
 */
public class YoungOldAreaTest {
    public  int a;
    public static void main(String[] args) {
        int i ;
        YoungOldAreaTest youngOldAreaTest = new YoungOldAreaTest();
        System.out.println(i);
    }
}
