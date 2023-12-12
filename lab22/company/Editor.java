package edu.lab22.company;

public class Editor {
    private IDocument document;
    private ICreateDocument documentFactory;

    public Editor(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        document.open();
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("No document is currently open.");
        }
    }
}
