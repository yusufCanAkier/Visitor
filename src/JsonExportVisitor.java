class JsonExportVisitor implements IBookExportVisitor{
    @Override
    public void exportVisit(Magazine magazine) {
        System.out.println(magazine.name + " exported by JsonExportVisitor");
    }

    @Override
    public void exportVisit(Encyclopedia encyclopedia) {
        System.out.println(encyclopedia.name + " exported by JsonExportVisitor");
    }
    @Override
    public void exportVisit(Newspaper newspaper) {
        System.out.println(newspaper.name + " exported by JsonExportVisitor");
    }
}
