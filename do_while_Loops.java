public class do_while_Loops {
 public static void main(String[] args) {
    // while loop
    int i = 0;
    while(i<5){
        System.out.println(i);
        i++;
    }
    //use countdown for while loop
    int countdown = 4;
    while (i<0){
        System.out.println(countdown);
        countdown++;
    }
      System.out.println("yes i am here to count");
     
      //Do while loop
      int a = 0;
      do{
        System.out.println(a);
        a++;
      }while(a<10);

      int dice = 1;
      while(dice<=6){
        if(dice<6){
            System.out.println("yeah buuddy its dice");
        }else{
            System.out.println("it is special dice");
        }
        dice++;
      }
   
 }
}
