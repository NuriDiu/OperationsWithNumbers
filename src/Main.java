

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> input = new ArrayList<Integer>();

        input.addAll(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        List<Integer> filteredInput = new ArrayList<Integer>();
        for ( int num : input){
           if(num > 0 ){
               filteredInput.add(num);
           }
       }

        List<Integer> filteredEvenInput = new ArrayList<Integer>();
        for ( int num : filteredInput){
            if(num % 2 == 0 ){
                filteredEvenInput.add(num);
            }
        }
        Collections.sort(filteredEvenInput);

        System.out.println("Original List: " + input);
        System.out.println("Filtered List: " + filteredInput);
        System.out.println("Filtered Even List in Ascending order:" + filteredEvenInput);


        List<Integer> filteredByApi = StreamMain.filterInputData(input);
        System.out.println( filteredByApi);

    }
}