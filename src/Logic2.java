public class Logic2 {
    //makeBricks
    public boolean makeBricks(int small, int big, int goal) {
        int smallLength=small*1;
        int bigLength = big*5;
        if(smallLength+bigLength>=goal){
            if(goal<5 && smallLength>=goal){
                return true;
            }else if(goal%5==0||goal%5<=smallLength){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    //---------------------------------------------------------------

    //noTeenSum
    public int noTeenSum(int a, int b, int c) {
        int sum = fixTeen(a)+fixTeen(b)+fixTeen(c);
        return sum;
    }

    public int fixTeen(int n){
        if(n>=13 && n<=19 && n!=15 && n!=16){
            return 0;
        }
        return n;
    }
    //---------------------------------------------------------------

    //blackjack
    public int blackjack(int a, int b) {

        if(a<=21 && b<=21){
            if(a>b){
                return a;
            }else{
                return b;
            }
        }else if(a<=21 && b>21){
            return a;
        }else if(b<=21 && a>21){
            return b;
        }
        return 0;
    }
    //----------------------------------------------------------------

    //loneSum
    public int loneSum(int a, int b, int c) {
        int sum=0;
        if(a!=b && a!=c)sum+=a;
        if(b!=a && b!=c) sum+=b;
        if(c!=b && c!=a)sum+=c;

        return sum;
    }
    //------------------------------------------------------------------

    //roundSum
    public int roundSum(int a, int b, int c) {
        int sum = round10(a)+round10(b)+round10(c);
        return sum;
    }

    public int round10(int num){
        if(num%10>=5){
            num=num+(10-num%10);
        }else{
            num=num-num%10;
        }
        return num;
    }
    //----------------------------------------------------------------

    //evenlySpaced
    public boolean evenlySpaced(int a, int b, int c) {
        if(b>a && c>b && b-a==c-b)return true;//2,4,6
        else if(a>b && c>a && a-b==c-a)return true;//4,2,6
        else if(a>b && b>c && a-b==b-c) return true;//6,4,2
        else if(a>c && b>a && b-a==a-c)return true;//4,6,2
        else if(a>c && c>b && a-c==c-b)return true;//6,2,4
        else if(a==b && b==c)return true;
        return false;
    }
    //-------------------------------------------------------------------

    //luckySum
    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a!=13){
            sum+=a;
            if(b!=13){
                sum+=b;
                if(c!=13){
                    sum+=c;
                }
            }
        }

        return sum;
    }
    //------------------------------------------------------------------

    //closeFar
    public boolean closeFar(int a, int b, int c) {
        if((Math.abs(a-b)<=1 && Math.abs(a-c)>=2 && Math.abs(b-c)>=2) ||
                (Math.abs(a-c)<=1 && Math.abs(a-b)>=2 && Math.abs(b-c)>=2)){
            return true;
        }
        return false;
    }
    //-------------------------------------------------------------------

    //makeChocolate
    public int makeChocolate(int small, int big, int goal) {
        int smallBar = small*1;
        int bigBar = big * 5;
        int target = 0;
        if(smallBar+bigBar>=goal){
            if(goal>=bigBar){
                target = goal-bigBar;
                return target;
            }else if(goal%5<=smallBar){
                target = goal%5;
                return target;
            }
        }
        return -1;
    }


}
