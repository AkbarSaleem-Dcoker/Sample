public class StringReverse {
    public static void main(String[] args) {
        String s= "Geeks For Geeks";

        // String Reverse

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println("Reverse String :"+sb);

        // Another way

        int strLength = s.length();
        int j=0;
        char[] reverse = new char[strLength];
        for(int i=strLength-1;i>=0;i--){
            reverse[j]=s.charAt(i);
            j++;
        }
        System.out.println("Reverse String with Chart array :"+ String.valueOf(reverse));
    }
}
