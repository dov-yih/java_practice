package Class;

public class T10 {
	private String get;
	
	public T10(){
		
	}
	public T10(String str){
		this.get = str;
	}
	public char judge(){
		char c = ' ';
		this.get += 'd';
		String max[] = {};
//		char result[] = this.get.toCharArray();
		for(int i = 0 ; i < this.get.lastIndexOf('d'); i ++){
			char get = this.get.charAt(i);
			String regex = "[" + get +"]"; 				//依靠split方法切割出来开的字符串数组长度来判断每一个数字出现限次数
			String temp[] = this.get.split(regex);
			if(temp.length > max.length){
				max = temp;
				c = get;
			}else if(temp.length == max.length){
				if(get>c){  		//判断c 和  get 的大小关系
					c = get; 
				}
			}
		}
		return c;
	}
}
