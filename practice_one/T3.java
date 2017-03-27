package Class;
public class T3{
    private int ha = 1234;
    public  T3(int input){
        if(input >= 1000)
            this.ha = input;
        else
            System.out.println("请输入四位数!");
    }
    public void print(){
        int t = this.ha;
//        System.out.println(t);
        int temp;
       do{
            temp = t%10;
            if(temp == 0) break;
            System.out.print(temp + "\t");
            t = t/10;
            
        } while(temp != 0);
        System.out.println();
    }
}
