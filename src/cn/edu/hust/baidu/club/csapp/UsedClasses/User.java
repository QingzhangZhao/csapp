package cn.edu.hust.baidu.club.csapp.UsedClasses;

/**
 * Created by zqz on 15-9-4.
 */
public class User {
    private String username;
    private String password;
    private String confirm; //验证密码（再次输入密码）
    private String email;
    private String uid;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getConfirm() {
        return confirm;
    }

    public String getEmail() {
        return email;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
