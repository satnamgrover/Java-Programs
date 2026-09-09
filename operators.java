import  java.util.*;
public class operators {
    public static boolean booleanand(boolean a,boolean b){
        return a&&b;
    }
    public static boolean booleanor(boolean a,boolean b){
        return a||b;
    }
    public static boolean booleanxor(boolean a, boolean b){
        return a^b;
    }
    public static boolean booleannot(boolean a){
        return !a;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter true/false :");
        boolean a = sc.nextBoolean();
        System.out.println("enter true/false :");
        boolean b = sc.nextBoolean();
        System.out.println(a+" and "+b+" = "+ booleanand(a,b));
        System.out.println(a+" or "+b+" = "+ booleanor(a, b));
        System.out.println(a+" xor "+ b+" = "+ booleanxor(a,b));
        System.out.println("not " + a +"="+booleannot(a));
        System.out.println("not "+ b +"="+booleannot(b));
        sc.close();


    }}

