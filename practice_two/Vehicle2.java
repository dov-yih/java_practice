/**
 * Created by yidafu on 17-4-6.
 */
public class Vehicle2 {
    private double load;
    private double maxLoad;

    public Vehicle2() {

    }

    public Vehicle2(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }

    public boolean addBox(double box){
        this.load += box;
        if(this.load >= this.maxLoad){
            this.load -= box;
            return false;
        }
        return true;
    }
}
