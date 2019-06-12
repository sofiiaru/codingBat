public class String3 {
    //countYZ
    public int countYZ(String str) {
        str=str.toLowerCase();
        int count = 0;
        for(int i=0; i< str.length(); i++){
            if((str.charAt(i)=='y' || str.charAt(i)=='z') && (i==str.length()-1 ||!Character.isLetter(str.charAt(i+1)))) count++;
        }
        return count;
    }
    //*********************************************************

    //gHappy
    public boolean gHappy(String str) {
        if(str.length()==1) return false;
        if(str.length()==2 && str.contains("gg"))return true;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='g'){
                if(i==0 && str.charAt(i+1)!='g')return false;
                if(i==str.length()-1 && str.charAt(i-1)!='g')return false;
                if(str.charAt(i-1)!='g' && str.charAt(i+1)!='g') return false;
            }
        }
        return true;
    }
    //********************************************************

    //sameEnds
    public String sameEnds(String string) {
        String firstHalf = string.substring(0, string.length()/2);
        String secondHalf = string.substring(string.length()/2);

        int idx=-1;
        int i=0;
        do{
            firstHalf=firstHalf.substring(0, firstHalf.length()-i);
            idx=secondHalf.indexOf(firstHalf);
            i=1;
        }while(idx<0);
        return firstHalf;
    }
    //********************************************************

    //countTriple
    public int countTriple(String str) {
        int count=0;
        if(str.length()<3) return count;
        for(int i=0; i<str.length()-2;i++){
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
    //***********************************************************

    //equalIsNot
    public boolean equalIsNot(String str) {
        int countIs=0, countNot=0;
        for(int i=0; i<str.length()-1;i++){
            if(str.substring(i,i+2).equals("is")){
                countIs++;
            }else if(i<str.length()-2 && str.substring(i,i+3).equals("not")){
                countNot++;
            }
        }
        return countIs==countNot;
    }
    //**********************************************************

    //sumDigits
    public int sumDigits(String str) {
        int sum=0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                int temp = Integer.parseInt(str.substring(i,i+1));
                sum+=temp;
            }
        }
        return sum;
    }
    //***********************************************************

    //maxBlock
    public int maxBlock(String str) {
        int count=0;
        int temp=1;
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                temp++;
            }else{
                temp=1;
            }
            if(temp>count)count=temp;
        }
        return count;
    }
    //******************************************************

    //notReplace
    public String notReplace(String str) {
        if(str.length()<2)return str;
        String result="";
        for(int i=0; i<str.length(); i++){
            if(i==0 && str.charAt(i)=='i' && str.charAt(i+1)=='s'
                    &&(str.length()==2 || !Character.isLetter(str.charAt(i+2)))){
                result+="is not";
                i++;
            }
            else if(i!=0 && i+1<str.length() && !Character.isLetter(str.charAt(i-1))
                    && str.charAt(i)=='i' && str.charAt(i+1)=='s'
                    &&(i+2==str.length() || !Character.isLetter(str.charAt(i+2)))) {
                result+="is not";
                i++;
            }
            else{
                result+=str.charAt(i);
            }
        }
        return result;
    }
    //*******************************************************************

    //sumNumbers
    public int sumNumbers(String str) {
        String temp="";
        int result=0;
        for(int i =0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    temp+=str.charAt(i);
                    i++;
                }
                result+=Integer.parseInt(temp);
                temp="";
            }
        }
        return result;
    }
    //*****************************************************************

    //withoutString
    public String withoutString(String base, String remove) {
        String baseTemp = base.toLowerCase();
        String removeTemp = remove.toLowerCase();
        if(!baseTemp.contains(removeTemp)) return base;

        int i=-1;
        do{
            baseTemp = base.toLowerCase();
            i = baseTemp.indexOf(removeTemp);//8
            if(i>-1 && i+remove.length()<baseTemp.length()){
                base=base = base.substring(0,i)+base.substring(i+remove.length());
            }else if(i>-1){
                base = base.substring(0,i);
            }
        }while(i>-1);

        return base;
    }
    //******************************************************************

    //mirrorEnds
    public String mirrorEnds(String string) {
        String result = "";
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        if(sb.equals(string)) return string;
        if(string.length()<=1) return string;


        for(int i=0; i<=string.length()-1; i++){
            if(string.charAt(i)==string.charAt(string.length()-i-1)){
                result+=string.charAt(i);
            }else{
                break;
            }
        }
        return result;
    }



}
