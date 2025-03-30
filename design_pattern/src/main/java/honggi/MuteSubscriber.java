package honggi;

/**
 * 동영상을 음소거하거나 음소거를 해제합니다.
 */
public class MuteSubscriber implements KeyboardSubscriber {

    private boolean isMuted = false;

    @Override
    public void onKeyClick(String keyCode, boolean isCtrlDown, String selected) {
        if (!isCtrlDown && keyCode.equals("m")) {
            if (isMuted)
                System.out.println("동영상 음소거가 해제되었습니다.");
            else
                System.out.println("동영상이 음소거되었습니다.");

            isMuted = !isMuted;
        }
    }
}
