import java.util.Scanner;

public class FloydsTriangle {


    public static void main(String[] args) {
        int counter, number=1, row, i, j;

        System.out.println("Please number of the rows:");
        Scanner scan =new Scanner(System.in);
        row=scan.nextInt();


        for (counter = 0; counter<=row; counter++){
            for( j=1; j<=counter; j++){
                System.out.print(number +"");
                number++;
            }

            System.out.println();
            }



        }

    }


