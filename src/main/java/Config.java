/**
 * Created by Harry on 2/1/17.
 */
public class Config {
    private String url = "jbdc:mysql/localhost/adlister_db";
    private String username = "adlister_user";
    private String password = "password";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
