package honggi;

public class PasteSubscriber implements KeyboardSubscriber {

    private final Clipboard clipboard;

    public PasteSubscriber(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    @Override
    public void onKeyClick(String keyCode, boolean isCtrlDown, String selected) {
        if (isCtrlDown && keyCode.equals("v")) {
            System.out.println("클립보드 내용(" + clipboard.getText() + ")을 붙여넣었습니다.");
        }
    }
}
