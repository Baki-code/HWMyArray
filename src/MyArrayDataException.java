public class MyArrayDataException extends Throwable {
    int i;
    int j;

    public MyArrayDataException(int i, int j) {
        super("Введены неверные значения, строка " + i + ", столбец " + j);
        this.i = i;
        this.j = j;
    }
}
