

public class pallindromenumber {
    public static void main(String[] args) {
        int n=121;
        int rev=0;
        int rem;
        int temp=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
       if(temp==rev){
        System.out.println("pallindrome");
        }
      else{
        System.out.println("not pallindrome");
     }
}
}
