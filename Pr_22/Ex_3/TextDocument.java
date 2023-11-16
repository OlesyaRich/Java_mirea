package Pr_22.Ex_3;
import java.io.IOException;

class TextDocument implements IDocument {
    public TextDocument() {
        try {
            Process rs = Runtime.getRuntime().exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}