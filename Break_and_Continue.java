public class Break_and_Continue {
    public static void main(String[] args) {
        // Break statement : Break statement is use to stop the loop iteration
        for(int i=1;i<=10;i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }

        // Continue statement is used to skip the iteration and jump to next iteration
        for(int i=1;i<=20;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }

        //use the break and continue both statement
        for(int i=0;i<60;i++){
            if(i==4){
                break;
            }
            if(i==10){
                continue;
            }
            System.out.println(i);
        }

        //use the break and conitnue in while loop :
        int i = 0;
        while(i<=10){
            if(i==7){
                break;
            }
            System.out.println(i);
            i++;
        }

        int a = 1;
        while(a<=10){
            if(a==5){
                continue;
            }
            System.out.println(a);
            a++;
        }
        int j = 1;
        while(j<=10){
            if(j==5){
                break;
            }
            if(j==8){
                continue;
            }
            System.out.println(j);
            j++;
        }

        // use the do while loop for that
        int k =0;
        do{
            if(k==3){
                break;
            }
            if(k==5){
                continue;
            }
          System.out.println(k);
          a++;
         
        }while(i<=10);
         
    }
}
