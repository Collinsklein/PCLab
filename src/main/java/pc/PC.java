package pc;

public class PC {
    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;


    public PC(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo (){
       monitor.drawPixel(10,10 , "Purple");

    }

    public Case getPcCase() {
        return pcCase;
    }

    public void setPcCase(Case pcCase) {
        this.pcCase = pcCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void powerUp (){
        pcCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Bubble");

    }

    public void description(){
        System.out.println("Welcome to worst buy, below is the description of the pc on sale today");
        System.out.println("Case:" + pcCase);
        System.out.println("Monitor:" + monitor);
        System.out.println("Motherboard:" + motherboard);
    }




}
