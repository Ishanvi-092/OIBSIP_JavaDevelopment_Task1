import javax.swing.*;
import java.awt.event.*;

public class LoginForm {

    public static void main(String[] args) {
        new LoginForm();
    }

    LoginForm(){
        JFrame frame = new JFrame("Login Form");

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(50,50,100,30);

        JTextField userField = new JTextField();
        userField.setBounds(150,50,150,30);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(50,100,100,30);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(150,100,150,30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(150,150,100,30);

        loginBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String user = userField.getText();
                String pass = new String(passField.getPassword());

                if(user.equals("admin") && pass.equals("1234")){
                    JOptionPane.showMessageDialog(frame,"Login Successful");

                    frame.dispose();   // closes login window
                    new MainMenu();    // opens main menu
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Invalid Login");
                }
            }
        });

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginBtn);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}