package Class;

public class T8 {
	private int total;
	private int last_empty;
	private int bottle = 1000;
	//setter方法getter方法略
	public void print(){
		System.out.println("test");
		int bottleEmpty;
        int tempBottle = this.bottle; //保护bottle数据不被修改
		do{
			this.total += tempBottle;
			bottleEmpty = tempBottle%3; //
			tempBottle /= 3;
			tempBottle = (tempBottle + bottleEmpty);
		}while(tempBottle >= 3);
		last_empty = tempBottle;
		System.out.println("总共能喝多少瓶汽水" + this.total + ",最后还剩余多少个空瓶子" + this.last_empty);
	}
}
