package recursion;

public class PrintName {
    public static void main(String[] args) {
        printName("prav",1,7);
    }

    static void printName(String name,int i,int c){
        if(i>c){
            return;
        }
        System.out.println(name);
        printName(name,i+1,c);
    }
}
