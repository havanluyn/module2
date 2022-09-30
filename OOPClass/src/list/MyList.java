package list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class MyList<E>  {
    private int size = 0;
    private final static int DEFAULT_CAPACITY = 10;
    private E elements[];

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2 + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        return (E) elements[i];
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) return i;
        return -1;
    }
    public void remove(int index) {

        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];

        elements[size - 1] = null;

        size--;
    }
    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public E clone(){
        MyList<E> newList =new MyList<>();
        for (int i = 0; i < size; i++){
            newList.add(elements[i]);
        }
        return (E) newList;
    }
    public int size(){
        return size;
    }
    public void add(int index, E value) {
        if (size >= elements.length) {
            ensureCapa();
        }
        if (index > 0 || index < size){
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = value;
            size++;
        }
    }

    public void sort(){

    }
    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}