public class nthtermfib {
    public static int fib(int num){
        if(num <=1){
            return num;
        }else{
            return fib(num-1) + fib(num-2);
        }
    }
    public static void main(String[] args){
        System.out.println("nth term of fibonacci series is :-" + fib(19));
    }
}
