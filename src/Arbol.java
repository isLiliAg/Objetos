import java.awt.Color;

public class Arbol {
    //Atributos - Datos tipo double porque pueden ser representados por valores decimales
    //non-static
    double alturaCm;
    double diametroTroncoCm;
    TipoDeArbol tipoArbol;
    //Atributo - static
    static Color TRONCO_COLOR = new Color(102, 51, 0);

    //Constructor
    //Tendremos que añadir entradas al constructor para poder construir un árbol personalizado
    // con la altura, el diámetro y el tipo.
    Arbol(double alturaCm, double diametroTroncoCm,
          TipoDeArbol tipoArbol) {
        this.alturaCm = alturaCm;
        this.diametroTroncoCm = diametroTroncoCm;
        this.tipoArbol = tipoArbol;
    }

    //Funcion -> representa comportamiento
    void crecimiento() {
        this.alturaCm = this.alturaCm + 10;
        this.diametroTroncoCm = this.diametroTroncoCm + 1;
    }

    static void anuncioArbol() {
        System.out.println("Mira el color " +
                TRONCO_COLOR + "del tronco de ese arbol!");
    }

    //Instancia del Objeto -> Arbol
    //Aplicacion logica del comportamiento de un arbol(crecimiento)
    void anuncioArbolAlto() {
        if (this.alturaCm > 100) {
            System.out.println("El arbol de " +
                    this.tipoArbol + " esta muy alto!");
        }
    }
}
