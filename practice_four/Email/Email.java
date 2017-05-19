package Email;

/**
 * Created by yidafu on 2017/5/19.
 */
public class Email {
    private String email;

    public Email() {}

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
    public boolean checkEmail() throws EmailException {
//        System.out.println(this.email.matches("\\d{4}\\-\\d{1,2}\\-\\d{1,2}"));
//        System.out.println(this.email.matches("^[\\d\\w]{1,6}@[\\d\\w]+"));
//        System.out.println(this.email.matches("^[\\d\\w]+@[\\d\\w]+"));
        boolean flag;
            if(flag = this.email.matches("^[\\d\\w]{1,6}@[\\d\\w\\.]+"))
                throw new EmailException(this.email);
            if(flag = !this.email.matches("^[\\d\\w]+@[\\d\\w\\.]+"))
                throw new EmailException();

            return true;
    }
}
