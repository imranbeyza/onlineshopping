
package GUI;
import DAO.MusteriDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIAction implements ActionListener{
   private  LoginGUI lgn;
   private KayıtOlGUI kayit;
   private MusteriDAO musteri;
   private MainWindow mainwindow;
   
    
public GUIAction(LoginGUI lgn){
    this.lgn=lgn;   
}
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==getLgn().getKayıtOl()){
           getKayit().getWindow().setContentPane(getKayit().getPanel());
           getKayit().getWindow().setVisible(true);
       }
       else if(e.getSource()==getLgn().getLogin())
       {
           String name=getLgn().getIsim().getText();
           String password=getLgn().getSifre().getText();
           if(getMusteri().getData(name, password)==1)
           {
               getMainwindow().getWindow().setContentPane(getMainwindow().getPanel());
               getMainwindow().getWindow().setVisible(true);
           }
       }
    }

    public LoginGUI getLgn() {
        if(this.lgn==null)
        {
            this.lgn=new LoginGUI();
            lgn.build();
        }
        return lgn;
    }

    public void setLgn(LoginGUI lgn) {
        this.lgn = lgn;
    }

    public KayıtOlGUI getKayit() {
        if(this.kayit==null)
        {
            this.kayit=new KayıtOlGUI();
            kayit.build();
        }
        
        return kayit;
    }

    public void setKayit(KayıtOlGUI kayit) {
        this.kayit = kayit;
    }

    public MusteriDAO getMusteri() {
        if(this.musteri==null)
        {
            this.musteri=new MusteriDAO();
        }
        return musteri;
    }

    public void setMusteri(MusteriDAO musteri) {
        this.musteri = musteri;
    }

    

    public MainWindow getMainwindow() {
        if(this.mainwindow==null)
        {
            this.mainwindow=new MainWindow();
            mainwindow.build();
        }
        return mainwindow;
    }

    public void setMainwindow(MainWindow mainwindow) {
        this.mainwindow = mainwindow;
    }
   
    

}

