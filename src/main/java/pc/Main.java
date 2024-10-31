package pc;




public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(12,12,10);

        Case pcCase = new Case("Windows xp","Microsoft","220", dimensions );


        Resolution resolution = new Resolution(10, 10);

        Motherboard motherboard = new Motherboard("sony23","Sony",4,6,"sony-bios");

        Monitor monitor = new Monitor(resolution,1234, "100*100pixels");

        PC pc = new PC(pcCase,motherboard,monitor);


        pc.description();

        pc.powerUp();



    }
}
