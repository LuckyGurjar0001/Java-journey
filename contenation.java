public class contenation {
    public static void main(String[] args) {
        //display the name
        String name = "coder";
        System.out.println("hello " +name);

        //check the lenght of characters
        String txt = "AFAEIGJOJOJOJOIJOH";
        System.out.println(txt.length());

        //convert the character into uppercase and Lowercase
        String text = "SO far So good";
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        //check the indexof position
        String dis = "Jaipur is famous in all over world";
        System.out.println(dis.indexOf("over"));

        //charAt to check the position of the character
        String word = "To see the world in life";
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(14));
        System.out.println(word.charAt(10));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(8));

        //comparing strings
        String txt1 = "Hello";
        String txt2 = "Hello";
        String txt3 = "Coder";
        String txt4 = "Programmer";
        System.out.println(txt1.equals(txt3));
        System.out.println(txt2.equals(txt4));

        //Removing white space 
        String wor = "   Hello World   ";
        System.out.println("Before: [" + wor + "]");
        System.out.println("After:  [" + wor.trim() + "]");

        //Concatenation method in string to use to add and merge the name both text and number
        // this is basic method to add the name 
        String name1 = "Lucky";
        String name2 = "Gurjar";
        System.out.println(name1+""+name2);

        //also method to merge the text and number
        String naam = "Lucky";
        int age = 18;
        System.out.println("My name is "+naam+" and I am "+age+" years old");

        // concat method to merge the name
        String word1 = "Proud to";
        String word2 = "be coder";
        System.out.println(word1.concat(word2));

        // addition in string and concatenation
        // use for number
        int a = 4;
        int b = 6;
        int c = a+b;
        System.out.println(c);

        //use for string
        String x = "40";
        String y = "96";
        String z = x+y;
        System.out.println(z);

        






    }
}
