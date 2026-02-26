package main.vm;

public enum RegisterEnum {
    R_R0(0), R_R1(1), R_R2(2), R_R3(3),
    R_R4(4), R_R5(5), R_R6(6), R_R7(7),
    R_PC(8), R_COND(9), R_COUNT(10);

    private final int code;
    RegisterEnum(int code) { this.code = code; }
    public int code() { return code; }
}
