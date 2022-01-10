package demo.tpp.springboot.app.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "tropipay")
@Validated
public class TropiPayProperties {

    private String url;
    private String clientId;
    private String clientSecret;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String value) {
        this.clientId = value;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String value) {
        this.clientSecret = value;
    }
}