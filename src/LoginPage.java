import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton();
    JButton resetButton = new JButton();
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();
    private HashMap<String, String> loginInfo = new HashMap<String, String>();
    LoginPage(HashMap<String, String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(50, 100,75, 25);
        userPasswordLabel.setBounds(50,150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setText("Login");
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setText("Reset");
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(resetButton);
        frame.add(loginButton);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(messageLabel);
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
        if(e.getSource() == resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
            messageLabel.setText("");
        }

        if(e.getSource() == loginButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(password)) {

                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);

                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong password");
                }
            }else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not found");
            }
        }
    }
}
