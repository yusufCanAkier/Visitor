class Magazine extends Book{
    @Override
    public void accept(IBookExportVisitor visitor) {
        visitor.exportVisit(this);
    }
}
