package com.mahael;

/**
 * Created by Student on 10.03.17.
 */
public class Vector3D {
    private float _x;
    private float _y;
    private float _z;

    public Vector3D(){
        set_x(0);
        set_y(0);
        set_z(0);
    }

    public Vector3D(float x,float y,float z){
        set_x(x);
        set_y(y);
        set_z(z);
    }

    public Vector3D(Point3D start,Point3D finish ){
        set_x(finish.get_x() - start.get_x());
        set_y(finish.get_y() - start.get_y());
        set_x(finish.get_z() - start.get_z());
    }
    public double lengthVector(){
        return Math.sqrt(get_x()*get_x()+get_y()*get_y()+get_z()*get_z());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3D)) return false;

        Vector3D vector3D = (Vector3D) o;

        if (Float.compare(vector3D._x, _x) != 0) return false;
        if (Float.compare(vector3D._y, _y) != 0) return false;
        if (Float.compare(vector3D._z, _z) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (_x != +0.0f ? Float.floatToIntBits(_x) : 0);
        result = 31 * result + (_y != +0.0f ? Float.floatToIntBits(_y) : 0);
        result = 31 * result + (_z != +0.0f ? Float.floatToIntBits(_z) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + _x +
                ", y=" + _y +
                ", z=" + _z +
                '}';
    }

    public float get_y() {
        return _y;
    }

    public void set_y(float _y) {
        this._y = _y;
    }

    public float get_x() {
        return _x;
    }

    public void set_x(float _x) {
        this._x = _x;
    }

    public float get_z() {
        return _z;
    }

    public void set_z(float _z) {
        this._z = _z;
    }
}
