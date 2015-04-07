package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

import charts.PieChart;

import org.jfree.ui.RefineryUtilities;

public class Main extends JFrame{

    public static void main(String[] args) {
        Data.readWords();
        new Main();
        /*Show Pie Chart*/
       /* 
        PieChart demo = new PieChart( "Letter Counter" );
        demo.setSize(560, 367);
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
        */
    }
    private JPanel contentPane;
    private JLabel title;
    private JButton auto, manual;

    public Main() {
        initFrame();
        setSize(new Dimension(300, 150));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initFrame() {
        contentPane = (JPanel)getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));

        JPanel titlePane  = new JPanel(new FlowLayout());
        title = new JLabel("What type of input would you like?");
        titlePane.add(title);

        JPanel buttonPane = new JPanel(new FlowLayout());
        
        auto = new JButton("Auto Input");
        manual = new JButton("Manual Input");
        
        
        
        auto.setActionCommand("auto");
        manual.setActionCommand("manual");


        buttonPane.add(auto);
        buttonPane.add(manual);

        auto.addActionListener(new ButtonActionListener());
        manual.addActionListener(new ButtonActionListener());
        contentPane.add(titlePane);
        contentPane.add(buttonPane);

    }
}
