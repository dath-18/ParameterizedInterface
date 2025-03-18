package mx.uv.fiee.iinf.paradigmas.poo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax<T> implements IMinMax<T>
{
    private final T[] lista;
    public MinMax(T[] listado) {
        this.lista = listado;
        List<T> lista2 = Arrays.asList(lista);
        Collections.sort((List) lista2);
    }
    
    @Override
    public T min() {
        return lista[0];
    }

    @Override
    public T max() {
        return lista[lista.length - 1];
    }
}
