import java.util.HashMap;

public class IDandPassword {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    IDandPassword(){
        loginInfo.put("Krysia", "Brzoskwinka");
        loginInfo.put("Mariusz", "Password");
        loginInfo.put("Klaudia", "Malinka");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
