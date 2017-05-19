package ShoppingCart;

import java.util.*;

/**
 * Created by yidafu on 2017/5/19.
 */
public class ShoppingCart {
    private List<Goods> goods;
    private HashMap<Integer,Integer> cart;

    public ShoppingCart() {

    }

    public ShoppingCart(List<Goods> goodsList) {
        this.goods = new ArrayList<Goods>(goodsList);
        cart = new HashMap<Integer,Integer>();
    }

    public void addGoods(int goodsID,int quantity) {
        this.cart.put(goodsID,quantity);
    }

    public void deleteGoods(int goodsID) {
        this.cart.remove(goodsID);
    }

    public void modifyOrder(int goodsID,int quantity) {
        this.cart.put(goodsID,quantity);
    }

    public void removeAll() {
        this.cart.clear();
    }

    public void viewGoods() {
        Iterator iterator = cart.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Iterator goodsIterator = this.goods.listIterator();
            while(goodsIterator.hasNext()) {
                Goods tmpGoods = (Goods)goodsIterator.next();
                if(tmpGoods.getID() == (int)entry.getKey()){
                    System.out.println("id;" + entry.getKey()+ "\tname:" + tmpGoods.getName()
                            + "\tprice:" + tmpGoods.getPrice() + "\tnumber:" +entry.getValue());
                }
            }

        }
    }

    public float realPayment() {
        Iterator iterator = cart.entrySet().iterator();
        ArrayList<Float> result = new ArrayList<Float>();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Iterator goodsIterator = this.goods.listIterator();
            while(goodsIterator.hasNext()) {
                Goods tmpGoods = (Goods)goodsIterator.next();
                if(tmpGoods.getID() == (int)entry.getKey()){
                    float singleTobalPrine = (tmpGoods.getPrice() * (int)entry.getValue());
                    result.add(singleTobalPrine);
                    System.out.println(tmpGoods.getName() + " " + singleTobalPrine);
                }
            }

        }
        Iterator iteratorResult = result.iterator();
        float total = 0 ;
        while(iteratorResult.hasNext()) {
            total += (float)iteratorResult.next();
        }
        return total;
    }
}
