public class MyArraySizeException extends Throwable {

    int row, column;

    public MyArraySizeException(int row, int column) {
        super("Размер массива должен быть 4х4");
        this.row = row;
        this.column = column;
    }
}