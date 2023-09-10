package oops.generics;


import java.util.*;

public class CustomArrList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {// my custom method of addition to perfom on arraylist called data
        if (isFull()) {//isfull is my custom method
            resize();//resize is my custom method to resize the zize of an aaray
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];//double the size

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;//now data will point to temp
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrList list = new CustomArrList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add("dfghj");
    }
}
