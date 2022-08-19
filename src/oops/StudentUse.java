package oops;



public class StudentUse {

    public static void main(String[] args) {

//		Student s1 = new Student();
//		s1.name = "Ankush";
//		s1.setRollnumber(-123);
//		
//		Student s2 = new Student();
//		s2.name = "Manisha";
//		s2.setRollnumber(121);
//		
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//                System.out.println(s1.getRollNumber());
//		System.out.println(s2.getRollNumber());
//		//System.out.println(s1);
        Student s1 = new Student("Ankush");
        s1.print();

        Student s2 = new Student("Manisha",121);
        s2.print();
    }

}
