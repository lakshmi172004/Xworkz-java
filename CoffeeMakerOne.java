class CoffeeMakerOne {

    static String productName = "Philips Coffee Maker";
    static String brand = "Philips";
    static String type = "Drip Coffee";
    static int capacity = 1;
    static String autoShutOff = "Yes";
    static String powerSource = "Electric";
    static String material = "Plastic";
    static String filterType = "Reusable";
    static String color = "Black";
    static int warranty = 2;

    public static void main(String[] args) {
        System.out.println(productName);
        System.out.println(brand);
        System.out.println(type);
        System.out.println(capacity + " Litre");
        System.out.println(autoShutOff);
        System.out.println(powerSource);
        System.out.println(material);
        System.out.println(filterType);
        System.out.println(color);
        System.out.println(warranty + " years");
    }
}
