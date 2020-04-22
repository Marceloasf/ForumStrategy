package bicicleta;

public class Bicicleta {

    private ComportamentoDoFreio comportamentoDoFreio;

    public Bicicleta(ComportamentoDoFreio comportamentoDoFreio) {

        this.comportamentoDoFreio = comportamentoDoFreio;
    }

    public void setComportamentoDoFreio(ComportamentoDoFreio comportamentoDoFreio) {

        this.comportamentoDoFreio = comportamentoDoFreio;
    }

    public void freiar() {

        this.comportamentoDoFreio.freio();
    }
}
