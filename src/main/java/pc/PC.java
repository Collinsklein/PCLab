package pc;

public class PC {
    private String pcCase;
    private String motherboard;
    private String monitor;

    public PC(String pcCase, String motherboard, String monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    private void drawLogo (){
        int x = 10;
        int y = 20;
        String color = "Red";
    }
    public void description(){
        System.out.println("Welcome to worst buy, below is the description of the pc on sale today");
        System.out.println("Case:" + pcCase);
        System.out.println("Monitor:" + monitor);
        System.out.println("Motherboard:" + motherboard);
    }
    public void powerUp (){
        drawLogo();
    }
}
