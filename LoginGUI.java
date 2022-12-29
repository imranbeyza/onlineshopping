package GUI;

import java.awt.*;
import javax.swing.*;

public class LoginGUI {
    private JFrame window;
    private  JPanel panel;
    private  JButton KayıtOl;
    private JButton Login;
    private JPasswordField sifre;
    private JLabel label_sifre,label_isim;
    private JTextField isim;
    private Image image;
    private ImageIcon imageIcon;
    private JLabel fotografEtiketi;
   
    
   public void build()
    {
       
        this.getPanel().add(this.getLabel_isim());
        this.getPanel().add(this.getLabel_sifre());
        this.getPanel().add(this.getSifre());
        this.getPanel().add(this.getIsim());
        this.getPanel().add(this.getKayıtOl());
        this.getPanel().add(this.getLogin());
        this.getPanel().add(this.getFotografEtiketi());
        this.getWindow().setContentPane(this.getPanel());
        this.getWindow().setVisible(true);
    }
    
     public JLabel getLabel_isim() {
         if(this.label_isim==null){
            this.label_isim=new JLabel("İsim");
            label_isim.setBounds(100,100, 100, 40);
            label_isim.setForeground(Color.white);
        }
        return label_isim;
     }
    public void setLabel_isim(JLabel label_isim) {
        this.label_isim = label_isim;
    }

    public JLabel getLabel_sifre() {
        if(this.label_sifre==null){
            this.label_sifre=new JLabel("Şifre");
            label_sifre.setBounds(100,200 , 100, 40);
            label_sifre.setForeground(Color.white);
     }
        return label_sifre;
    }

    public void setLabel_sifre(JLabel label_sifre) {
        this.label_sifre = label_sifre;
    }
   
    public JTextField getIsim() {
           if(this.isim==null){
            this.isim=new JTextField();
            isim.setBounds(150, 100, 100, 40);
        }
        return isim;
    }
    public void setIsim(JTextField isim) {
        this.isim = isim;
    }
   
    public JPasswordField getSifre() {
        if(this.sifre==null){
            this.sifre=new JPasswordField();
            sifre.setBounds(150,200,100,40);
         
            
        }  
        return sifre;
    }
    public void setSifre(JPasswordField sifre) {
        this.sifre = sifre;
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

    public JButton getKayıtOl() {
         if (this.KayıtOl==null){
            KayıtOl=new JButton("Kayıt Ol");
            this.KayıtOl.setBounds(150,250,100,40);
            this.KayıtOl.addActionListener(new GUIAction(this));
        }
        return KayıtOl;
    }

    public void setKayıtOl(JButton KayıtOl) {
        this.KayıtOl = KayıtOl;
    }

    public JButton getLogin() {
         if (this.Login==null)
        {
            Login=new JButton("Giriş");
            this.Login.setBounds(300,250,100,40);
            this.Login.addActionListener(new GUIAction(this));
            
        }
        return Login;
    }

    public void setLogin(JButton Login) {
        this.Login = Login;
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
