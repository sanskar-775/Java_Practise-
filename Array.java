//import java.util.Scanner;

public class Array {
    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]+=1;
        }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
//--------------BASICS-------------------------
//int marks[]=new int[50];
//         Scanner sc=new Scanner (System.in );
//         System.out.println("lenght of array "+ marks.length);
//         //imput
//         // marks[0]=sc.nextInt();
//         // marks[1]=sc.nextInt();
//         // marks[2]=sc.nextInt();
//         // //output
//         // System.out.println("phy   :"+marks[0]);
//         // System.out.println("chem  :"+marks[1]);
//         // System.out.println("maths :"+marks[2]);
//         // //update
//         // marks[2]+=3;
//         // System.out.println("new maths marks "+marks[2]);
