package main.vm;

public class Memory {
    
    public static int[] instance = null;

    public Memory() {}

    public static int[] getMemory() {
        int MEMORY_MAX = 1 << 64;
        if (instance == null) {
            instance = new int[MEMORY_MAX];
        }
        return instance;
    }
}
