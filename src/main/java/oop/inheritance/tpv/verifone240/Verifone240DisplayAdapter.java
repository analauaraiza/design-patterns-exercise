package oop.inheritance.tpv.verifone240;

import oop.inheritance.tpv.Display;
import oop.library.v240m.VerifoneV240mDisplay;

public class Verifone240DisplayAdapter implements Display {

    VerifoneV240mDisplay verifoneV240mDisplay = new VerifoneV240mDisplay();

    @Override
    public void print(int x, int y, String message) {
        verifoneV240mDisplay.print(x,y,message);
    }

    @Override
    public void clear() {

    }
}
