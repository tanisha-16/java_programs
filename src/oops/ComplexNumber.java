/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author Lenovo
 */
public class ComplexNumber {

    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getimaginary() {
        return imaginary;
    }

    public int getreal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real; 
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber c1) {
        this.real += c1.real;
        this.imaginary += c1.imaginary;
    }

    public void multiply(ComplexNumber c1) {
        int ireal = this.real * c1.real - this.imaginary * c1.imaginary;
        int iimaginary = this.imaginary = this.real * c1.imaginary + this.imaginary * c1.real;
        this.real = ireal;
        this.imaginary = iimaginary;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int newreal = c1.real + c2.real;
        int newimaginary = c1.imaginary + c2.imaginary;
        ComplexNumber c3 = new ComplexNumber(newreal, newimaginary);
        return c3;
    }

    public ComplexNumber conjugate() {
        ComplexNumber c1 = new ComplexNumber(real, -imaginary);
        return c1;
    }

    public void print() {
        if (imaginary > 0) {
            System.out.println(real + "+" + imaginary + "i");
        } else {
            System.out.println(real + "-" + Math.abs(imaginary) + "i");
        }
    }

}
