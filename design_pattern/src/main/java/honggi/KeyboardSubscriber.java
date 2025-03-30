package honggi;

public interface KeyboardSubscriber {
    void onKeyClick(String keyCode, boolean isCtrlDown, String selected);
}
