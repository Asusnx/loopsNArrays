import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        System.out.println(name.contains("a"));
//        System.out.println(name.contains("h"));
//        System.out.println(name.toLowerCase());
//        System.out.println(name);
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(5));
//        System.out.println(name.length());
//        System.out.println(name.repeat(10));
//        System.out.println(name.equals("naglis"));
//        System.out.println(name.trim());
//        System.out.println(name.substring(3));
//        System.out.println(name.substring(1,5));
//        System.out.println(name.replace("a","i"));
//        System.out.println(name.replaceFirst("a","i"));
//        System.out.println(name.replace("a","O").replace("i","U"));
///1
        String name = "johnnnny";
        String surname = "Bravo";
        System.out.println(name.length());
        System.out.println(surname.length());
        if (name.length() > surname.length()) {
            System.out.println(name);
        } else if (name.length() < surname.length()) {
            System.out.println(surname);
        }

        //2

        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

//      3  Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
//        Sukurti trečią kintamąjį ir jam priskirti stringą,
//        sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių.Jį atspausdinti. naudoti substraction arba char

        String b1 = name.charAt(0) + "" + surname.charAt(0);
        System.out.println(b1);

//        4 uzduotis

        String hhh = name.substring(name.length() - 3) + surname.substring(surname.length() - 3);

        // Atspausdinam trečią kintamąjį
        System.out.println(hhh);

        // 5 uzduotis
//        Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir mažąsias)
//        pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        String paris =  "An American in Paris";
       String paris2 = ((paris.replace("a","*")));
        System.out.println(paris.replace("a","*").replace("A","*"));

//        6 uzduotis
//        Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses. Rezultatą atspausdinti.
//        Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space Odyssey” ir “It's a Wonderful Life”.

        String paris3 = "Breakfast at Tiffany's";
        String paris4 = "2001: A Space Odyssey";
        String paris5 = "It's a Wonderful Life";


        String rezultatas1 = paris.replaceAll("[AEIOUaeiou]", "");
        System.out.println(rezultatas1);
        String rezultatas2 = paris3.replaceAll("[AEIOUaeiou]", "");
        System.out.println(rezultatas2);
        String rezultatas3 = paris4.replaceAll("[AEIOUaeiou]", "");
        System.out.println(rezultatas3);
        String rezultatas4 = paris5.replaceAll("[AEIOUaeiou]", "");
        System.out.println(rezultatas4);

//      7 uzduotis Stringe, kurį generuoja toks kodas:
//        "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope"
//        Surasti ir atspausdinti epizodo numerį.










    }
}