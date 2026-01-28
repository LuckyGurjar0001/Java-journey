class bike{
    String model;
    int year;
    bike(String model,int year){
        this.model = model;
        this.year = year;
    
  }
}
 public class object{
    public static void main(String[] args) {
        bike mybike = new bike ("zx10r",2025);

        System.out.println("Bike model:"+mybike.model);
        System.out.println("Bike year:" +mybike.year);
    }
 }
  