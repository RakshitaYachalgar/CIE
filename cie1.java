public class cie1 {
   public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
            System.out.println("Sum after element " + (i + 1) + ": " + sum);
        }

        int average=sum/5;
        System.out.println("average: " +average);

        int maximum = arr[0];
        for(int i=1;i<5;i++){
            maximum = Math.max(maximum, arr[i]);
        }
        System.out.println("Maximum: " + maximum);
        int minimum = arr[0];
        for(int i=1;i<5;i++){
            minimum = Math.min(minimum, arr[i]);
        }
        System.out.println("Minimum: " + minimum);
        }
}
