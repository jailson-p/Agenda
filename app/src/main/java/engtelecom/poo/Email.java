package engtelecom.poo;

import java.util.HashMap;
import java.util.Map;

public class Email {
    //---------------------------------------------------------------------------------------------
    private final String ER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    //---------------------------------------------------------------------------------------------



    private Map <String,String> dados;

    public Email() {
        dados = new HashMap<>();
    }

    public boolean add(String chave, String email ){
        if(validar(email)) {return false;}
        this.dados.put(chave, email);
        return true;
    }

    public boolean remover(String rotulo){
        if(this.dados.remove(rotulo).equals(rotulo)) return true;
        else  return false;
    }

    public boolean update(String rotulo, String email){
        return true;
    }

    @Override
    public String toString() {
        return "Email [dados=" + dados + "]";
    }

    private boolean validar(String email){
        if(email.matches(ER)) {return false;}
        else return true;
    }

  
    
}
