public class ternary {
    public static void main(String[] args) {
        int a = 38, b = 28 , c = 50 , result;
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "+ result);

    }
}
