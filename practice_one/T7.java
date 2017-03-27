package Class;

public class T7 {
	private int hen 	= 5;
	private int cock 	= 3;
	private int chick3 	= 1; //因为不会出现1/3或2/3只鸡，为了便于计算，三只鸡一起算
	private int money 	= 100;
	private int num		= 100;
	public void printNum(){
		int i,k,j;
		for(i = 1; i<= 100 ; i++){ //小鸡 1 => 3只
			for(j = 0; j <= 33  ; j ++){ // 母鸡
				for(k = 0 ; k <= 20 ; k ++){ // 公鸡
					 if(((i*3 + j + k) == 100) && ((k*hen + j*cock+ i*chick3) == 100))
					 	System.out.println("小鸡"+i*3+"只，母鸡"+j+"只，公鸡"+k+"只");
				}
			}
		}
	}
}
