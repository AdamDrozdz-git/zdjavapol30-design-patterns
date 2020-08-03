package pl.sdacademy.designpatterns.behavioral.templatemethod;

public class FormalLetterWriterHelper extends AbstractLetterWriterHelper {
    @Override
    protected String createHeader(String recipient) {
        return "Szanowny " + recipient + ",";
    }

    @Override
    protected String createFooter(String sender) {
        return "Z poważaniem,\n" + sender;
    }
}
