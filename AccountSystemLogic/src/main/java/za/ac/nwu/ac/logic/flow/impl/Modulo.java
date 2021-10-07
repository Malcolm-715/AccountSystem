package za.ac.nwu.ac.logic.flow.impl;

public class Modulo {
    public Integer doMod(int i, int n){
        if(n == 0){
            throw new RuntimeException("Some reason");
        }
        return i % n;
    }
}
