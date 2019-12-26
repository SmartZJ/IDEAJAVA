package day9.baseclass;

import day9.interfacetest.Bulletproof;

public class BulletProofWindow implements Bulletproof {
    @Override
    public void bulletproof() {
        System.out.println("防弹");
    }
}
