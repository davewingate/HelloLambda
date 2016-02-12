package hello.lambda;

import javax.annotation.Nullable;

public class SayHiResult {

    private final boolean doneToldEm;
    private final @Nullable String whatWeToldEm;

    private SayHiResult(boolean doneToldEm, @Nullable String whatWeToldEm) {
        this.doneToldEm = doneToldEm;
        this.whatWeToldEm = whatWeToldEm;
    }

    public boolean isDoneToldEm() {
        return doneToldEm;
    }

    @Nullable
    public String getWhatWeToldEm() {
        return whatWeToldEm;
    }

    public String toString() {
        return this.getClass().getName() + "(doneToldEm=" + this.doneToldEm + ", whatWeToldEm=" + this.whatWeToldEm + ")";
    }

    public static SayHiResult success(String whatWeToldEm) {
        return new SayHiResult(true, whatWeToldEm);
    }

    public static SayHiResult fail() {
        return new SayHiResult(false, null);
    }
}

