package orrsrosx.entity;

public class User {
     private int userId;
     private String userName;
     private int userPwd;
     private String jurisDiction;

    public User(int userId, String userName, int userPwd, String jurisDiction) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.jurisDiction = jurisDiction;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(int userPwd) {
        this.userPwd = userPwd;
    }

    public String getJurisDiction() {
        return jurisDiction;
    }

    public void setJurisDiction(String jurisDiction) {
        this.jurisDiction = jurisDiction;
    }
}
