package funcoesString;

public class Main {
    public static void main(String[] args) {

        String original = "ABCD abcd   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 7);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("BC");
        int j = original.lastIndexOf("bc");


        System.out.println("original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2) -" + s04 + "-");
        System.out.println("substring(2, 7) -" + s05 + "-");
        System.out.println("replace('a', 'x') -" + s06 + "-");
        System.out.println("replace('abc', 'xy') -" + s07 + "-");
        System.out.println("indexOf 'BC': " + i);
        System.out.println("LastIndexOf 'bc': " + j);
    }
}
