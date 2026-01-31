public class Example_Conditions {
    public static void main(String[] args) {
        //doorcode
        int doorcode = 3435;
        if (doorcode == 3436){
           System.out.println("Correct code ,the door is open");
        }else{
            System.out.println("Incorrect code,the door is not open");
        }
        //number:
        int myNum =10;
        if(myNum>=0){
            System.out.println("the value is positive");
        }else{
            System.out.println("the number is negative");
        }

        //temprature
        int temp = 30;
        if(temp<0){
            System.out.println("temprature is freeze");
        }else if(temp<20){
            System.out.println("temprature is cool");
        }else{
            System.out.println("temprature is warm");
        }

        //check no is even or odd:
        int num = 5;
        if(num % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

        //boolean granted:
        boolean isLoggedIn = true;
        boolean isAdmin = false;
       int securityLevel = 3; 

     if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
         System.out.println("Access granted");
        } else {
        System.out.println("Access denied");
        }

        //voting age:
        int myagg = 20;
        int votingagg = 18;
        if(votingagg>=18){
            System.out.println("Eligible to give the vote");
        }else{
            System.out.println("Not Eligible to give the vote");
        }
    
}
}
