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
public class Polynomial {

    private int[] data;
    private int nextIndex;

    public Polynomial() {
        data = new int[5];
        nextIndex = 0;
    }

    public int size() {
        return nextIndex;
    }

    public void setCoefficient(int degree, int coeff) {
        if (degree <= nextIndex) {
            data[degree] = coeff;
        } else {
            add(degree, coeff);
        }
    }

    public int getCoefficient(int index) {
        if (index <= nextIndex) {
            return data[index];
        } else {
            return 0;
        }
    }

    public void add(int degree, int coeff) {
        if (degree >= data.length) {
            restructure();
            add(degree, coeff);
        }
        data[degree] = coeff;
        nextIndex = degree;
    }

    public void restructure() {
        int[] temp = data;
        data = new int[data.length * 2];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                System.out.print(getCoefficient(i) + "x" + i + " ");
            }
        }
        System.out.println();
    }

    public Polynomial add(Polynomial p) {
        Polynomial resadd = new Polynomial();
        int size = Math.max(size(), p.size());
        for (int i = 0; i <= size; i++) {
            if (this.getCoefficient(i) != 0 || p.getCoefficient(i) != 0) {
                int coeff = this.getCoefficient(i) + p.getCoefficient(i);
                resadd.setCoefficient(i, coeff);
            }
        }
        return resadd;
    }

    public Polynomial subtract(Polynomial p) {
        Polynomial ressubtract = new Polynomial();
        int size = Math.max(size(), p.size());
        for (int i = 0; i <= size; i++) {
            if (this.getCoefficient(i) != 0 || p.getCoefficient(i) != 0) {
                int coeff = this.getCoefficient(i) - p.getCoefficient(i);
                ressubtract.setCoefficient(i, coeff);
            }
        }
        return ressubtract;
    }

    public Polynomial multiply(Polynomial p) {
        Polynomial resmultiply = new Polynomial();
        for (int i = 0; i <= this.size(); i++) {
            for (int j = 0; j <= p.size(); j++) {
                int coeff = this.getCoefficient(i) * p.getCoefficient(j);
                int degree = i + j;
                coeff += resmultiply.getCoefficient(degree);
                resmultiply.setCoefficient(degree, coeff);
            }
        }
        return resmultiply;
    }
}
