package pc;

public class Monitor {

    private String modelNumber;
    private String manufacturerName;

    public Monitor(String modelNumber, String manufacturerName) {
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void drawPixel (int x, int y, String color){
        System.out.println("Drawing pixel at \" + x + \",\" + y + \" \" + \" in color \"+ color");
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "modelNumber='" + modelNumber + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}
