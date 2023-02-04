public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else if(n==3){
            return 10*factorial(n-1);
        }
        else{
            return n*factorial(n-1);
        }
    }
