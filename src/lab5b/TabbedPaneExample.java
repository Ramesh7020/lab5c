package lab5b;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPaneExample {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create Panels for each color
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add Tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add Change Listener
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);
                System.out.println(title + " tab is selected");
            }
        });

        // Add to frame
        frame.add(tabbedPane);

        // Make visible
        frame.setVisible(true);
    }
}