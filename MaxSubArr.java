public class MaxSubArr {
    public static void BruteSubArrays(int num[]){
        
        int larsum=Integer.MIN_VALUE;
        int smlsum=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {//each element
            int start =i;
            for (int j =i; j < num.length; j++) {//pairs
                int end =j;
                int sum=0;
                for (int k = start; k <=end; k++) {//print
                    //subarray
                    sum+=num[k];  
                }
                System.out.print(sum);//subarray
                if(larsum<sum){
                    larsum=sum;
                }
                if(smlsum>sum){
                    smlsum=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("largest sum of sub arrays :"+larsum);
        System.out.println("smallest sum of sub arrays :"+smlsum);
    }
    public static void PrefixSubArrays(int num[]){ 
        int maxsum=Integer.MIN_VALUE;
        int smlsum=Integer.MAX_VALUE;
        int prefix[]=new int[num.length];//another array to 
        prefix[0]=num[0];
        for (int i = 1; i < prefix.length; i++) {//we make this array so as to pre fix the sum of the original arrays
            prefix[i]=prefix[i-1]+num[i];
        }
        //int smlsum=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {//each element
            int start =i;
            for (int j =i; j < num.length; j++) {//pairs
                int end =j;
                int sum= start ==0 ? prefix[end]: prefix[end]-prefix[start -1];
                if(maxsum<sum){
                    maxsum=sum;
                }
                if(smlsum>sum){
                     smlsum=sum;
                }
            }  
        }
        System.out.println("largest sum of sub arrays :"+maxsum);
        System.out.println("smallest sum of sub arrays :"+smlsum);
    }
    public static void Kadanes(int num[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int sml=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {//for all -ve number array
            if(sml<num[i]){
                sml=num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if((cs+=num[i])<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        if (ms==0) {//when alll numbers are negative
            ms=sml;
        }
        System.out.println("maximum sum is "+ms);
    }
    public static void main(String[]args){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        //BruteSubArrays(numbers);
        //PrefixSubArrays(numbers);
        Kadanes(numbers);
    }
}
