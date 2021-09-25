public class Test {
    public static void main(String[] args) {

       int size =  leastSize("bc","bcdbcd");
        System.out.println("least size :" +size);

    }


    public static int leastSize(String s, String t){
        int size = -1;
        boolean checkFlag = false;
        String cancat="";
        if(!s.isEmpty() && !t.isEmpty()){
            if(s.equals(t)){
                checkFlag=true;
            }else{
                while(cancat.length()<s.length()){
                    cancat+=t;
                    if(cancat.equals(s)){
                        checkFlag =true;
                    }
                }
            }
        }


        if(checkFlag){
            String smallStr = "";
            int k=0;
            while(k<t.length()){

                String concatInner = t.substring(0,k+1);
                while(concatInner.length()<t.length()){
                    concatInner+=concatInner;
                }

                if(concatInner.equals(t)){
                    smallStr = t.substring(0,k+1);
                    k=t.length();
                }

                k++;
            }

            size=smallStr.length();
        }


        return size;
    }
}
