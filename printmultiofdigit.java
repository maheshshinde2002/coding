package whileloop.java;

public class printmultiofdigit {
    public static void main(String[] args) {
        int n=3521;
        int rem;
        int mult=1;
        while(n!=0){
            rem=n%10;
            mult=mult*rem;
            n=n/10;
        }
        System.out.println(mult);
    }
    
}
