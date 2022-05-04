import java.util.*;

class Condition{
    public static void main(String [] args){
        System.out.println("Enter the Numbers");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
    
        System.out.println("Choose the Operation");
        int operation = sc.nextInt();
        /** 
        *1 -> +
        *2 -> -
        *3 -> *
        *4 -> /
        *5 -> %
        */

        switch(operation){
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if(b == 0){
                System.out.println("Invalid Division");
                }
                else{
                    System.out.println(a/b);
                }
            break;
            case 5 : if(b == 0){
                System.out.println("Invalid Division");
                }
                else{
                System.out.println(a/b);
                }
            break;
            default : System.out.println("invalid operation");
        }
    
        

    }
}
