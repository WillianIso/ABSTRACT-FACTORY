import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    void deveEmitirPrecoCarroLuxo()
    {
    FabricaAbstrata fabrica = new FabricaCarroLuxo();
    Carro carro = new Carro (fabrica);
    assertEquals("Preco Luxo", carro.emitirPreco());
    }

    @Test
    void deveEmitirModeloCarroLuxo()
    {
        FabricaAbstrata fabrica = new FabricaCarroLuxo();
        Carro carro = new Carro (fabrica);
        assertEquals("Modelo de Luxo", carro.emitirModelo());
    }

    @Test
    void deveEmitirPrecoCarroEsportivo()
    {
        FabricaAbstrata fabrica = new FabricaCarroEsportivo();
        Carro carro = new Carro(fabrica);
        assertEquals("Preco Esportivo", carro.emitirPreco());
    }

    @Test
    void deveEmitirModeloCarroEsportivo()
    {
        FabricaAbstrata fabrica = new FabricaCarroEsportivo();
        Carro carro = new Carro(fabrica);
        assertEquals("Modelo Esportivo", carro.emitirModelo());
    }

}
