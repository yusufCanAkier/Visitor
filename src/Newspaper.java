public class Newspaper extends Book{

    @Override
    public void accept(IBookExportVisitor visitor) {
        visitor.exportVisit(this);
    }
}
