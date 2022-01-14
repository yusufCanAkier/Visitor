public interface IBookExportVisitor {
    void exportVisit(Magazine magazine);
    void exportVisit(Encyclopedia encyclopedia);
}
