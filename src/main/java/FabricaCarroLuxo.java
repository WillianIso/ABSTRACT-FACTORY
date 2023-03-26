public class FabricaCarroLuxo implements FabricaAbstrata{

    @Override
    public Preco emitirPreco() {
        return new PrecoLuxo();
    }

    @Override
    public Modelo emitirModelo()
    {
        return new ModeloLuxo();
    }
}
