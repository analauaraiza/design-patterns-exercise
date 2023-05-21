package oop.inheritance.tpv.verifone240;

import oop.inheritance.tpv.Display;
import oop.inheritance.tpv.Keyboard;
import oop.inheritance.tpv.TpvDeviceFactory;

public class Verifone240DeviceFactory extends TpvDeviceFactory {
    @Override
    public Keyboard getKeyboard() {
        return new Verifone240KeyboardAdapter();
    }

    @Override
    public Display getDisplay() {
        return new Verifone240DisplayAdapter();
    }
}
