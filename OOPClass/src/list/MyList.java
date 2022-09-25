package list;

import java.util.Arrays;

public class MyList <E>{
    private int size=0;
    private final static int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList() {
        elements=new Object[DEFAULT_CAPACITY];
    }
    public void add(E e){
        if(size==elements.length){
            ensureCapa();
        }
        elements[size+1]=e;
        size++;
    }
    private void ensureCapa(){
        int newSize=elements.length*2+1;
        elements=Arrays.copyOf(elements,newSize);
    }
    public E get(int i){
        return (E) elements[i];
    }
}