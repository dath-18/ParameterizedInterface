package mx.uv.fiee.iinf.paradigmas.poo;

import java.util.Arrays;

public class MinMax<T> implements IMinMax<T>
{
    private final T[] lista;
    public MinMax(T[] listado) {
        this.lista = listado;
        Arrays.sort(lista);
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
