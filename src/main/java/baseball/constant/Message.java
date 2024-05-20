package baseball.constant;

public enum Message {

    START("숫자 야구 게임을 시작합니다."),
    INPUT("숫자를 입력해주세요 : "),
    SUCCESS("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    TERMINATE("게임을 종료합니다."),
    RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    ERROR("잘못 입력했습니다. 게임을 종료합니다.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
