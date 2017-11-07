public class String_backwards {
    public static void main(String[] args) {

        String gorog = "indul a görög aludni";

        String reverse = new StringBuilder(gorog).reverse().toString();
        System.out.println(reverse);
    }
}
