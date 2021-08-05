package SalesTxn09_Pkg.java;

public interface UnaryOperator<T> extends Function<T,T> {
    @Override
    public T apply(T t);
}