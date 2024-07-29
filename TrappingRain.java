public class TrappingRain {
    public static int traprain(int height[]){//O(n) time complexity
        int tr=0;
        int n=height.length;
        //calculate leftmax boundary - auxilary array
        int ltbd[]=new int[n];
        ltbd[0]=height[0];
        for (int i = 1; i <n; i++) {
            ltbd[i]=Math.max(height[i],ltbd[i-1]);
        }
        //calculate right max boundary  - auxilary array
        int rtbd[]=new int[n];
        rtbd[n-1]=height[n-1];
        for (int i = n-2;i>=0; i--) {
            rtbd[i]=Math.max(height[i],rtbd[i+1]);
        }
        //loop
        for (int i = 0; i < n; i++) {
        //water level =  min (left boundry,right boundary)
            int waterlevel=Math.min(ltbd[i],rtbd[i]);
            //trapped water = waterlevel - height[i]
            tr+=waterlevel-height[i];//width is 1 other wise we will multiple (waterlevel-height[i])*width 
        }
        return tr;
    }
    public static void main (String args[]){
        
        int heights[]={4,2,0,6,3,2,5};
        int rain = traprain(heights);
        System.out.println("Trapped rain water is "+rain);
    }
}
