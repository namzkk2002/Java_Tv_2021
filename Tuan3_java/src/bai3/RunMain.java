package bai3;

import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Random rd = new Random();
        Guns gun1 = new Guns();
        gun1.setWeaponName("DiepBeDe");
        gun1.setAmmoNumber(100);
        Guns gun2 = new Guns();
        gun2.setWeaponName("DoanXinhGai");
        gun2.setAmmoNumber(100);
        while(gun1.getAmmoNumber()>0&&gun2.getAmmoNumber()>0){
            gun1.Shoot(rd.nextInt(11));
            gun2.Shoot(rd.nextInt(11));

            if (gun1.getAmmoNumber() == 0&&gun2.getAmmoNumber() == 0) {
                System.out.println("ca 2 cung het dan");
                gun1.Load(rd.nextInt(11));
                gun2.Load(rd.nextInt(11));
            }
            else if (gun1.getAmmoNumber()==0) {
                    System.out.println(gun1.getWeaponName() + " thua");
                    break;
            }
            else if(gun2.getAmmoNumber()==0){
                    System.out.println(gun2.getWeaponName() + " thua");
                    break;
            }
        }
    }
}
