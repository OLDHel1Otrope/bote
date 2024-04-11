public static int gcd(int a, int b) {
        // Base case
        if (b == 0)
            return a;
        // Recursive case
        return gcd(b, a % b);
    }
    
public static int lcm(int a, int b) {
    	int d=gcdf(a,b);
    	return (a*b)/d;
    }
