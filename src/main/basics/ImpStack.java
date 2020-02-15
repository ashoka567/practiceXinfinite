package basics;

import basics.interfaces.Astack;

import java.util.Stack;

public  class  ImpStack implements Astack {

    public Object objects[]  = null;

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public ImpStack(){
        objects = new Object[MAX_ARRAY_SIZE];
    }

    public ImpStack(int k){
        objects = new Object[k];
    }

    @Override
    public boolean isEmpty() {
        if(g > -1){
            return false;
        }
        return true;
    }

    @Override
    public Object push(Object o) {
        return null;
    }

    @Override
    public Object top() {
        if(g > -1){
            return  objects[g];
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object pop() {
        return null;
    }
}
