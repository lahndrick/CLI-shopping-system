/**
 *
 * @author Lahndrick Hendricks
 */
public class User {

    private String password;
    private String username;

    //constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    public String toString(){
        return this.username + ", password: ???";
    }
}
