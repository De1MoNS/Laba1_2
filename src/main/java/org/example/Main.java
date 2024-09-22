public class Main
{
    public static void main(String[] args)
    {
        String original = "make install";
        String reversed = "";
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
        {
            reversed += original.charAt(i);
        }
        System.out.println(reversed);
    }
}