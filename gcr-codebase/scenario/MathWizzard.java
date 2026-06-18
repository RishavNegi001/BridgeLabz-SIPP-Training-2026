public class MathWizard{
    public static void main(String[] args){
        int n =5;
        int a =5;
        int b = 25;
        System.out.println(fact(n));
        System.out.println("Prime number: "+isPrime(n));
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
        System.out.println(power(a,b));
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    public static int power(int base, int exp){
        if(exp==0) return 1;
        int half = power(base,exp/2);
        if(exp%2 == 0){
            return half*half;
        }
        else{
            return base * half * half;
        }
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact((n-1));
    }

}