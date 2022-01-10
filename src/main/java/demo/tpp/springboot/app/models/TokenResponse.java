package demo.tpp.springboot.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * TokenResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenResponse {
    public String access_token;
    public String refresh_token;
    public String scope;
    public int expires_in;
}