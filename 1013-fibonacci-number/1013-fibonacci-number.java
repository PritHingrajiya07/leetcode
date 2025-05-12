class Solution {
    public int fib(int n) {

        int F=1;
        int S = 1;

        for(int i=1;i<=n;i++){
            int ans = F+S;

            F = S;
            S =ans;
        }
        return ( S-F );
    } 
    
}