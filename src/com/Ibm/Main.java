package com.Ibm;

public class Main {

    public static void main(String[] args) {
            getMane(100000,4.23,360);
            getYerMane(10000, 3.31, 24,10000);
    }

    /**
     * 存入金额获得收益
     * @param benjin 存入金额
     * @param nianhua 每日年化率
     * @param tian 存入天数
     */
    private static void getMane(double benjin, double nianhua, int tian){
        double jine = benjin;
        for (int i = 0; i < tian; i++) {
            jine = jine+(nianhua/100*jine/360);
        }
        System.out.print("存入金额为："+benjin+"元\t");
        System.out.println("存入天数为："+tian+"天");
        System.out.print("每日年化率为："+nianhua+"%\t");
        System.out.println(tian+"天共收益"+(jine-benjin)+"元");
        System.out.println("总金额为："+jine+"元");
    }

    /**
     * 每月加入一定金额
     * @param benjin 本金
     * @param nianhua 每日年化率
     * @param yer 月
     * @param yerMane 每月加入金额
     */
    private static void getYerMane(double benjin, double nianhua, int yer,double yerMane){
        double zjine = benjin;
        double yici = 0;
        for (int i = 0; i < yer; i++) {
            for (int j = 0; j < 30; j++) {
                zjine = zjine+(nianhua/100*zjine/360);
            }
            if (i < yer-1) {
                yici+=yerMane;
                zjine+=yerMane;
            }
        }
        System.out.print("存入金额为："+benjin+"元\n");
        System.out.println("存入"+yer+"月，每月加入"+yerMane+"元,依次加入"+yici+"元");
        System.out.print("每日年化率为："+nianhua+"%\n");
        System.out.println(yer+"月共收益"+(zjine-benjin-yici)+"元");
        System.out.println("总金额为："+zjine+"元");
    }
}
