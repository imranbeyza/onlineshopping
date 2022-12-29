
package GUI;

import DAO.MainDAO;
import DAO.MusteriDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class KayıtOlGUIAction implements ActionListener{

    private MainDAO maindao;
    private KayıtOlGUI kayitol;
    private MainWindow mainwindow;
    private LoginGUI login;
    public KayıtOlGUIAction(KayıtOlGUI kayitol)
    {
        this.kayitol=kayitol;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==getKayitol().getKayıtOl1())
        {
            String name=getKayitol().getIsim1().getText();
            String surname=getKayitol().getSoyisim1().getText();
            String address=getKayitol().getAdres1().getText();
            String phone=getKayitol().getTelefon1().getText();
            String password=getKayitol().getSifre1().getText();
            getMaindao().Save(name, surname, address, phone, password);
            getKayitol().getWindow().setVisible(false);
            getLogin().getWindow().setContentPane(getLogin().getPanel());
            getLogin().getWindow().setVisible(true);
        }
    }

    public KayıtOlGUI getKayitol() {
        if(this.kayitol==null)
        {
            this.kayitol=new KayıtOlGUI();
            this.kayitol.build();
        }
        return kayitol;
    }

    public void setKayitol(KayıtOlGUI kayitol) {
        this.kayitol = kayitol;
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

    public MainDAO getMaindao() {
        if(this.maindao==null)
        {
            this.maindao=new MusteriDAO();
        }
        return maindao;
    }

    public void setMaindao(MainDAO maindao) {
        this.maindao = maindao;
    }

    public LoginGUI getLogin() {
        if(this.login==null)
        {
            this.login=new LoginGUI();
            login.build();
        }
        return login;
    }

    public void setLogin(LoginGUI login) {
        this.login = login;
    }

   
    
    
    
}
