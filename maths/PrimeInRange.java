package maths;
//Sieve of Eratosthenes Method:
public class PrimeInRange {
    public static void main(String[] args) {
        int n =40;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }

static void sieve(int n , boolean[] primes){
    for (int i = 2; i*i <=n; i++) {
        if(primes[i] == false){
            for (int j = i*2; j <=n; j+=i) { // fevry multiple of that no will be mraked prime
                primes[j] = true;
            }
        }
    }

    for (int i = 2; i <=n ; i++) {
        if(primes[i]== false){
            System.out.print(i+ " ");
        }
    }
}
}
