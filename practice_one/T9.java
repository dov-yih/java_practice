package Class;

public class T9 {
	private int test[] = {1,2,0,2,1};
	public boolean compare(){
		for(int i = 0,j = this.test.length - 1; i < j ; i ++ , j --){
			if(this.test[i] != this.test[j]){
				return false;
			}
		}
		return true;
	}
}
