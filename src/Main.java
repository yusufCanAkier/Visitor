public class Main {
    public static void main(String[] args){
        Book earth = new Encyclopedia();

        earth.name = "Big Earth!";
        earth.author = "Jose S. Massey";
        earth.categoryName = "Encyclopedia";

        Book daily = new Magazine();

        daily.name = "Daily Magazine";
        daily.author = "Wayne D. Eakin";
        daily.categoryName = "Magazine";

        Book newsPaper = new Newspaper();

        newsPaper.name = "Fanatik Gazatesi";
        newsPaper.author = "Spor Yazarları";
        newsPaper.categoryName="Newspaper";

        IBookExportVisitor xmlExportVisitor = new XmlExportVisitor();
        IBookExportVisitor jsonExportVisitor = new JsonExportVisitor();

        earth.accept(jsonExportVisitor);
        daily.accept(jsonExportVisitor);
        newsPaper.accept(xmlExportVisitor);
    }
}
