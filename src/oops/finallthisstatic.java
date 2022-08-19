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
public class finallthisstatic {
    final String company="TCS";
    String name;
    int EmployeeId;
    static int totalEmp=0;

    public finallthisstatic(String name, int EmployeeId) {
        this.name = name;
        this.EmployeeId = EmployeeId;
        totalEmp++;
    }
    public void printDetails(){
        System.out.println(name+" "+EmployeeId+" "+company); 
   }
}

class Test{
    public static void main(String[] args) {
        finallthisstatic e1=new finallthisstatic("Rahul", 1345890);
        //System.out.println("Total employee are"+" "+finallthisstatic.totalEmp); 1
        finallthisstatic e2=new finallthisstatic("Jay", 1345894);
        //System.out.println("Total employee are"+" "+finallthisstatic.totalEmp); 2
        finallthisstatic e3=new finallthisstatic("jayraj", 1345899);
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
        System.out.println("Total employee are"+" "+finallthisstatic.totalEmp);  //3
    }
}
