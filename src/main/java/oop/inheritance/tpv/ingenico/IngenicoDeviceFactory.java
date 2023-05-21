package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Display;
import oop.inheritance.tpv.Keyboard;
import oop.inheritance.tpv.TpvDeviceFactory;

public class IngenicoDeviceFactory extends TpvDeviceFactory {

    private final Keyboard keyboard = new IngenicoKeyboardAdapter();
    private final Display display = new IngenicoDisplayAdapter();
    @Override
    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public Display getDisplay() {
        return display;
    }
}
