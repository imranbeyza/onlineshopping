package GUI;

import DAO.UrunDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class MainAction implements ActionListener {

    private MainWindow mainwindow;
    private OdemeGUI odeme;
    private UrunDAO urun;
        private JLabel fiyat;

    private int toplam;
    public MainAction(){
        
    };
    public MainAction(MainWindow mainwindow) {
        this.mainwindow = mainwindow;
    }

    public MainAction(OdemeGUI odeme) {
        
        this.odeme = odeme;
    }

    public MainWindow getMainwindow() {
        if (this.mainwindow == null) {
            this.mainwindow = new MainWindow();
            mainwindow.build();
        }

        return mainwindow;
    }

    public void setMainwindow(MainWindow mainwindow) {
        this.mainwindow = mainwindow;
    }

    public OdemeGUI getOdeme() {
        if (this.odeme == null) {
            this.odeme = new OdemeGUI();
            odeme.getPanel().add(getFiyat());
            odeme.build();   
        }
        return odeme;
    }

    public void setOdeme(OdemeGUI odeme) {
        this.odeme = odeme;
    }

    public UrunDAO getUrun() {
        if (urun == null) {
            urun = new UrunDAO();
        }
        return urun;
    }

    public void setUrun(UrunDAO urun) {
        this.urun = urun;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (getMainwindow().getKazak().isSelected()) {
            toplam=toplam + Integer.parseInt(getUrun().getData());

        }  if (getMainwindow().getEtek().isSelected()) {
            toplam=toplam + Integer.parseInt(getUrun().getData());

        }  if (getMainwindow().getAyakkabı().isSelected()) {
            toplam=toplam + Integer.parseInt(getUrun().getData());

        }  if (getMainwindow().getMont().isSelected()) {
            toplam=toplam + Integer.parseInt(getUrun().getData());

        }
        if (e.getSource() == getMainwindow().getOdeme()) {
            getUrun().Save();
            
            getOdeme().getWindow().setContentPane(getOdeme().getPanel());
            getOdeme().getWindow().setVisible(true);
        }

    }

    public int getToplam() {
        
        return toplam;
    }

    public void setToplam(int toplam) {
        this.toplam = toplam;

    }
    public JLabel getFiyat() {
        if(this.fiyat==null)
        {
            fiyat=new JLabel("Sepet tutarı: "+toplam+"tl");
            fiyat.setBounds(50,100,300,75);
            fiyat.setForeground(Color.WHITE);
            fiyat.setFont(new Font("Arial",Font.BOLD,25));
        }
        return fiyat;
    }

    public void setFiyat(JLabel fiyat) {
        this.fiyat = fiyat;
    }
    

}
