import java.util.Arrays;

public class lab2 {

    public int [] twoSum(int[] arr, int targetNum){
        int [] sumArr = new int [2];
        for(int i = 0; i < arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++){
                if((arr[i]+arr[j]) == targetNum)
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
