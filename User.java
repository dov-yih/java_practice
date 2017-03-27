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

  public void setname(String name) {
      this.name = name;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  public void SetEmail(String email) {
    this.email = email;
  }

  public String getName(){
      return this.name;
  }

  public String getPasswd() {
      return this.passwd;
  }

  public String getEmail() {
      return this.email;
  }
  
  public void print(){
    System.out.println(this.name + "  " + this.passwd + "  " + this.email);
  }
}
