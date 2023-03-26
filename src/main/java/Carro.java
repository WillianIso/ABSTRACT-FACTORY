public class Carro {

    private Preco preco;
    private Modelo modelo;

    public Carro (FabricaAbstrata fabrica)
    {
        this.preco = fabrica.emitirPreco();
        this.modelo = fabrica.emitirModelo();
    }

    public String emitirPreco()
    {
        return this.preco.emitir();
    }

    public String emitirModelo()
    {
        return this.modelo.emitir();
    }
}
