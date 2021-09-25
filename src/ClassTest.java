//public class ClassTest {
//
//    import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//    class Result {
//
//        /*
//         * Complete the 'commonPrefix' function below.
//         *
//         * The function is expected to return an INTEGER_ARRAY.
//         * The function accepts STRING_ARRAY inputs as parameter.
//         */
//
//        public static List<Integer> commonPrefix(List<String> inputs) {
//            List<Integer> arraySum = new ArrayList<>();
//            for(String s : inputs){
//                int sumOfString =0;
//                for(int i=0;i<s.length();i++){
//                    String suffix="";
//                    String prefix="";
//                    if(i>0){
//                        prefix = s.substring(0, i+1);
//                        suffix = s.substring(i, s.length());
//                        int commomPrefix =0;
//                        for(int j=0;j<prefix.length();j++){
//                            ;
//                            if(prefix.charAt(0)==suffix.charAt(0)){
//                                commomPrefix = commomPrefix+1;
//                            }{
//                                break;
//                            }
//                        }
//                        sumOfString = sumOfString +commomPrefix;
//                    }else{
//                        sumOfString=s.length();
//                    }
//                }
//
//                arraySum.add(sumOfString);
//
//            }
//            return arraySum;
//        }
//
//    }
//
//    public class Solution {
//}
