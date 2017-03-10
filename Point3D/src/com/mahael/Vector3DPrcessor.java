package com.mahael;

/**
 * Created by Student on 10.03.17.
 */
 public final class Vector3DPrcessor {
    public static Vector3D add(Vector3D first,Vector3D second){
        return new Vector3D(first.get_x() + second.get_x(),first.get_y() + second.get_y(),first.get_z() + second.get_z()) ;
    }
    public static Vector3D sub(Vector3D first,Vector3D second){
        return new Vector3D(first.get_x() - second.get_x(),first.get_y() - second.get_y(), first.get_z() - second.get_z());
    }
     public  static float scalar(Vector3D first,Vector3D second){
         return first.get_x()*second.get_x() + first.get_y()*second.get_y() + first.get_z()*second.get_z();
     }
       public static Vector3D vectorMultic(Vector3D first,Vector3D second){
           return  new Vector3D(first.get_y()*second.get_z() - first.get_z()*second.get_y(),first.get_z()*second.get_x()-first.get_x()*second.get_z(),first.get_x()*second.get_y() - first.get_y()*second.get_x());
       }
    public static boolean isCollinearity (Vector3D first,Vector3D second){
        if (first.get_x()/second.get_x() == first.get_y()/second.get_y() && first.get_y()/second.get_y() == first.get_z()/second.get_z() ){
            return true;
        }
        return false;
    }

}

