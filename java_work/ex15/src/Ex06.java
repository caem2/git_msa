public class Ex06 {

    public static void main(String[] args) {
        String a = "asd";
        String b = "dsa";

        System.out.println(a + b);
        System.out.println(a.concat(b));

        System.out.println(a.compareTo("dsds"));
        System.out.println(a.compareTo("dsdsddd"));
        System.out.println(a.compareTo("dsdssss"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("sdasd"));
        System.out.println(a.compareToIgnoreCase("sdasdsdss"));
        System.out.println(a.compareToIgnoreCase("sdasdsd"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("dasdada"));
        System.out.println(a.compareToIgnoreCase("dasdadasss"));

    }
}
