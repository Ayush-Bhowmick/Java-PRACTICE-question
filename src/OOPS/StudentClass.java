package OOPS;

public class StudentClass {
    public static class Student{
        String name;
        int roll;
        double percentage;
    }
    public static void main(String[] args) {
        //classname objectname=new classname();
        Student s1= new Student(); //object declaration
        s1.name= "Ayush"; //initialisations
        s1.roll=38;
        s1.percentage=91.5;

        Student s2= new Student();
        s2.name= "Suchismita";
        s2.roll=55;
        s2.percentage=100;

        Student s3= new Student();
        s3.name="Anitesh";
        s3.roll=48;
        s3.percentage=98.9;

    }
}
