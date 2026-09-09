public class patterns {
    public static void main(String[] args) {
        int i ,j ;
//the whole code taht is commented was for solid rectangle
       // for (i=1; i<=4; i++ )
        //{
      //      for(j=1; j<=5; j++){
      //          System.out.print("*");
      //      }
      //      System.out.println("*");
      //  }

// this code is for print hollow rectangle
        // for (i=1; i<=4; i++){
        //     for (j=1; j<=4; j++){
        //         if(i==1 || j ==1 || i==4 || j==4){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
            
        //     }
        //     System.out.println();
        // }

//this code is for half pyramid

        // for(i=0; i<4; i++){
        //     for(j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }

// this code is for inverted half pyramid

        // for(i=4; i>=1; i--){
        //     for(j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

// this code is for inverted half pyramid(rotated by 180 degree)

        // for(i=1; i<=4; i++){
        //         for(j=1; j<=4-i; j++){
        //                 System.out.print(" ");
        //         }
        //         for(j=1; j<=i; j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        // }

// this code is for half pyramid with numbers

        // for(i=1; i<=5; i++){
        //         for(j=1; j<=i; j++){
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }

// this code is for inverted half pyramid with numbers

        // for(i=5; i>=1; i--)
        // {
        //         for(j=1; j<=i; j++)
        //         {
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }

// this code is for floyd's trirangle
        // int number=1;
        // for(i=1; i<=5; i++){
        //         for(j=1; j<=i; j++){
        //                 System.out.print(number + " ");
        //                 number++;
        //         }
        //         System.out.println();
        // }

//this code is for 0-1 triangle

        // for(i=1; i<=5; i++)
        // {
        //         for(j=1; j<=i; j++)
        //         {
        //                 int sum = i+j;
        //                 if(sum % 2 == 0)
        //                 {
        //                         System.out.print(1+" ");
        //                 }
        //                 else{
        //                         System.out.print(0+ " ");
        //                 }
        //         }
        //         System.out.println();
        // }

// advance patterns;

// butterfly pattern

        // for(i=1; i<=4; i++)
        // {
                
        //         for(j=1; j<=i; j++)
        //         {
        //                 System.out.print("*");
        //         }
        //         for(j=1; j<=(2*(4-i)); j++){
        //                 System.out.print(" ");}
        //         for(j=1; j<=i; j++)
        //         {
        //         System.out.print("*");
        //          }
                        
                
        //         System.out.println();
        
        
        // }
        // for(i=4; i>=1; i--)
        // {
        //         for(j=1; j<=i; j++)
        //         {
        //                 System.out.print("*");
        //         }
        //         for(j=1; j<=(2*(4-i)); j++){
        //                 System.out.print(" ");}
                
        //         for(j=1; j<=i; j++){
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }

// this code is for solid rhombus pattern

        // for(i=1; i<=5; i++)
        // {
        //         for(j=1; j<=5-i; j++)
        //         {
        //                 System.out.print(" ");
        //         }
        //         for(j=1; j<=5; j++)
        //         {
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }

// this code is for number pyramid

        // for(i=1; i<=5; i++)
        // {
        //         for(j=1; j<=5-i; j++)
        //         {
        //                 System.out.print(" ");
        //         }
        //         for(j=1; j<=i; j++)
        //         {
        //                 System.out.print(i+" ");
        //         }
        //         System.out.println();
                
        // }

// this code is for palindromic pattern

        // for(i=1; i<=5; i++)
        // {
        //         for(j=1; j<=5-i; j++)
        //         {
        //                 System.out.print(" ");
        //         }
        //         for(j=i; j>=1; j--)
        //         {
        //                 System.out.print(j);
        //         }
        //         for(j=2; j<=i; j++){
        //                 System.out.print(j);
        //         }
        //         System.out.println();
        // }

// this code is for diamond pattern

        for(i=1; i<=4; i++)
        {
                for(j=1; j<=4-i; j++)
                {
                        System.out.print(" ");
                }
                for(j=1; j<=2*i-1; j++)
                {
                        System.out.print("*");
                }
                System.out.println();

        }
        for(i=4; i>=1; i--)
        {
                for(j=1; j<=4-i; j++)
                {
                        System.out.print(" ");
                }
                for(j=1; j<=2*i-1; j++)
                {
                        System.out.print("*");
                }
                System.out.println();    
        }

//practice 

        // for(i=1; i<=100; i++)
        // {
        //         for(j=1; j<=i; j++)
        //         {
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }

    }
    
}
