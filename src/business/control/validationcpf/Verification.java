public class StartVerification {
    protected CpfVerification state;
    protected int[] digits;

    public StartVerification(int[] digits) {
        state = new FirstTest(digits);
        this.digits = digits;
    }

    public boolean firstValidate() {
        state = state.validate();

        if (state == null)
            return false;
        else
            return true;
    }

    public boolean secondValidate() {
        state = state.validate();

        if (state == null)
            return false;
        else
            return true;
    }

    public boolean federalValidate() {
        state = state.validate();

        if (state == null)
            return false;
        else
            return true;
    }

}
