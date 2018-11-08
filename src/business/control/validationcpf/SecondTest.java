public class SecondTest implements CpfVerification{
    private int value;
    private int[] digits;

    public SecondTest(int[] digits) {
        this.digits = digits;
        value = 0;
    }

    @Override
    public CpfVerification validate() {

        for (int i = 11, j = 0; i >= 2; i--, j++) {
            value += i * digits[j];
        }
        if ((value * 10) % 11 == digits[10]) {
            return new FederalTest(digits);
        } else {
            this.error();
        }
        return null;
    }

    @Override
    public void error() {
        System.out.println("cpf invalido");

    }
}
