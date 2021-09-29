
package Class;

import javax.swing.JOptionPane;

public class user_class {
    
   private String user, pass;

    public user_class(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    
    public user_class(){
        
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean verify(){
        
        if (user.equals("Administrador") && pass.equals("admin")) {
            return true;
        }else if(user.equals("Docente") && pass.equals("docente")){
            return true;
        }else if(user.equals("Student") && pass.equals("student")){
            return true;
        }else{
            return false;
        }
                 
    }
    
    public String info(int y){
        if (y==0) {
            JOptionPane.showMessageDialog(null, "Username: Docente\nPassword: docente");
        }else if(y==1){
            JOptionPane.showMessageDialog(null, "Username: Student\nPassword: student");
        }
       return null;
    }
    
    
}
