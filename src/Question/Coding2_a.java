package Question;



public class Coding2_a {

/*    Please complete the following requirements

      Define an int array in the main method

      create a method fill() in Coding2_b

      call fill() in the main method to fill the int array with numbers from 1 to 10

      output the int array

      create a method replace() in Coding2_b

      call replace() in the main method to replace the third value of the int array

      output the int array
    */


    public static void main(String[] args){
      int n = 10;
      int[]intArr = new int [n];
      Coding2_b.fill(intArr);
      Coding2_b.replace(intArr,0);
    }
  }
