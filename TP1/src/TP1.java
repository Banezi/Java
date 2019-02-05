public class TP1 {
    public static void main(String[] args)
    {
        System.out.println("Vous avez envoyé " + args.length + " paramètres : ");
        for(int i=0; i<args.length; i++)
            System.out.println(args[i]);
    }
}
