package celulares;

/**
 *
 * @author Neudinho Paulino
 */
public class Foxconn implements FabricaCelular{

    @Override
    public CelularXiaomi criarXiaomi() {
        return new RedmiNote8();
    }

    @Override
    public CelularIphone criarIphone() {
        return new Iphone7();
    }
    
}
