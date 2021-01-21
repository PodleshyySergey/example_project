package apiConfig;

import org.aeonbits.owner.ConfigFactory;

public class ApiHelper {

    public static ApiConfig apiConfig() {
        return ConfigFactory.newInstance().create(ApiConfig.class);
    }

    public static String getBaseUrl() {
        return apiConfig().baseUrl();
    }

    public static String getToken() {
        return apiConfig().baseToken();
    }

}

