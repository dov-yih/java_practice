package Class;
public class T1{
    private double sum = 0.0;
    public void function1(){
        for(double i = 1; i <= 5; i++){
            this.sum += 1/i;
        }
        //   return this.sum;
    }
    public double getSum(){
        function1();
        return this.sum;
    }

}
