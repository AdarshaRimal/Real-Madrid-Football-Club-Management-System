import javax.swing.*;
import java.awt.*;

public class DashboardUI {
    private JPanel dashboardPanel, leftPanel;

    public DashboardUI(JFrame frame) {
        // Clear the login panel
        frame.getContentPane().removeAll();
        frame.repaint();

        // Setup dashboard panel and left menu panel
        setupDashboard(frame);
        setupLeftMenu(frame);

        frame.revalidate();
        frame.repaint();
    }

    private void setupDashboard(JFrame frame) {
        dashboardPanel = new JPanel();
        dashboardPanel.setLayout(null);
        dashboardPanel.setBounds(250, 0, 950, 700);
        dashboardPanel.setBackground(Color.BLACK);

        JLabel background = new JLabel();
        background.setIcon(new ImageIcon("C:\\Users\\Adarsha Rimal\\Desktop\\java\\swing_project\\src\\images\\bgfinal.jpg"));
        background.setBounds(0, -100, 700, 700);
        dashboardPanel.add(background);

        JLabel ronaldo = new JLabel();
        ImageIcon ronaldoImg = new ImageIcon("C:\\Users\\Adarsha Rimal\\Desktop\\java\\swing_project\\src\\images\\ronaldo.jpg");
        Image ronaldoImage = ronaldoImg.getImage();
        Image scaledRonaldoImage = ronaldoImage.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
        ronaldo.setIcon(new ImageIcon(scaledRonaldoImage));
        ronaldo.setBounds(700, -50, 300, 600);
        dashboardPanel.add(ronaldo);

        JLabel sloganLabel = new JLabel("!Playing for Real Madrid is like touching the sky!");
        sloganLabel.setFont(new Font("Arial", Font.BOLD, 24));
        sloganLabel.setForeground(Color.CYAN);
        sloganLabel.setBounds(200, 550, 800, 30);
        dashboardPanel.add(sloganLabel);


        JButton clubRecordsButton = new JButton("Show Club Records");
        clubRecordsButton.setFont(new Font("Arial", Font.BOLD, 16));
        clubRecordsButton.setBackground(new Color(0, 153, 153));
        clubRecordsButton.setForeground(Color.WHITE);
        clubRecordsButton.setBounds(350, 600, 200, 40);
        clubRecordsButton.setFocusPainted(false);
        dashboardPanel.add(clubRecordsButton);


        frame.add(dashboardPanel);
    }

    private void setupLeftMenu(JFrame frame) {
        leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBackground(Color.BLACK);
        leftPanel.setBounds(0, 0, 250, 700);

        ImageIcon logoIcon = new ImageIcon("C:\\Users\\Adarsha Rimal\\Desktop\\java\\swing_project\\src\\images\\logo.png");
        Image img = logoIcon.getImage();
        Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(scaledImg));
        logoLabel.setBounds(25, 20, 200, 200);
        leftPanel.add(logoLabel);

        // Add buttons to the left panel
        String[] menuItems = {"Players", "Coach", "Transfer Window", "Staff", "Ground and Gym", "Tournament", "Developed By"};
        int yPosition = 250;
        for (String item : menuItems) {
            JButton button = new JButton(item);
            styleMenuButton(button, yPosition);
            leftPanel.add(button);
            yPosition += 50;
        }

        JLabel textLabel = new JLabel("Hala Madrid");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        textLabel.setForeground(Color.WHITE);
        textLabel.setBounds(45, 600, 200, 40);
        leftPanel.add(textLabel);

        frame.add(leftPanel);
    }

    private void styleMenuButton(JButton button, int yPosition) {
        button.setBackground(new Color(0, 153, 153));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setFocusPainted(false);
        button.setBounds(25, yPosition, 200, 40);
    }
}
