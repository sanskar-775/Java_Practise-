public class OOPS2 {
    public static void main(String args[]){
        Student s1=new Student("sam");
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;


    }
}
    class Student{
        String name;
        int []marks ;
        Student(String name){
            this.name = name;
            marks= new int [3];
            System.out.println("Constructor is called !!!");
        }
        //SHALLOW CONSTRUCTOR

        // Student(Student s1){
        //     marks = new int [3];
        //     this.name=s1.name;
        //     this.marks=s1.marks;
        // }
        //DEEP CONSTRUCTOR

        // Student(Student s1){
        //     marks = new int [3];
        //     this.name=s1.name;
        //     for (int i = 0; i < marks.length; i++) {
        //         this.marks[i]=s1.marks[i];
        //     }
        // }
    }
