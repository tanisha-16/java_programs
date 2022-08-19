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
//public class Sample {
//    
//}
//class Student1{
//    int roll_no;
//    String name;
//}
//class Test {
//        public static void main (String[] args) {
//        Student1 s=new Student1();
//        System.out.println(s);
//    }
//}
class Student1{
    String name;
    int rollNo;
    Student1(int num){
    rollNo = num;
    }   
    public void print(){
    System.out.print(name +" " + rollNo+" ");
    }
}

class StudentUse1 {
    public static void main(String[] args) {
    Student1 s = new Student1(12);
    s.print();
    }
}   