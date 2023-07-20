import java.util.Arrays;

public class ArrayManipulation {public static void main(String[] args) {
    int[]numbers = {5,8,3,2,7};
    String[]names = {"Alice", "Bob", "Charlie", "David"};
    double[]values = new double[5];

    System.out.println("Elements of the numbers array:");
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);

        }
    System.out.println("\nElements of the names array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    values[0] = 1.5;
    values[1] = 1.8;
    values[2] = 1.4;
    values[3] = 1.7;
    values[4] = 1.1;
    System.out.println("\nElements of the values array:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    int sum = 0;

       for(int i=0; i<numbers.length; i++)
       {
         sum = sum + numbers[i];
       }
       System.out.println("sum of all elements in the numbers array: "+sum); 

    double max = values[0];
    for(int i=0; i< values.length; i++){
        if(values[i]>max)
            max=values[i];
    }
    System.out.println("maximum value in the values array: " + max);  
    
    String[]reversedNames = new String[names.length ];
    
    for (int i = 0; i < names.length; i++) {
            reversedNames[i] = names[names.length - 1 - i];
        }

        System.out.println("\nReversed Names array:");
        for (int i = 0; i < reversedNames.length; i++) {
            System.out.println(reversedNames[i]);
        }
    
    
    Arrays.sort(numbers);
        System.out.println("\nSorted numbers array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    
}
