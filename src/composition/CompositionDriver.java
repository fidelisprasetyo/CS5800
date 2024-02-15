package composition;

public class CompositionDriver {

    public static void main(String[] args) {

        Folder demo = new Folder("demo1");

        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");

        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");

        demo.addFolder(sourceFiles);
        demo.addFolder(includePath);
        demo.addFolder(remoteFiles);

        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(app);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(publicFolder);
        sourceFiles.addFile(htaccess);
        sourceFiles.addFile(htrouter);
        sourceFiles.addFile(index);

        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);

        System.out.println(">> Full structure:");
        demo.print();

        // delete app folder
        System.out.println("\n>> Full structure after app folder deletion:");
        sourceFiles.deleteFolder(app);
        demo.print();

        // delete public folder
        System.out.println("\n>> Full structure after app & public folder deletion:");
        sourceFiles.deleteFolder(publicFolder);
        demo.print();

    }
}
