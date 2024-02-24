package composition;

public class CompositionDriver {

    public static void main(String[] args) {

        Folder demo = new Folder("demo1");
        demo.addSubfolder("Source Files");
        demo.addSubfolder("Include Path");
        demo.addSubfolder("Remote Files");

        demo.getSubFolder("Source Files").addSubfolder(".phalcon");
        demo.getSubFolder("Source Files").addSubfolder("app");
        demo.getSubFolder("Source Files").addSubfolder("cache");
        demo.getSubFolder("Source Files").addSubfolder("public");

        demo.getSubFolder("Source Files").getSubFolder("app").addSubfolder("config");
        demo.getSubFolder("Source Files").getSubFolder("app").addSubfolder("controllers");
        demo.getSubFolder("Source Files").getSubFolder("app").addSubfolder("library");
        demo.getSubFolder("Source Files").getSubFolder("app").addSubfolder("migrations");
        demo.getSubFolder("Source Files").getSubFolder("app").addSubfolder("models");
        demo.getSubFolder("Source Files").getSubFolder("app").addSubfolder("views");

        demo.getSubFolder("Source Files").getSubFolder("public").addFile(".htaccess");
        demo.getSubFolder("Source Files").getSubFolder("public").addFile(".htrouter.php");
        demo.getSubFolder("Source Files").getSubFolder("public").addFile("index.html");

        System.out.println(">> Full structure:");
        demo.print();

        // delete app folder
        System.out.println("\n>> Full structure after app folder deletion:");
        demo.getSubFolder("Source Files").deleteSubfolder("app");
        demo.print();

        // delete public folder
        System.out.println("\n>> Full structure after app & public folder deletion:");
        demo.getSubFolder("Source Files").deleteSubfolder("public");
        demo.print();

    }
}
