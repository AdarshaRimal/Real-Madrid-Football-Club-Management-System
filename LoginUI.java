import javax.swing.*;
import java.awt.*;

public class LoginUI {
    private JFrame frame;
    private JPanel loginPanel;

    public LoginUI() {
        // Initialize the login UI in the constructor
        frame = new JFrame("Real Madrid Football Club Management System");
        frame.setSize(1200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Set up the menu bar using the MenuBarSetup class
        new MenuBarSetup(frame);

        // Set up the login panel
        loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBounds(0, 0, 1200, 700);
        setupLoginPanel();

        frame.add(loginPanel);
        frame.setVisible(true);
    }

    private void setupLoginPanel() {
        // Set up components like image, labels, and fields for login panel
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Adarsha Rimal\\Desktop\\java\\swing_project\\src\\images\\user.png");
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imagelabel = new JLabel(scaledIcon);
        imagelabel.setBounds(525, 50, 200, 200);

        loginPanel.add(imagelabel);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(595, 250, 100, 30);
        userLabel.setForeground(Color.BLUE);
        loginPanel.add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(525, 300, 200, 30);
        loginPanel.add(userField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(595, 350, 100, 30);
        passLabel.setForeground(Color.BLUE);
        loginPanel.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(525, 400, 200, 30);
        loginPanel.add(passField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(575, 450, 100, 30);
        loginButton.setBackground(Color.CYAN);
        loginPanel.add(loginButton);

        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (username.equals("admin") && password.equals("admin123")) {
                // On successful login, show the dashboard
                new DashboardUI(frame);
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Credentials!");
            }
        });
    }
}
