package pc;

public class PC implements Comparable<PC>{
    private String pcCase;
    private String motherboard;
    private String monitor;

    public PC (){
    }

    public PC(String pcCase, String motherboard, String monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    private void drawLogo (){
        int x = 10;
        int y = 20;
        String color = "Purple";

    }

    public String getPcCase() {
        return pcCase;
    }

    public void setPcCase(String pcCase) {
        this.pcCase = pcCase;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
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

    @Override
    public int compareTo(PC o) {
        return this.monitor.compareTo(this.getMonitor());
    }

}
