package celulares;

/**
 *
 * @author Neudinho Paulino
 */
public class Iphone7 implements CelularIphone {

    @Override
    public void informacoes() {
        System.out.println("MODELO: Iphone 7\n"
                + "S.O: IOS\n"
                + "PESO: 138g\n"
                + "RAM: 2 GB\n"
                + "POLEGADAS: 4.7\n"
                + "AMPERE: 1960 mAh\n");
    }

}
