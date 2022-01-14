public interface IBookExportVisitor {
    void exportVisit(Magazine magazine);
    void exportVisit(Encyclopedia encyclopedia);
    void exportVisit(Newspaper newspaper);
}
