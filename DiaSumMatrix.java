public class DiaSumMatrix {//
    //Logic 
    // for the primary diagonal we have i == j;
    // for secondary diagonal we have i+j = n-1;
    public static void Dsum(int mat[][]){
        int sum =0;
        //Brute Force  O(n^2)
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[0].length; j++) {
        //         if (i==j) {//primary diagonal 
        //             sum+= mat[i][j];
        //         }
        //         if (i+j==mat.length-1) {//secondary diagonal
        //             sum+= mat[i][j];
        //         }
        //     }
        // }
        //linear approch 
        for (int i = 0; i < mat.length; i++) {
            //pd
            sum+=mat[i][i];
            //sd
            if(i!=mat.length-i-1){// overlapping condition 
                sum+=mat[i][i];
            }
        }
        System.out.println("the sum is : "+sum);
    }
    public static void main(String[]args){
        int matrix[][]={{1,2,3,4},{5,6,7,8},
                        {9,10,11,12},{13,14,15,16}};
        Dsum(matrix);                
    }
}
