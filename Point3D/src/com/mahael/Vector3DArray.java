package com.mahael;

/**
 * Created by Student on 10.03.17.
 */
public class Vector3DArray {
     Vector3D[] vectorArray;
    int size;
    public Vector3DArray(int size){
        setSize(size);
        vectorArray = new Vector3D[size];
    }

    public Vector3D[] getVectorArray() {
        return vectorArray;
    }

    public void setVector(Vector3D vector, int index) {

        this.vectorArray[index] = vector;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
