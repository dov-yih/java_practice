public class User{
  private String name;
  private String passwd;
  private String email;

  public User(){

  }

  public User(String name,String passwd, String email){
    this.name = name;
    this.passwd = passwd;
    this.email = email;
  }
  public void print(){
    System.out.println(this.name + "  " + this.passwd + "  " + this.email);
  }
}
