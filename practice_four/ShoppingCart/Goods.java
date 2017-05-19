package ShoppingCart;

/**
 * Created by yidafu on 2017/5/19.
 */
public class Goods {
    private int goodsID;
    private String goodsName;
    private float price;

    public Goods() {

    }

    public Goods(int goodsID,String goodsName,float price) {
        this.goodsID    = goodsID;
        this.goodsName  = goodsName;
        this.price      = price;
    }

    public int getID() {
        return this.goodsID;
    }

    public String getName() {
        return this.goodsName;
    }

    public float getPrice() {
        return this.price;
    }
}
