package Config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static WebConfig getWebConfig() {
        return ConfigFactory.newInstance().create(WebConfig.class);
    }

    public static String getBrowserName() {
        return getWebConfig().browserName();
    }

    public static String getBaseUrl() {
        return getWebConfig().baseURL();
    }

    public static String getSearchItem() {
        return getWebConfig().searchItem();
    }

    public static String getSearchSite() {
        return getWebConfig().searchSite();
    }

}
