package Chap7;

class Factorial {
    // this is a recusive function
    int fact(int n) {
        int result;

        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
