/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CustomLIstPackage;

import java.util.Arrays;

/**
 *
 * @author acer
 */
public class CustomList<T> {

    private int size = 0;
    private Object[] elements;

    public CustomList() {
        elements = new Object[10];
    }

    public void add(T e) {
        if (size == elements.length) {
            CheckBound();
        }
        elements[size] = e;
        size++;
    }

   public void addAll(CustomList<T> list) {

        for (int i = 0; i < list.size; i++) {
            if (size == elements.length) {
                CheckBound();
            } else {
                elements[size++] = list.get(i);
            }

        }
    }

    private void CheckBound() {
        int nsize = elements.length * 2;
        elements = Arrays.copyOf(elements, nsize);
    }

    public T get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (T) elements[i];
    }

    public T remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - (i + 1);
        System.arraycopy(elements, i + 1, elements, i, numElts);
        size--;
        return (T) item;
    }

    public T[] removeAll(CustomList<T> list) {
        Object[] item = new Object[list.size + 1];
        int s = 0;
        for (int i = 0; i < list.size; i++) {
            if (i >= size || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
            }

            for (int j = 0; j < elements.length; j++) {
                if (elements[j] == list.get(i)) {
                    item[s++] = list.get(i);
                    int numElts = elements.length - (j + 1);
                    System.arraycopy(elements, j + 1, elements, j, numElts);
                    size--;
                }
            }

        }
        return (T[]) item;
    }
    public T[] clear() {
        Object[] item = new Object[elements.length + 1];
        int s=0;

            for (int j = 0; j < elements.length; j++) {
                
                    item[s++] = elements[j];
                    int numElts = elements.length - (j + 1);
                    System.arraycopy(elements, j + 1, elements, j, numElts);
                    size--;
                }
            

        size=0;
        return (T[]) item;
        
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(elements[i].toString());
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
