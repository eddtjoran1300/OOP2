import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimalDisplay extends JFrame implements ActionListener {
    private JLabel label;
    private JRadioButton dogButton, catButton, birdButton, rabbitButton, pigButton;
    private JButton displayButton;
    private ImageIcon dogIcon, catIcon, birdIcon, rabbitIcon, pigIcon;

    public AnimalDisplay() {
        setTitle("Animal Display");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Select an animal to display:");
        add(label);

        dogButton = new JRadioButton("Dog");
        catButton = new JRadioButton("Cat");
        birdButton = new JRadioButton("Bird");
        elephantButton = new JRadioButton("Rabbit");
        fishButton = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();
        group.add(dogButton);
        group.add(catButton);
        group.add(birdButton);
        group.add(rabbitButton);
        group.add(pigButton);

        add(dogButton);
        add(catButton);
        add(birdButton);
        add(rabbitButton);
        add(pigButton);

        displayButton = new JButton("Display");
        displayButton.addActionListener(this);
        add(displayButton);

        // Load images
        dogIcon = new ImageIcon("images/dog.jpg");
        catIcon = new ImageIcon("images/cat.jpg");
        birdIcon = new ImageIcon("images/bird.jpg");
        rabbitIcon = new ImageIcon("images/rabbit.jpg");
        pigIcon = new ImageIcon("images/pig.jpg");
    }

    public void actionPerformed(ActionEvent e) {
        ImageIcon selectedIcon = null;
        if (dogButton.isSelected()) {
            selectedIcon = dogIcon;
        } else if (catButton.isSelected()) {
            selectedIcon = catIcon;
        } else if (birdButton.isSelected()) {
            selectedIcon = birdIcon;
        } else if (rabbitButton.isSelected()) {
            selectedIcon = rabbitIcon;
        } else if (pigButton.isSelected()) {
            selectedIcon = pigIcon;
        }

        if (selectedIcon != null) {
            JOptionPane.showMessageDialog(this, new JLabel(selectedIcon));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AnimalDisplay().setVisible(true);
            }
        });
    }
}
