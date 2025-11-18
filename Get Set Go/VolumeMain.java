 class Volume {
    private double length;
    private double width;
    private double height;

    public void setDimensions(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public double getVolume() {
        return length * width * height;
    }
}

public class VolumeMain {
    public static void main(String[] args) {
        Volume v = new Volume();

        v.setDimensions(5, 4, 3); 

        System.out.println("Volume = " + v.getVolume());
    }
} 


