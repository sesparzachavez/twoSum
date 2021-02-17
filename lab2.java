import java.util.Arrays;

public class lab2 {

    public int [] twoSum(int[] arr, int targetNum){
        //creating array that will contain the two indexes of the integers that add up to the target
        int [] sumArr = new int [2];

        //the outer loop is in charge of checking the first of two indexes of the result
        //it goes until length-1 because it does not need to check the last, the nested loop will
        for(int i = 0; i < arr.length-1;i++){
            //the nested loop is in charge of the second of the two indexes of the result
            //this is why it starts with i + 1
            for(int j = i+1; j<arr.length;j++){
                if((arr[i]+arr[j]) == targetNum) //checks whether the two elements of the arrays add up to the target

                    //stores the indexes that add up to target
                    sumArr[0]= i;
                sumArr[1]= j;
            }

        }
        return sumArr;
    }

    public static void main(String args[]){

        int [] arr = {2, 12, 8, 7};
        int targetNum = 9;
        lab2 test = new lab2();
        System.out.println(Arrays.toString(test.twoSum(arr,targetNum)));
    }
}