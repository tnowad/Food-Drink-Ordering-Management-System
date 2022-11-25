public interface IGetable <T> {
    public T getById(int id);
    public T[] getByString(String string);
}