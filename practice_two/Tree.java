/**
 * Created by yidafu on 17-4-6.
 */
public class Tree {
    private int ages;

    public Tree() {
        this.ages = 0;
    }

    public Tree(int ages) {
        this.ages = ages;
    }

    public void grow(int yeas) {
        this.ages += yeas;
    }

    public int ages() {
        return this.ages;
    }
}
