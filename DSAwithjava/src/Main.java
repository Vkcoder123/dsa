public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world!");
//        classconcept obj= new classconcept();
//        System.out.println("obj.x = " + obj.x);
        int [] array={9,6,4,3,8,6};
        int small=array[0];
        for(int i : array){
            if(i<small){
                small=i;
            }
        }System.out.println(small);
    }
}
