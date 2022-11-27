import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton();
    JButton resetButton = new JButton();
    JTextField userIDField = new JTextField();
    JPasswordField userPassword = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();
    private HashMap<String, String> loginInfo = new HashMap<String, String>();
    LoginPage(HashMap<String, String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(50, 100,75, 25);
        userPasswordLabel.setBounds(50,150, 75, 25);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
