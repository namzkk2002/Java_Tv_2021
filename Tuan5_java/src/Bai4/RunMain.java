package Bai4;

import java.util.SortedMap;

public class RunMain {
    public static void main(String[] args) {
        Sum<Integer> sum1 = new Sum<>(5,6);
        Sum<Long> sum2 = new Sum<>(500l,600l);
        Sum<Float> sum3 = new Sum<>(5.5f,6.6f);
        Sum<Double> sum4 = new Sum<>(5.2,6.3);
        System.out.println("Tong 2 so = "+(sum1.getA()+sum1.getB()));
        System.out.println("Tong 2 so = "+(sum2.getA()+sum2.getB()));
        System.out.println("Tong 2 so = "+(sum3.getA()+sum3.getB()));
        System.out.println("Tong 2 so = "+(sum4.getA()+sum4.getB()));

    }
}
