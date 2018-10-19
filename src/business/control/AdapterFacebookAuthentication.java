package business.control;

public class AdapterFacebookAuthentication extends EmailAuthentication {
    private FacebookAuthentication facebook;
 
    public AdapterFacebookAuthentication(FacebookAuthentication facebook) {
        this.facebook = facebook;
    }
 
    @Override
    public void logarEmail() {
        facebook.logarNoFacebook();
    }
}
