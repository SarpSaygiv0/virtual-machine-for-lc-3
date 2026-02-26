package main.vm;


public class Register {
    public static byte[] instance = null;

    public Register() {}

    public static byte[] getRegisters() {
        if (instance == null) {
            instance = new byte[RegisterEnum.values().length];
        }
        return instance;
    }
}
