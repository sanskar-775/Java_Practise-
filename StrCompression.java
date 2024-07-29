public class StrCompression {
    public static String Compress(String str){
        String newstr=new String("");
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if (count>1) {
                newstr+=count.toString();
            }
        }
        return newstr;
    }
    public static String Compresssb(String str){//O(n)
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main (String[]args){
        String str="aaabbcccdd";
        System.out.println(Compress(str));
        System.out.println(Compresssb(str));
    }
}
