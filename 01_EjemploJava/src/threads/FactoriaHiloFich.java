package threads;

/**
 * @author Jaime Palomo
 */
public class FactoriaHiloFich {

    public HiloFichero HiloFichero1() {
        return new HiloFichero(new StrAuxV1());
    }
    public HiloFichero HiloFichero2()
    {
        return new HiloFichero(new StrAuxV2());
    }


}
