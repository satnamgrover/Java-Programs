public class matrix{
    public static void main(String[] args) {
        int[][] first = {
            {1,5,6},
            {5,8,9},
            {2,4,3},
        };

        int[][] second = {
            {7,5,6},
            {2,4,9},
            {4,1,3},
        };

        int[][] add = new int[first.length][second.length];

        for(int i=0; i<first.length; i++)
        {
            for(int j=0; j<second.length; j++){
                add[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("addition of two matrices : " );
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++){
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        int[][] sub = new int[first.length][second.length];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++){
                sub[i][j] = first[i][j] - second[i][j];
            }
        }
        
        System.out.println("subtraction of two matrices : ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++){
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }


    }
}