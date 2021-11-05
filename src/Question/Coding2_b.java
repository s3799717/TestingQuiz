package Question;

public class Coding2_b {

/*  Please complete the following requirements

    fill(): use for loop to fill the int array

    replace(): replace the third value in the int array
    */
    static int[] fill(int[] intArr){
        for(int i = 0;i < intArr.length; i++){
          intArr[i] = i+1;
        }   
        return intArr;
    }
  
    static int[] replace(int[] intArr, int r){
        intArr[2] = r;
        return intArr;
    }

}
