public class arr {
    public static void main(String[] args) {
        // Array: arrau is used to store the multiple values in one variable not insteed to store the another variable
        // print the position of car name through array
        String [] cars ={"volvo","BMW","Audi","Mazarati","Ferrari"};
        System.out.println(cars[3]);

        // print the position of number through array
        int [] num ={10,20,30,40,50};
        System.out.println(num[2]);

        //add the name through the index of cars name 
        String [] car ={"volvo","BMW","Audi","Mazarati","Ferrari"};
        car[2] ="opel";
        System.out.println(car[3]);

      // print the length of array
        String [] fruits = {"apple","mango","banana","grapes","orange"};
        System.out.println(fruits.length);

      // print the new keyword string through the string 
      String [] bikes = new String[5];
      bikes[0] = "Ducati";
      bikes[1] = "Kwasaki";
      bikes[2] = "BMW";
      bikes[3] = "trumph";
      bikes[4] = "Honda";
      System.out.println(bikes[0]);

      //Loop through an array : Loop through an array to only use the lenghth 
      String [] a = {"apple","mango","banana","grapes","orange"};
       for(int i = 0;i<a.length;i++){
        System.out.println(a[i]);
       }    

       // print the number from this same methods
       int [] number = {10,20,30,40,50};
       for(int i=0;i<number.length;i++){
        System.out.println(number[i]);
       }

       //print the sum of elements:
       int  [] numbers = {10,30,34,56};
       int sum = 0;
       for(int i=0;i<numbers.length;i++){
        sum += numbers[i];
       }
       System.out.println("sum is:"+sum);

       //for each loop through array 
        String [] fruity = {"apple","mango","banana","grapes","orange"};
        for(String fruit : fruity){
            System.out.println(fruit);
        }

        // Multidimensional aray : multidimensional array is used to store other array and you can store data ind table in row or column
        int [][] numberss = {{46,28,49},{56,34,56}};
        System.out.println(numberss[1][1]);

         int [][] nums = {{46,28,49},{56,34,56}};
        System.out.println(nums[0][2]);

        // for loop through multidimensional array:
         int [][] nun = {{46,28,49,34},{87,56,34,56}};
         for(int[]row:nun){
            for(int numss:row){
             System.out.println(numss);
            }
         }
        
    }
}
