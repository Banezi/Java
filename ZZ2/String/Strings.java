public class Strings{
    public static void main (String[] args){
        String s1 = "Bane";
        String s2 = "Bane";
        String s3 = new String("Bane");
        String s4 = new String("Bane");
        String s5 = s3;
        String s6 = null;

        System.out.println(s1.toString()); 
        System.out.println(s2); 
        System.out.println(s3); 
        System.out.println(s4); 
        System.out.println(s5); 

        System.out.println("=====================");

        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s3==s4); //false
        System.out.println(s5==s3); //true

        System.out.println("=====================");

        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s6)); //false
        System.out.println(s6.equals(s1)); //exception NullPointerException
    }
}