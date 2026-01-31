public class conditions {
    public static void main(String[] args) {
        // Exapmple of weather:
        int weather = 3;
       if(weather==1){
        System.out.println("Bring an umberalla");
       }else if(weather==2){
          System.out.println("wear a sunglasses");
       }else if(weather==3){
        System.out.println("May be rain occur suddenly");
       }else{
        System.out.println("Just normal day");
       }

       // Example of time
       int time = 22;
       if(time<=10){
        System.out.println("Good Morning");
       }else if(time>=12){
         System.out.println("Godd evening");
       }else{
         System.out.println("Good day");
         }

         //Example of Student number
         int marks = 90;
         if(marks>=90){
            System.out.println("Student Score Grade A");
         }else if(marks>=80){
            System.out.println("Student Score Grade B");
         }else if(marks>=60){
            System.out.println("Student Score Grade C");
         }else if(marks>=40){
            System.out.println("Student Score Grade D");
         }else{
            System.out.println("Student are Fail");
         }

         //Shor hand operator that are ternary operator to reduce the code of conditional statements
         int samay = 20;
         String result = (samay<=18)?"Good MOorning":"Good Evening";
         System.out.println(result);

         //Example of Stduent marks
         int markss = 90;
         String score = (markss>=50)?"pass":"fail";
         System.out.println(score);

         //Nested if 
         int x = 20;
         int y = 30;
         if(x<y){
            System.out.println("x is less than y");
         }if(y>x){
            System.out.println("y is greater than x");
         }

         int agg = 18;
         boolean isCitizen = true;
         if(agg>=18){
            System.out.println("eligible to give the vote");
        }if(isCitizen){
            System.out.println("also elgible to give vote if it's 18+");
        }else{
            System.out.println("not eligible to give the vote if it's not 18");
        }

        //Logical operator: logical operators are && , || ,!
        //&& : ALL conditions are ture
        //|| : Atleast one condition is true
        //! : reverse of condition (true=false,false=true)
        //&& : AND
        int a = 300;
        int b = 40;
        int c = 500;
        if(a>b&&c>b){
            System.out.println("All conditions are true");
        }
        //||: OR
        if(a>b||b>c){
            System.out.println("Atleast one conditions are true");
        }
        // ! = reverse conditon
        if(!(a>b)){
            System.out.println("Reverse of condition");
        }
         
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

       if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
        System.out.println("Access granted");
     } else {
      System.out.println("Access denied");
       }

        
}
}