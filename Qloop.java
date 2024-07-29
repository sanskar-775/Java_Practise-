// 1    2   3    4   5
//  11   12  13   14  15
//  21   22  23   24  25
//  16   17  18   19  20
//  6    7    8   9   10

//Import Section
import java.util.Scanner;
public class Qloop {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //Input of number of rows
        System.out.print("Enter the number of rows :");
        int row=sc.nextInt();
        int counter=1;
        int arr[][]=new int[row][row];
        //entering the values
        for (int i = 0; i <row; i++) {
            if (i%2==0) {
                for (int j = 0; j < row; j++) {
                    arr[i][j]=counter;
                    counter++;
                }
            } else {
                for (int j = 0; j < row; j++) {
                    arr[row-i][j]=counter;
                    counter++;
                }
            }
        }
        //output
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// for (int i = 1; i<= row; i++) {
//             if(i%2==0){
//                 counter+=row;
//                 continue;
//             }    
//             for (int j = 1; j <= row; j++) {
//                 System.out.print(counter+" ");
//                 counter ++;
//             }
//             System.out.println();
//         }
//         if (row%2!=0) {
//             counter-=row;
//         } else {
//             counter+=row;
//         }
//         for (int i = 1; i<=row; i++) {
//             if(i%2!=0){
//                 counter-=row;
//                 continue;
//             }    
//             for (int j = 1; j <= row; j++) {
//                 System.out.print(counter+" ");
//                 counter ++;
//             }
//             System.out.println();
//         }