package ShoppingCart;

import java.util.*;
 
public class TestMain {
    
    public static void main(String[] args) {
    	
    	List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(new Goods(1001,"牙膏",12.4f));
        goodsList.add(new Goods(1002,"牙刷",4.5f));
        goodsList.add(new Goods(1003,"毛巾",15.8f));
        goodsList.add(new Goods(1004,"肥皂",8.9f));
        goodsList.add(new Goods(1005,"水杯",23.5f));
        goodsList.add(new Goods(1006,"床单",108.9f));
        goodsList.add(new Goods(1007,"被套",233.4f));
        goodsList.add(new Goods(1008,"枕套",59.6f));
    	
    	ShoppingCart cart = new ShoppingCart(goodsList);

    	// 加入到一个 HashMap 里面去
    	cart.addGoods(1001,3); //   quentity ==> 数量
    	cart.addGoods(1003,2);
    	cart.addGoods(1007,4);
    	cart.addGoods(1008,4);
    	
    	cart.viewGoods();
        System.out.println("所授商品总价：" + cart.realPayment());
    	
    }
}