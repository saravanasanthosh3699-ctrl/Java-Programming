import java.util.*;
class calci{
    public static void main(String args[]){
       
        Scanner scan = new Scanner(System.in);
       
        //  Scanner scan = new Scanner(System.in).CharAt();
        System.out.println("Numbers count");
        int a = scan.nextInt();
        int[] num  = new int[a];
        // System.out.println("Numbers count");
        // int a = scan.nextInt();
        
        System.out.println("Enter the numbers");
        for( int i = 0; i <= a-1; i = i + 1)
        {
             num[i] = scan.nextInt();
        }

        for( int i = 0; i <= a-1; i = i + 1)
        {
             System.out.println();
        }
        //  int b = scan.nextInt();
        // int d = scan.nextInt();



        
        System.out.println("Get input for operation");
        scan.nextLine();
        // char c;

        // for( int i = 0; i <= b; i = i + 1)
        // {

           
        // }
         Character c = scan.next().charAt(0);
        System.out.println("Final Ans");
        float k = 0;
        // float g = 1;

     
        

        
        for(int i = 0; i <= a-1; i = i + 1)
        {
        if( c == '+')
        {
             k = k + num[i];
        }
        else if( c == '-')
        {
             k = -(k) +(-num[i]);
        }
        }
        if (c == '+' || c == '-')
        {
        System.out.println(k);
        }
        // // scan.nextLine();
        // Character d = scan.next().charAt(0);
    
        float g = 1; 
        for(int i = 0; i <= a-1; i = i + 1)
        {
        if( c == '*')
        {
              g = g * num[i];
        } 
        // For division put first input number as Divisor and second input number as divident    
        else if( c == '/')
        {
            g =  num[i] / g;
        }
        }
        if (c == '*' || c == '/')
        {
        System.out.println(g);
        }
        
        // System.out.println(k);
        // System.out.println(g);
        
       
        
        
    } 
}       

    
