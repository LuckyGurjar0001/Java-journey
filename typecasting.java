public class typecasting {
 public static void main(String[] args) {
    //casting : casting convert the one datatype into another datatype
    // widening casting : widening casting is basically convert the small datatype into large datatype.
    //byte -> short -> int -> long ->  float -> double 
    byte x = 34;
    float y = x;
    System.out.println(x);
    System.out.println(y);

    //narrowing typecasting : narrowing typecasting is convert the large datatype into small datatype.
    // double -> float -> long -> int -> short -> byte
     double mydou = 34.3444;
     int myInt = (int) mydou;
     System.out.println(mydou);
     System.out.println(myInt);

     //final keyword : this keyword is used for finalize the data type and the variable after you not change also say that constant you Const
     final int age = 18;
     System.out.println("lucky age is: "+age);

     // Real life Example on typecasting:
      int maxscore = 45;
      int userscore =54;
      double maxdou = maxscore;
      float macflo = userscore;
      System.out.println(maxdou);
      System.out.println(macflo);
 }

}
