abstract class Book {
    public String name;
    public String author;
    public String categoryName;

    public abstract void accept(IBookExportVisitor visitor);
}
