package ads.poo;

import java.util.HashMap;

public class ColecaoEmail {
    private HashMap<String, String> dados = new HashMap<>();
    private String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    public boolean add(String rotulo, String valor){
        if (!dados.containsKey(rotulo)){
            if (valor.matches(eR)){
                dados.put(rotulo, valor);
            }
            return true;
        }else {
            return false;
        }
    }

    public boolean remove(String rotulo){
        if (dados.containsKey(rotulo)){
            dados.remove(rotulo);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean update(String rotulo, String valor){
        if (dados.containsKey(rotulo)){
            if (valor.matches(eR)){
                dados.put(rotulo, valor);
            }
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Email: "+"\n");

        this.dados.forEach((c,v) ->{
            sb.append(c).append(": ").append(v).append("\n");
        });

        return sb.toString();
    }
}
