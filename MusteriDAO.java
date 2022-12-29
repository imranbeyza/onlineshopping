
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

public class MusteriDAO extends MainDAO{
    public MusteriDAO()
    {
        
    }

    @Override
    public void Save(String name,String surname,String address,String phone,String password){
        String Filename="C:\\Users\\Acer\\Documents\\NetBeansProjects\\onlinealisveris\\src\\main\\java\\File\\Musteri";
        File f=new File(Filename);
        if(!f.exists())
        {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MusteriDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Dosya olusturuldu"+Filename);
        }
        else
        {
            FileWriter fw;
            try {
                fw = new FileWriter(f,true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write("'"+name+"'"+surname+"'"+address+"'"+phone+"'"+password);
                bw.newLine();
                bw.close();
                System.out.println("Dosyaya yazıldı.");
            } catch (IOException ex) {
                Logger.getLogger(MusteriDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    @Override
    public int getData(String name,String password) {
        
        try {
            FileReader fileReader=new FileReader("C:\\Users\\Acer\\Documents\\NetBeansProjects\\onlinealisveris\\src\\main\\java\\File\\Musteri");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            while((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("'");
                System.out.println(bilgiler[1]);
                String p=bilgiler[1];
                String n=bilgiler[2];
                if(n.equals(name)&& p.equals(password))
                {
                    return 1;
                }
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MusteriDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusteriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
