
package GUI;
import java.awt.*;
import javax.swing.*;

public class OdemeGUI {
    private JFrame window;
    private  JPanel panel;
    private  JButton Kredi;
    private JButton Banka;
    private Image image;
    private ImageIcon imageIcon;
    private JLabel fotografEtiketi;
    private MainAction main;
    private int hesap;
     public void build()
    {
       
        this.getPanel().add(this.getKredi());
        this.getPanel().add(this.getBanka());
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
        if(this.panel==null){
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

    public JButton getKredi() {
         if (this.Kredi==null)
        {
            Kredi=new JButton("KrediKartı");
            this.Kredi.setBounds(50,250,150,50);
            this.Kredi.addActionListener(new OdemeGUIAction(this));
        }
        return Kredi;
    }

    public void setKredi(JButton Kredi) {
        this.Kredi = Kredi;
    }

    public JButton getBanka() {
         if (this.Banka==null)
        {
            Banka=new JButton("Banka Kartı");
            this.Banka.setBounds(250,250,150,50); 
            this.Banka.addActionListener(new OdemeGUIAction(this));
        }
        return Banka;
    }
    public void setBanka(JButton Banka) {
        this.Banka = Banka;
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

    

    public MainAction getMain() {
        if(this.main==null)
        {
            main=new MainAction();
        }
        return main;
    }

    public void setMain(MainAction main) {
        this.main = main;
    }

    public int getHesap() {
        return hesap;
    }

    public void setHesap(int hesap) {
        this.hesap = hesap;
    }

 
    
}
