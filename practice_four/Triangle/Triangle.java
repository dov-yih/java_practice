package Triangle;

/**
 * Created by yidafu on 2017/5/19.
 */

/*******************************
 *
 *      sanjiao 被我换成 Triangle
 *
 ******************************/
public class Triangle {
    private int x;
    private int y;
    private int z;

    public Triangle(){}

    public Triangle(int x,int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getArea() throws NotTriangleException {
            if(!isTriangle())
                throw new NotTriangleException(this.x,this.y,this.z);
            return (double)this.x * this.y * this.z;
    }

    public void showInfo() throws NotTriangleException{
        if(!isTriangle())
            throw new NotTriangleException(this.x,this.y,this.z);
        System.out.println("这个三角形的三边是：" +  this.x + " " + this.y + " " + this.z );
    }
    public boolean isTriangle(){
        boolean result = true;
        boolean flag = (this.x + this.y) > this.z ? true: false;
        if(flag) {
            flag = (this.x + this.z) > this.y ? true: false;
            if (flag) {
                flag = (this.y + this.z) > this.x ? true: false;
                if(flag) {
                    result = true;
                }else{
                    result = false;
                }
            }else{
                result = false;
            }
        }else{
            result = false;
        }
        return result;
    }

    public static void isTriangleStatic(int x ,int y,int z) throws IllegalArgumentException {
        boolean flag = (x + y) > z ? true: false;
        if(flag) {
            flag = (x + z) > y ? true: false;
            if (flag) {
                flag = (y + z) > x ? true: false;
                if(flag) {
                    System.out.println("三边：" +  x + " " + y + " " + z );
                }else{
                    throw new IllegalArgumentException( "x:" + x + " y:" + y + " z:" + z + "不能构成三 角形");
                }
            }else{
                throw new IllegalArgumentException( "x:" + x + " y:" + y + " z:" + z + "不能构成三 角形");
            }
        }else{
            throw new IllegalArgumentException( "x:" + x + " y:" + y + " z:" + z + "不能构成三 角形");
        }
    }
}
