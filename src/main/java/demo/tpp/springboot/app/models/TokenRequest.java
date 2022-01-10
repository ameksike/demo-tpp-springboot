package demo.tpp.springboot.app.models;

/**
 * TokenRequest
 */
public class TokenRequest {

    public String grant_type;
    public String client_id;
    public String client_secret;

    public TokenRequest(String client_id, String client_secret){
        this.grant_type = "client_credentials";
        this.client_id = client_id;
        this.client_secret = client_secret;
    }
}