import java.util.ArrayList;
import java.util.List;

public class ListaCredenziali {
    private List<Credenziali> elencoCredenziali=new ArrayList<>();

    public void addCredenziali(Credenziali c){
        elencoCredenziali.add(c);
    }

    public void removeCredenziali(Credenziali c){
        elencoCredenziali.remove(c);
    }

    public boolean chechkCredenziali(Credenziali c){
        for (int i=0; i<elencoCredenziali.size();i++){
            if (elencoCredenziali.get(i)==c)
                return true;
        }
        return false;
    }

    public Integer getCliente(Credenziali c){
        for (int i=0; i<elencoCredenziali.size();i++) {
            if (elencoCredenziali.get(i) == c)
                return c.getCliente();
        }
        return null;
    }
}
