import java.util.Scanner;

public class AverageHeight {
    public static void calculateAverage(){
        Scanner keyboard = new Scanner(System.in);
        double averageHeight = 0;
        int group = 4;
        for( int count = 1; count <= group; count++){
            System.out.println("What's the height of the person #"+count);
            double height = keyboard.nextDouble();
            averageHeight += height;
        }
        System.out.println("The average height is:"+(averageHeight/group));
    }


    public static void calculateAverageArray(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many people are we gonna calculate the average?");
        int[] heights = new int[keyboard.nextInt()];
        int sum = 0;

        for (int count = 0; count < heights.length ; count++){
            System.out.println("What's the height of the person #"+(count+1));
            heights[count] = keyboard.nextInt();
            sum += heights[count];
        }
        double averageHeight = (double)sum / heights.length;
        System.out.println("The average of "+heights.length+" is "+averageHeight);

        int peopleHighAverage = 0;
        for(int count = 0 ; count < heights.length ; count++){
            if(heights[count]>averageHeight){
                peopleHighAverage++;
            }
        }
        System.out.println(peopleHighAverage+" people are above the average!");
    }
}