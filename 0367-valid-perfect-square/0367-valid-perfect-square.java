class Solution {
    public boolean isPerfectSquare(int n) {
        if(n < 2)   return true;
        if (n<10){
            for(int i=2; i<=(n/2)+1; i++){
                if(i*i == n)    return true;
            }
        }
        else if(n >= 10){
            for(int i=2; i<=(n/3)+1; i++){
            if(i*i == n)    return true;
            }
        }
        return false;
    }
}