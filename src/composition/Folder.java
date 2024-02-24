package composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String folderName;
    private List<Folder> folderList;
    private List<File> fileList;

    public Folder() {
        this.folderList = new ArrayList<>();
        this.fileList = new ArrayList<>();
    }

    public Folder(String folderName) {
        this.folderList = new ArrayList<>();
        this.fileList = new ArrayList<>();
        this.folderName = folderName;
    }

    public void addSubfolder(String subfolderName) {
        Folder subFolder = new Folder();
        subFolder.setFolderName(subfolderName);
        folderList.add(subFolder);
    }

    public void deleteSubfolder(String subfolderName) {
        for(Folder folder : folderList) {
            if(subfolderName.equals(folder.getFolderName())) {
                this.folderList.remove(folder);
                break;
            }
        }
    }

    public void addFile(String fileName) {
        File file = new File(fileName);
        fileList.add(file);
    }

    public boolean deleteFile(File file) {
        return this.fileList.remove(file);
    }

    public Folder getSubFolder(String subfolderName) {
        for(Folder folder : folderList) {
            if(subfolderName.equals(folder.getFolderName())) {
                return folder;
            }
        }
        return new Folder();
    }

    public void print() {
        printHelper(0);
    }

    private void printHelper(int recurCount) {
        StringBuilder indentation = new StringBuilder();
        for(int i = 0; i < recurCount; i++) {
            indentation.append("\t");
        }

        System.out.println(indentation.toString() + "Folder : " + folderName);

        for(Folder folder : folderList) {
            folder.printHelper(recurCount + 1);
        }

        for(File file : fileList) {
            System.out.println(indentation.toString() + "\tFile: " + file.getFileName());
        }
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }
}
