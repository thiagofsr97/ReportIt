public class FederalTest implements CpfVerification {
    private int[] digits;
    private RFBConnect rfbConnect = new RFBConnect();

    public FederalTest(int[] digits) {
        this.digits = digits;
    }

    @Override
    public CpfVerification validate() {

        if(rfbConnect.verifyInBase(digits)) {
            System.out.println("verificação finalizada, o cpf é válido");
            return this;
        }
        else {
            this.error();
        }
        return null;
    }

    @Override
    public void error() {
        System.out.println("cpf invalido");
    }
}
