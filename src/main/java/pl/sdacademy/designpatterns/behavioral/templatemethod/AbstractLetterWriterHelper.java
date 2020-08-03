package pl.sdacademy.designpatterns.behavioral.templatemethod;

public abstract class AbstractLetterWriterHelper {
    public String create(String sender, String recipient, String content) {
        return createHeader(recipient) + "\n\n" + content + "\n\n" + createFooter(sender);
    }

    protected abstract String createHeader(String recipient);
    protected abstract String createFooter(String sender);
}
