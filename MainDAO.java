
package DAO;
//liskov substitution principle
public abstract class MainDAO{
    public abstract void Save(String name,String surname,String address,String phone,String password);
    public abstract int getData(String name,String password);
 
}
