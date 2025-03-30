package honggi;

import java.util.ArrayList;

/**
 * 키보드 입력을 관리합니다.
 */
public class KeyboardPublisher {

    private ArrayList<KeyboardSubscriber> subscribers = new ArrayList<>();
    public void addSubscriber(KeyboardSubscriber subscriber) {
        // 구독되어 있지 않다면 구독 추가
        if (!subscribers.contains(subscriber)) subscribers.add(subscriber);
    }
    public void removeSubscriber(KeyboardSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // 클릭 발생
    public void click(String keyCode, boolean isCtrlDown, String selected) {
        for (KeyboardSubscriber subscriber : subscribers) {
            subscriber.onKeyClick(keyCode, isCtrlDown, selected);
        }
    }
}
