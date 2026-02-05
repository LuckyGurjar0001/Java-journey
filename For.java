public class For {
    public static void main(String[] args) {
        //print the number:
        for(int i = 0; i<=5; i++){
            System.out.println(i);
        }

        // print the even number:
        for(int i = 0; i<=10;i=i+2){
            System.out.println(i);
        }

        //print the sum of number:
        int sum = 0;
        for(int i=0; i<=10;i++){
            sum = sum +i;
        }
        System.out.println("Sum is:"+sum);

        //print the number in countdown manner:
         for(int i=0;i>10;i--){
            System.out.println(i);
         }

         // print the odd numbers:
         for(int i=1;i<=100;i=i+2){
            System.out.println("odd numbers are " +i);
         }

         //print shree radha :
         for(int i=1;i<=100;i++){
            System.out.print("\t Radha");

         }
        // Nested for loop : loop inside the another loop is nested for loop
          for(int i=1;i<=2;i++){
            // outer lop:
            System.out.println("outer loop"+i);
         for(int j=1;j<=3;j++){
            System.out.println("inner loop"+j);
         }
          }
         // print the 1,2,3
          for(int i=1;i<=3;i++){
          for(int j=1;j<=3;j++){
             System.out.print(i*j+"");
          }
          System.out.println();
          }

          // print the 0,1,2,3,4
         for(int i=1;i<=5;i++){
         for(int j=1;j<=5;j++){
            System.out.print(i-j+"");
         }
         System.out.println();
         }

         // print the 2,3,4,5,6,7
         for(int i=1;i<=5;i++){
         for(int j=1;j<=5;j++){
            System.out.print(i+j+"");
         }
         System.out.println("\t");
         }

          //for each loop that used in array and collection of elements in array:
          // print the cars name through for each loop in array
          String[] cars ={"Audi","BMW","Mercedes","Range Rover","Bentley"};
          for(String car : cars){
            System.out.println(car);
          }

          //print the numbers through for loop in array:
          int[] number = {10,20,30,40,50};
          for(int num : number){
             System.out.println(num);
          }

          // for loop :
          for(int i=0;i<=100;i+=10){
            System.out.println(i);
          }

          for(int i=0;i<=10;i=i+2){
            System.out.println(i);
          }

          for(int i=1;i<=100;i=i+1){
            System.out.println(i);
          }

         for(int seat = 1;seat<=20;seat++){
            System.out.println("seat are:" +seat);
         }
         
         // To print the factorial number:
         int n = 10;
         int fact = 1;
         for(int i=1;i<=n;i++){
            fact*=i;
         }
         System.out.println("factorial " + n + " is: " + fact);
          
    }
}
