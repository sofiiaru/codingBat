public class Array3 {
    //maxSpan
    public int maxSpan(int[] nums) {
        int[] spans=new int[nums.length];

        for(int i=0; i<nums.length; i++){
            for(int j=nums.length-1; j>=0; j--){
                if(nums[i]==nums[j]){
                    spans[i]=(j-i)+1;
                    break;
                }
            }

        }
        int maxSpan=0;
        if(spans.length>0) {
            maxSpan = spans[0];

            for (int s : spans) {
                if (s > maxSpan) {
                    maxSpan = s;
                }
            }
        }
        return maxSpan;
    }
    //**************************************************************

    //canBalance
    public boolean canBalance(int[] nums) {
        int sum=0;
        for(int i: nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
        int targetNum = sum/2;
        int m = 0;
        for(int n:nums){
            targetNum-=n;
            if(targetNum==0)return true;
            //else if(targetNum<0)return false;
        }
        return false;
    }
    //**************************************************************

    //seriesUp
    public int[] seriesUp(int n) {
        int length = n*(n+1)/2;
        int[] arr = new int[length];
        int temp = n;
        for(int i=length-1; i>=0; i--){
            arr[i]=temp;
            temp--;
            if(temp==0){
                n=n-1;
                temp=n;
            }
        }
        return arr;
    }
    //************************************************************

    //fix34
    public int[] fix34(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i =0; i< nums.length-1; i++){
            if(nums[i]==3){
                arr[i]=3;
                arr[i+1]=4;
            }
        }
        for(int j=0; j<nums.length;j++) {
            if (nums[j] != 3 && nums[j] != 4) {
                for (int k = 0; k < nums.length; k++) {
                    if (arr[k] == 0) {
                        arr[k] = nums[j];
                        break;
                    }
                }
            }
        }
        return arr;
    }
    //********************************************************

    //linearIn
    public boolean linearIn(int[] outer, int[] inner) {
        if(outer.length<inner.length)return false;
        int count=0;
        for(int i=0; i< inner.length;i++){
            for(int j=i; j<outer.length;j++){
                if(inner[i]==outer[j]){
                    count++;
                    break;
                }
            }
        }
        if(count==inner.length) return true;
        return false;
    }
    //*****************************************************

    //maxMirror
    public int maxMirror(int[] nums) {
        int[] mirArr=new int[nums.length];
        for(int i=0, j=nums.length-1; j>=0; i++,j--){
            mirArr[i]=nums[j];
        }
        int max=0;
        int count=0;
        for(int k=0;k<nums.length;k++){

            for(int y=0; y<mirArr.length;y++){
                count=0;
                if(nums[k]==mirArr[y]){
                    count++;
                    while(k+count<nums.length && y+count<mirArr.length &&
                            nums[k+count]==mirArr[y+count]){
                        count++;
                    }
                }
                if(count>max)max=count;
            }
        }
        return max;
    }
    //*******************************************************

    //fix45
    public int[] fix45(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i =0; i< nums.length-1; i++){
            if(nums[i]==4){
                arr[i]=4;
                arr[i+1]=5;
            }
        }
        for(int j=0; j<nums.length;j++){
            if(nums[j]!=4 && nums[j]!=5){
                for(int k=0; k<nums.length;k++){
                    if(arr[k]==0){
                        arr[k]=nums[j];
                        break;
                    }
                }
            }
        }
        return arr;
    }
    //*****************************************************

    //squareUp
    public int[] squareUp(int n) {
        int length=n*n;
        int[] arr = new int[length];
        int idx=n;
        for(int i=length-1; i>=0; i-=idx){
            int temp =1;
            for(int j=i;temp<=n; j--){
                arr[j]=temp;
                temp++;
            }
            n--;
        }
        return arr;
    }
    //******************************************************

    //countClumps
    public int countClumps(int[] nums) {
        int count = 0;

        for(int i=0; i< nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                count++;
                do{
                    i++;
                }while(i<nums.length-1 && nums[i]==nums[i+1]);
            }
        }
        return count;

    }


}
