import java.util.Scanner;
class calci{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Numbers count");
        int a = scan.nextInt();
        int[] num  = new int[a];
        // System.out.println("Numbers count");
        // int a = scan.nextInt();
        
        System.out.println("Enter the numbers");
        for( int i = 0; i <= a-1; i = i + 1)
        {
            // System.out.println(num[i]);
            num[i] = scan.nextInt();

        }

        for( int i = 0; i <= a-1; i = i + 1)
        {
             System.out.println(num[i]);
            // num[i] = scan.nextInt();

        }
        // int b = scan.nextInt();
        // int d = scan.nextInt();



        // scan.nextLine();
        System.out.println("Get input for operation");
        scan.nextLine();
        String c = scan.nextLine();
        // scan.nextLine();
        System.out.println("Final Ans");
        int k = 1;

        
        for(int i = 0; i <= a-1; i = i + 1)
        {
        if( c.equals("addition"))
        {
             k = k + num[i];
             
        }
        else if( c.equals("subraction"))
        {
             k = k - num[i];
             
        }
        else if( c.equals("multiplication"))
        {
              k = k * num[i];
        
        }     
        else if( c.equals("division"))
        {
             k = k / num[i];
             
        }
        }
        System.out.println(k);
        
        
        
    } 
}       

    
