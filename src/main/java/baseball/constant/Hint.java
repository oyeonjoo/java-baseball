package baseball.constant;

public enum Hint {

    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱");


    private final String hint;

    Hint(String hint) {
        this.hint = hint;
    }

    public String getHint() {
        return hint;
    }
}
