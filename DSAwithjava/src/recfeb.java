public class recfeb {
    static int count=2;
    public static void recurr(int num, int num1) {
        if (count <= 19) {
            int fab = num + num1;
            System.out.println(fab);
            num1 = num;
            num = fab;
            count+=1;
            recurr(num, num1);
        }
        else{
            return;
        }

        }
    public static void main(String[] args){
        System.out.println(0);
        System.out.println(1);
        recfeb.recurr(1,0);
    }



}