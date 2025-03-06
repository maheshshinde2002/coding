package whileloop.java;

public class printsumofdigit {
    public static void main(String[] args) {
       int rem;
       int sum=0;
       int n=6321;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);        
    }    
}
