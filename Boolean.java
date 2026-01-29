public class Boolean {
    public static void main(String[] args) {
        // boolean : boolean that give output in True or false ,Yes or no, On or Off ,0 or 1
        boolean isjavagood = true;
        boolean isveryeasy = false;
        System.out.println(isjavagood);
        System.out.println(isveryeasy);

        // check the output of boolean through integer
        int a = 64;
        int b = 23;
        System.out.println(a>b);
        System.out.println(64<23);
        System.out.println(a==64);
        System.out.println(23!=64);
        System.out.println(64==23);
        System.out.println(64>23);

        // Example to chek the value is True or False
        int myage = 19;
        int votingage = 18;
        if(myage>=votingage){
            System.out.println("old enough to give the vote");
        }else{
            System.out.println("Not enough to give the vote");
        }

    }
}
