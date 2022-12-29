
package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UrunDAO extends MainDAO{

    
    public void Save() {
        String Filename="C:\\Users\\Acer\\Documents\\NetBeansProjects\\onlinealisveris\\src\\main\\java\\File\\Urun";
        File f=new File(Filename);
        if(!f.exists())
        {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                
            }
            System.out.println("Dosya olusturuldu"+Filename);
        }
        else
        {
            FileWriter fw;
            try {
                fw = new FileWriter(f,true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write("'"+150+"'"+150+"'"+150+"'"+150);
                bw.newLine();
                bw.close();
                System.out.println("Dosyaya yazıldı.");
            } catch (IOException ex) {
                
            }
            
        }
    }
    public String getData() {
        try {
            FileReader fileReader=new FileReader("C:\\Users\\Acer\\Documents\\NetBeansProjects\\onlinealisveris\\src\\main\\java\\File\\Urun");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            while((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("'");
                return bilgiler[1];
                
            }
            
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MusteriDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusteriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    @Override
    public void Save(String name,String surname,String address,String phone,String password)
    {
        
    }

    @Override
    public int getData(String name,String password) {
        return 1;
    }
    
}
