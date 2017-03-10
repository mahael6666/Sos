package com.mahael;

/**
 * Created by Student on 10.03.17.
 */
public class Main {
    public static void main(String[] args){
        Point3D point3d = new Point3D();
        Point3D point3d1 = new Point3D();
        System.out.println(point3d.toString());
        System.out.println(point3d1.toString());
        if (point3d.equals(point3d1) )
        {
            System.out.println(" yap");
        }
        else
        {
            System.out.println("noyp");
        }
        Vector3D vector3d= new Vector3D(1,-2,3);
        Vector3D vector3d1= new Vector3D(4,5,-6);
        Vector3D vector3d2= new Vector3D(point3d, point3d1);
        System.out.println("Length vector =" + vector3d.lengthVector());
        System.out.println("add vectors " + Vector3DPrcessor.add(vector3d,vector3d1).toString());
        System.out.println("sub vectors " + Vector3DPrcessor.sub(vector3d,vector3d1).toString());
        System.out.println("scalar two vectors " + Vector3DPrcessor.scalar(vector3d1,vector3d));
        System.out.println("Multic vectors " + Vector3DPrcessor.vectorMultic(vector3d,vector3d1).toString());
        System.out.println("is collinearity vectors " + Vector3DPrcessor.isCollinearity(vector3d,vector3d1));

    }

}

