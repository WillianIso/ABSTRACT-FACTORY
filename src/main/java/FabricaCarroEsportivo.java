public class FabricaCarroEsportivo implements FabricaAbstrata {

    @Override
    public Preco emitirPreco()
    {
        return new PrecoEsportivo();
    }

    @Override
    public Modelo emitirModelo()
    {
        return new ModeloEsportivo();
    }
}
