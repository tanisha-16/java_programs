/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Lenovo
 */
public class GeometricSum {
    public static double findGeometricSum(int k,int index){
        if(index>k){
            return 0;
        }
        return 1/Math.pow(2, index)+findGeometricSum(k, index+1);

    }
    public static double findGeometricSum(int k){
        return findGeometricSum(k,0);

    }
    public static void main(String[] args) {
        System.out.println(findGeometricSum(3));
    }
}
