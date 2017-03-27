package Class;

public class T5 {
	private String sName = "姚明";
     private String strHex;//用于存放每个字的Unicode编码
     private String  strRes="";  //用于连接各编码，并保存结果
     public void print(){
    	  for(int i = 0; i < this.sName.length() ; i++ ){//获得名字中字符的个数
	     	char c = this.sName.charAt(i) ;   //获得名字中的单个字符；
	     	int intAsc = (int)c;  //将字符转成int型
//	     	System.out.println(intAsc);
	     	if(intAsc > 128) {
	     	    strHex = Integer.toHexString(intAsc);  //通过Integer的toHexString方法，将字符转成Unicode编码
	     	    strRes += "&#x" + strHex + ";";  //将编码结果连接起来
	     	}
	     	else {
	     		strRes += c;
	     	}
	     }        
	     System.out.println(strRes);
     }
    
}
