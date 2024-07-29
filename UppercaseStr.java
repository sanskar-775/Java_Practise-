public class UppercaseStr {
    public static String Upcase(String str){
        StringBuilder sb =new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==' '&& i<str.length()-1) {// as the new word will start after a space
                sb.append(str.charAt(i));//appending the space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));  
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main (String args[]){
        String str="hi, i am sanskar sharma";
        System.out.println(Upcase(str));
    }
}
