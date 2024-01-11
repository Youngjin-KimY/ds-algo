package com.rooon.datastructure;

public class ArrayNode<T extends Object> {
    private Object[] arr;
    private int size;
    public ArrayNode next;

    public ArrayNode(int size) {
        this.arr = new Object[size];
        this.size = 0;
    }

    public ArrayNode(int size, ArrayNode next) {
        this.arr = new Object[size];
        this.next = next;
        this.size = 0;
    }

    public void add(T data) {
        arr[size] = data;
        size ++;

        if(arr.length == size) {
            resize();
        }
    }

    public T delete(int idx) {
        T res = null;
        if(arr[idx] != null) {
            res = (T) arr[idx];
        }

        for(int i=idx; i<size; i++) {
            this.arr[i] = arr[i+1];
        }
        size --;

        return res;
    }

    public void resize() {
        Object[] resizedArr = new Object[size * 2];
        for(int i=0;i<size;i++) {
            resizedArr[i] = this.arr[i];
        }

        this.arr = resizedArr;
    }
}
