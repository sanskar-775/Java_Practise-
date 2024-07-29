public class SubArr {
    public static void printSubArrays(int num[]){
        int ts=0;
        for (int i = 0; i < num.length; i++) {//each element
            int start =i;
            for (int j =i; j < num.length; j++) {//pairs
                int end =j;
                for (int k = start; k <=end; k++) {//print
                    System.out.print(num[k]+" ");//subarray              
                }
                ts++;//subarray
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of sub arrays :"+ts);
    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        printSubArrays(numbers);
    }
}
