package pl.sdacademy.designpatterns.behavioral.templatemethod;

public class InformalLetterWriterHelper extends AbstractLetterWriterHelper {
    @Override
    protected String createHeader(String recipient) {
        return "Cześć " + recipient + ",";
    }

    @Override
    protected String createFooter(String sender) {
        return "Pozdrawiam,\n" + sender;
    }
}
