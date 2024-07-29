public class PairsArr {
    public static void printPairs(int num[]){
        int tp=0;
        for(int i=0;i<num.length;i++){
            int cur=num[i];
            for (int j = i+1; j < num.length; j++) {
                System.out.print("("+cur+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs :"+tp);
    } 
    public static void main(String[]args){
        //int[]numbers=new int[5];
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);

    }
}
