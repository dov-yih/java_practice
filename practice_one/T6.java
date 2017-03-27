package Class;


class T6
{ public void print() {	
		String s1=new String("you are a student");
	  	String s2=new String("how are you");
	  	if(s1.equals(s2)){ //判断s1与s2是否相同
			System.out.println("s1与s2相同");
		} 
		else {
			System.out.println("s1与s2不相同"); 
		}
	  	
		String s3=new String("22030219851022024");
		if("220302".equals(s3.substring(0,5))) {//判断s3的前缀是否是“220302”。
			System.out.println("吉林省的身份证");
		}
		
		String s4=new String("你");
		String s5=new String("我");
		if(s4.compareTo(s5) > 0) {//按着字典序比较s4和s5的大小。
			System.out.println("按字典序s4大于s5");
		}
		else {
			System.out.println("按字典序s4小于s5");
		}
		
		int position=0;
		String path="c:\\java\\jsp\\A.java";
		position = path.lastIndexOf("\\");//获取path中最后出现目录分隔符号的位置
		System.out.println("c:\\java\\jsp\\A.java中最后出现\\的位置:"+position); 
		path = path.substring(0, position);//获取 “A.java”文件的路径。
		System.out.println("A.java文件的路径为：" + path);//输出：A.java文件的路径为：”c:\java\jsp” 
		String s6=new String("100");
		String s7=new String("123.678");
		int n1=Integer.parseInt(s6);   //将s6转化成int型数据。
		double n2=Double.parseDouble(s7);   //将s7转化成double型数据。
		double m=n1+n2;
		System.out.println(m);
		String s8=String.valueOf(m); //String调用valuOf(int n)方法将m转化为字符串							对象
		position=s8.indexOf(".");//查找s8中“.”的位置
		String temp=s8.substring(position);//调用substring方法获取s8的”.”之后的字符串
		System.out.println("数字"+m+"有"+(s8.length()-position - 1)+"位小数") ; //输出有几位小数
		}
}