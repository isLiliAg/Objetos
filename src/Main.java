import java.awt.Color;

public class Main {
    public static void main(String[] args) {

        Arbol miArbolFavoritoAguacate = new Arbol(180, 30, TipoDeArbol.AGUACATE);

        System.out.println(miArbolFavoritoAguacate.getTipoArbol());
        System.out.println(miArbolFavoritoAguacate.getAlturaCm());
        System.out.println(miArbolFavoritoAguacate.getDiametroTroncoCm());

        /*Color troncoColor = Arbol.TRONCO_COLOR;
        System.out.println(troncoColor);*/
    }
}