
package GUI;

import java.awt.*;
import javax.swing.*;

public class MainWindow {
    private JFrame window;
    private JPanel panel;
    private  JButton Odeme;
    private Image image;
    private ImageIcon imageIcon;
    private JLabel fotografEtiketi;
    JCheckBox kazak=new JCheckBox("KAZAK");
    JCheckBox etek=new JCheckBox("ETEK");
    JCheckBox ayakkabı=new JCheckBox("AYAKKABI");
    JCheckBox mont=new JCheckBox("MONT");

    public MainWindow()
    {
        
    }
    public void build()
    {

        this.getPanel().add(getKazak());
        this.getPanel().add(getEtek());
        this.getPanel().add(getAyakkabı());
        this.getPanel().add(getMont());
        this.getPanel().add(this.getOdeme());
        this.getPanel().add(this.getFotografEtiketi());
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


    public JButton getOdeme() {
        if (this.Odeme==null)
        {
            Odeme=new JButton("Ödeme");
            this.Odeme.setBounds(300,300,100,40);
            this.Odeme.addActionListener(new MainAction(this));
        }
        return Odeme;
    }

    public void setOdeme(JButton Odeme) {
        this.Odeme = Odeme;
    }

    public JCheckBox getKazak() {
        kazak.setBounds(50,50,100,30);
        kazak.addActionListener(new MainAction(this));
        return kazak;
    }

    public void setKazak(JCheckBox kazak) {
        
        this.kazak = kazak;
    }

    public JCheckBox getEtek() {
        etek.setBounds(50,100,100,30);
        etek.addActionListener(new MainAction(this));
        return etek;
    }

    public void setEtek(JCheckBox etek) {
        this.etek = etek;
    }

    public JCheckBox getAyakkabı() {
         ayakkabı.setBounds(50,150,100,30);
         ayakkabı.addActionListener(new MainAction(this));
        return ayakkabı;
    }

    public void setAyakkabı(JCheckBox ayakkabı) {
        this.ayakkabı = ayakkabı;
    }

    public JCheckBox getMont() {
        mont.setBounds(50,200,100,30);
        mont.addActionListener(new MainAction(this));
        return mont;
    }

    public void setMont(JCheckBox mont) {
        this.mont = mont;
    }

    public Image getImage() {
        if(this.image==null)
        {
            this.image=getImageIcon().getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        }
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ImageIcon getImageIcon() {
        if(this.imageIcon==null)
        {
            this.imageIcon=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\onlinealisveris\\src\\main\\java\\gorsel\\loginarkaplan.jpg");
        }
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public JLabel getFotografEtiketi() {
          if(this.fotografEtiketi==null)
        {
            this.fotografEtiketi=new JLabel(new ImageIcon(getImage()));
            this.fotografEtiketi.setBounds(0,0,500,500);
        }
        return fotografEtiketi;
    }

    public void setFotografEtiketi(JLabel fotografEtiketi) {
       
        this.fotografEtiketi = fotografEtiketi;
    }
    
    
}
