
package GUI;

import java.awt.*;
import javax.swing.*;


public class KayıtOlGUI {
    private JFrame window;
    private  JPanel panel;
    private  JButton KayıtOl1;
    private JLabel label_sifre1,label_isim1,label_soyisim1,label_adres1,label_telefon1;
    private JTextField isim1,soyisim1,sifre1,adres1,telefon1;
    private Image image;
    private ImageIcon imageIcon;
    private JLabel fotografEtiketi;
    public void build()
    {
        
        this.getPanel().add(this.getLabel_isim1());
        this.getPanel().add(this.getLabel_sifre1());
        this.getPanel().add(this.getLabel_soyisim1());
        this.getPanel().add(this.getLabel_adres1());
        this.getPanel().add(this.getLabel_telefon1());
        this.getPanel().add(this.getSifre1());
        this.getPanel().add(this.getIsim1());
        this.getPanel().add(this.getSoyisim1());
        this.getPanel().add(this.getAdres1());
        this.getPanel().add(this.getTelefon1());
        this.getPanel().add(this.getKayıtOl1());
         this.getPanel().add(this.getFotografEtiketi());
        this.getWindow().setContentPane(this.getPanel());
        this.getWindow().setVisible(true);
    }
    public JFrame getWindow() {
        if (this.window==null)
        {this.window=new JFrame();
            this.window.setSize(500,500);
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
           
        }
        return panel;
    }

    
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getKayıtOl1() {
        if (this.KayıtOl1==null){
            KayıtOl1=new JButton("Kayıt Ol");
            this.KayıtOl1.setBounds(200,300,100,40);
            this.KayıtOl1.addActionListener(new KayıtOlGUIAction(this));
          
        }
        return KayıtOl1;
    }

    public void setKayıtOl1(JButton KayıtOl1) {
        this.KayıtOl1 = KayıtOl1;
    }

    public JLabel getLabel_sifre1() {
        if(this.label_sifre1==null){
            this.label_sifre1=new JLabel("Şifre");
            label_sifre1.setBounds(100,50 , 100, 40);
     }
        return label_sifre1;
    }

    public void setLabel_sifre1(JLabel label_sifre) {
        this.label_sifre1 = label_sifre;
    }

    public JLabel getLabel_isim1() {
        if(this.label_isim1==null){
            this.label_isim1=new JLabel("İsim");
            label_isim1.setBounds(100,100 , 100, 40);
     }
        return label_isim1;
    }

    public void setLabel_isim1(JLabel label_isim1) {
        this.label_isim1= label_isim1;
    }

    public JLabel getLabel_soyisim1() {
        if(this.label_soyisim1==null){
            this.label_soyisim1=new JLabel("Soyisim");
            label_soyisim1.setBounds(100,150 , 100, 40);
     }
        return label_soyisim1;
    }

    public void setLabel_soyisim1(JLabel label_soyisim1) {
        this.label_soyisim1 = label_soyisim1;
    }

    public JLabel getLabel_adres1() {
        if(this.label_adres1==null){
            this.label_adres1=new JLabel("Adres");
            label_adres1.setBounds(100,200 , 100, 40);
     }
        return label_adres1;
    }

    public void setLabel_adres1(JLabel label_adres1) {
        this.label_adres1 = label_adres1;
    }

    public JLabel getLabel_telefon1() {
        if(this.label_telefon1==null){
            this.label_telefon1=new JLabel("Telefon");
            label_telefon1.setBounds(100,250 , 100, 40);
     }
        return label_telefon1;
    }

    public void setLabel_telefon1(JLabel label_telefon1) {
        this.label_telefon1 = label_telefon1;
    }

    public JTextField getIsim1() {
         if(this.isim1==null){
            this.isim1=new JTextField();
            isim1.setBounds(150, 50, 100, 40);
        }
        return isim1;
    }

    public void setIsim1(JTextField isim1) {
        this.isim1 = isim1;
    }

    public JTextField getSoyisim1() {
         if(this.soyisim1==null){
            this.soyisim1=new JTextField();
            soyisim1.setBounds(150, 100, 100, 40);
     }
        return soyisim1;
    }
    public void setSoyisim1(JTextField soyisim1) {
        this.soyisim1 = soyisim1;
    }

   
    public JTextField getSifre1() {
         if(this.sifre1==null){
            this.sifre1=new JTextField();
            sifre1.setBounds(150, 150, 100, 40);
        
        }
        return sifre1;
    }

    public void setSifre1(JTextField sifre) {
        this.sifre1 = sifre1;
    }

    public JTextField getAdres1() {
         if(this.adres1==null){
            this.adres1=new JTextField();
            adres1.setBounds(150, 200, 100, 40);
     }
        return adres1;
    }

    public void setAdres1(JTextField adres1) {
        this.adres1 = adres1;
    }

    public JTextField getTelefon1() {
         if(this.telefon1==null){
            this.telefon1=new JTextField();
            telefon1.setBounds(150, 250, 100, 40);
      }
        return telefon1;
    }

    public void setTelefon1(JTextField telefon1) {
        this.telefon1 = telefon1;
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
