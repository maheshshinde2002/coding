

public class armstrongno {
    public static void main(String[] args) {
        int n=153;
        int rem;
        int sum=0;
        int temp=n;
        while(n!=0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("armstrong no");
        }
        else{
            System.out.println("not armstrong no");
        }
    }
    
}
