public class XmlExportVisitor implements IBookExportVisitor{

    @Override
    public void exportVisit(Magazine magazine) {
        System.out.println(magazine.name + " exported by XmlExportVisitor");
    }

    @Override
    public void exportVisit(Encyclopedia encyclopedia) {
        System.out.println(encyclopedia.name + " exported by XmlExportVisitor");
    }
}
