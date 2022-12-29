
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class OdemeGUIAction implements ActionListener{
    private KartGUI kart;
    private OdemeGUI odeme;
    
    private JOptionPane pane;
    public OdemeGUIAction(OdemeGUI odeme){
     this.odeme=odeme;
    }
  
     public OdemeGUIAction(KartGUI kart) {
        this.kart = kart;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==getOdeme().getBanka()){
            JOptionPane.showMessageDialog(null,"Banka kartınızdan ödeme yapıldı");
        }
         else if(e.getSource()==getOdeme().getKredi()){
             JOptionPane.showMessageDialog(null,"Kredi kartınızdan ödeme yapıldı");
        }
    }

  
    public OdemeGUI getOdeme() {
        if(this.odeme==null)
        {
            this.odeme=new OdemeGUI();
            odeme.build();
        }
        return odeme;
    }

    public void setOdeme(OdemeGUI odeme) {
        this.odeme = odeme;
    }
       public KartGUI getKart() {
        if(this.kart==null){
        this.kart=new KartGUI();
        kart.build();
        
        }
        return kart;
    }

    public void setKart(KartGUI kart) {
        this.kart = kart;
    }

    public JOptionPane getPane() {
        if(pane==null)
        {
            this.pane=new JOptionPane();
        }
        return pane;
    }

    public void setPane(JOptionPane pane) {
        this.pane = pane;
    }
    
}
