class Solution {
    public int fib(int n) {

        // int F=1;
        // int S = 1;

        // for(int i=1;i<=n;i++){
        //     int ans = F+S;

        //     F = S;
        //     S =ans;
        // }
        // return ( S-F );


        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    } 
    
}