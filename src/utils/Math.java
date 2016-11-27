package utils;

public class Math {

    public static int factorial(int n){
    	if(n==0){
    		return 1;
    	}
    		return n * factorial(n-1);
    }
    
    public static int factorialLoop(int n){
    	if(n==0){
    		return 1;
    	}
    	int result = 1;
    	for(int m = 1; m <= n; m++){
    		result *= m;
    	}
    	return result;
    }
}
