package Week2;

/**
 * Created by Михаил on 25.11.2016.
 */
public class SaodaCan {
    private double Height;
    private double Radius;


    public SaodaCan(double h, double r) {
        Height = h;
        Radius = r;
    }

    public double getSurfaceArea() {
        return 2 * 3.14 * Radius * Height;
    }

    public double getVolume() {
        return 3.14 * Radius * Radius * Height;
    }

}

