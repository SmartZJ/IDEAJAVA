package day9.baseclass;

import day9.interfacetest.FireProof;

public class FireProofDoor extends Door implements FireProof {

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

}
