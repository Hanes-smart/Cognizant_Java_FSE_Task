interface Document {
    void open();
}

class WordDocument implements Document {

    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {

    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class DocumentFactory {

    public static Document createDocument(String type) {

        if(type.equalsIgnoreCase("WORD")) {
            return new WordDocument();
        }

        if(type.equalsIgnoreCase("PDF")) {
            return new PdfDocument();
        }

        return null;
    }
}

public class Main {

    public static void main(String[] args) {

        Document d1 = DocumentFactory.createDocument("WORD");
        Document d2 = DocumentFactory.createDocument("PDF");

        d1.open();
        d2.open();
    }
}