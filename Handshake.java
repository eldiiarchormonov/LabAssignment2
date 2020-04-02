public class Handshake {
    static int maxHandshake(int n)
    {
        return (n * (n - 1)) / 2;
    }
    public static void main (String[] args)
    {
        int n = 15;
        System.out.println( maxHandshake(n));
    }
}
