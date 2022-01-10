package demo.tpp.springboot.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import demo.tpp.springboot.app.models.Profile;
import demo.tpp.springboot.app.models.TokenRequest;
import demo.tpp.springboot.app.models.TokenResponse;
import demo.tpp.springboot.app.properties.TropiPayProperties;

@Service
public class TropiPayService {

    private TropiPayProperties properties;

    private RestTemplate http;
    private String baseUrl;

    @Autowired
    public TropiPayService(
        @Autowired Environment environment, 
        @Autowired TropiPayProperties properties
    ) {
        this.properties = properties;
        this.baseUrl = environment.getProperty("tropipay.url");
        this.http = new RestTemplate();
    }

    /**
     * @description OAuth 2.0 client credentials flow
     * @return TokenResponse
     */
    public TokenResponse login() {
        String ClientId = this.properties.getClientId(); 
        String ClientSecret =  this.properties.getClientSecret(); 
        String url = this.baseUrl + "/api/v2/access/token";

        HttpHeaders headers = new HttpHeaders();
        headers.set("content-type", "application/json");

        HttpEntity<TokenRequest> request = new HttpEntity<>(new TokenRequest(ClientId, ClientSecret), headers);
        ResponseEntity<TokenResponse> response = this.http.postForEntity(url, request, TokenResponse.class);

        return response.getBody();
    }

    /**
     * @description get prfofile data
     * @return Profile
     */
    public Profile getProfile() {
        TokenResponse token = this.login();

        String url = this.baseUrl + "/api/users/profile";
        String authHeader = "Basic " + new String(token.access_token);
        HttpHeaders headers = new HttpHeaders();
        headers.set("content-type", "application/json");
        headers.set("Authorization", authHeader);

        HttpEntity request = new HttpEntity(headers);
        ResponseEntity<Profile> response = this.http.exchange(url, HttpMethod.GET, request, Profile.class);

        return response.getBody();
    }
}
