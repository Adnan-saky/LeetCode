class Solution {
    public boolean isPalindrome(int x) {
        int n = 0,sum=0;
        int org = x;
        while( x!=0 ){
            n = x % 10;
            //System.out.println("n = "+n);
            sum = sum*10 + n;
            //System.out.println("sum = "+sum);
            x = x/10;
            //System.out.println("x = "+x);
        }
        if(org >= 0){
            if(sum == org){
                return true;
            }else return false;
        }else return false;
    }
}