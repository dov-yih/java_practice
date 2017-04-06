/**
 * Created by yidafu on 17-4-6.
 */
public class Counter {
    private int count;
    private int maxValue;

    public Counter() {
        this.count      = 99;
        this.maxValue   = 99;
    }

    public Counter(int count, int maxValue) {
        this.count      = count;
        this.maxValue   = maxValue;
    }

    public void increment() {
        this.count ++;
        if( this.count >= this.maxValue)
                System.out.println("count >= maxValue");
    }

    public void idecrement() {
        this.count --;
        if( this.count < 0)
            System.out.println("count < 0");
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getCount(){
        return this.count;
    }

    public int getMaxValue() {
        return this.maxValue;
    }
}
