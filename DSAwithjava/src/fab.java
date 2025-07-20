public class fab {
    int x=0;
    int x1=1;
    public static void main (String[] args){
        int x=0;
        int x1=1;
        System.out.println(x);
        System.out.println(x1);
        for (int i=0;i<18;i++){
            int newfeb=x+x1;
            System.out.println(newfeb);
            x=x1;
            x1=newfeb;

        }
    }
}
