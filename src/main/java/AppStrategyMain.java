import bicicleta.Bicicleta;
import bicicleta.ComportamentoDoFreio;
import bicicleta.FreioComum;
import bicicleta.FreioDisco;

public class AppStrategyMain {

    public static void main(String[] args) {

        ComportamentoDoFreio freioComum = new FreioComum();
        Bicicleta bicicletaComum = new Bicicleta(freioComum);

        bicicletaComum.freiar();

        ComportamentoDoFreio freioDisco = new FreioDisco();
        Bicicleta bicicletaCompeticao = new Bicicleta(freioDisco);

        bicicletaCompeticao.freiar();
    }
}
