/**
 * Created by yidafu on 17-4-6.
 */
public class Car {
    private String plateNum;
    private int speed;
    private double deadWeight;

    public Car() {
        this.plateNum   = "XX1234";
        this.speed      = 100;
        this.deadWeight = 100.0;
    }
    public Car(String plateNum, int speed, double deadWeight) {
        this.plateNum   = plateNum;
        this.speed      = speed;
        this.deadWeight = deadWeight;
    }

    public void speedUp(int speedUp) {
        this.speed += speedUp;
    }

    public void speedDown(int speedDown) {
        this.speed -= speedDown;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public double getDeadWeight() {
        return this.deadWeight;
    }

    public String getInfo() {
        return "车牌" + this.plateNum + ",车速" + this.speed + ",载重量" + this.deadWeight;
    }
}
