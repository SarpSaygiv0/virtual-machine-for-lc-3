package main.vm;

public enum ConditionFlagEnum {
    FL_POS(1),
    FL_ZRO(2),
    FL_NEG(4);

    private final int cond;

    ConditionFlagEnum(int cond) {
        this.cond = cond;
    }

    public int cond() {
        return cond;
    }
}
