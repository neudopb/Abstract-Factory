package celulares;

/**
 *
 * @author Neudinho Paulino
 */
public class Cliente {

    public static void main(String[] args) {

        FabricaCelular fabrica = new Foxconn();
        
        CelularXiaomi xiaomi = fabrica.criarXiaomi();
        CelularIphone iphone = fabrica.criarIphone();
        
        xiaomi.informacoes();
        iphone.informacoes();
    }
    
}
