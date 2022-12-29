
package GUI;

import java.awt.*;
import javax.swing.*;


public class KartGUI {
     private JFrame window;
     private  JPanel panel;
     private JLabel label;

     public void build(){
        this.getPanel().add(this.getLabel());
        this.getWindow().setContentPane(this.getPanel());
        this.getWindow().setVisible(true);
     }

    public JFrame getWindow() {
         if (this.window==null)
        {this.window=new JFrame();
            this.window.setSize(500,500);
            this.window.setLayout(null);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JPanel getPanel() {
         if (this.panel==null)
        {
            this.panel=new JPanel();
            this.panel.setBackground(Color.white);
             this.panel.setLayout(null);
             this.panel.setBounds(300,100,500,500);
           
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLabel() {
        if(this.label==null){
            this.label=new JLabel("ÖDEME YAPILDI");
            label.setFont(new Font("Serif", Font.BOLD, 50));
        }
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
     













}
