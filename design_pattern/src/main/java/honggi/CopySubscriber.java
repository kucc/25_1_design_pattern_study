package honggi;

public class CopySubscriber implements KeyboardSubscriber {

    private final Clipboard clipboard;

    public CopySubscriber(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    @Override
    public void onKeyClick(String keyCode, boolean isCtrlDown, String selected) {
        if (isCtrlDown && keyCode.equals("c")) {
            clipboard.setText(selected);
            System.out.println("클립보드에 내용이 복사되었습니다.");
        }
    }
}
