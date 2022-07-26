import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("My name is Anastasiya");
        int age = 24;
        System.out.println(age + " years old");
        String firstString = "I'm Manual Test Engineer.";
        String secondString = "Dream to becoming Automation Testing Engineer";
        String sumOfTwoStrings = firstString + secondString;
        System.out.println(sumOfTwoStrings);

                byte yearsOfExperience = 1;
                System.out.println(yearsOfExperience + " year work in IT.");
                short abroad = 2;
                System.out.println(abroad + " years live in Poland.");
                double c = yearsOfExperience + abroad;
                System.out.println(c);
                float birthDay = (float) 14.1;
                System.out.println(birthDay + "0.1997 Day of my Birthday");
                boolean a = (double)abroad >= c;
                System.out.println(a);
                char n = 'A';
                System.out.println("Full name " + n + "nastasiya");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String myStringInLowerCase = str.toLowerCase();
        System.out.println(myStringInLowerCase);
        String myString = "So lucky";
        System.out.println(myString.length());
        String favorite = "";
        System.out.println(favorite.isEmpty());
        System.out.println(myString.charAt(4));
        boolean diff = myString.equals(favorite);
        System.out.println(diff);
        String big = "SO LUCKY";
        boolean difference = myString.equalsIgnoreCase(big);
        System.out.println(difference);
        boolean startsWith = big.startsWith("O");
        System.out.println(startsWith);
        boolean endsWithLucky = myString.endsWith("lucky");
        System.out.println(endsWithLucky);
        String aLotOfLetters = "I want ot know how it's work, because I don't know";
        boolean contains = aLotOfLetters.contains("love");
        System.out.println(contains);
        String new$tr= aLotOfLetters.replace("I", "You");
        System.out.println(new$tr);
        String bigInLowerCase = big.toLowerCase();
        System.out.println(bigInLowerCase);

        String yearsOfExp = "a lot";
        int expYear = 10;
        int future = 40;
        String myYears = String.format("I work %s, with %d years of experience and plane work %d years", yearsOfExp,expYear, future);
        System.out.println(myYears);






    }

}