public class ExceptionHandlingtorunprogram {
    static int a=20;

    public static void main(String[] args) {
        try
        {
        System.out.println(a/0);
       // System.out.println("AMan kumar");
        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj);
        }
        System.out.println("Aman kumar");
    }
}
