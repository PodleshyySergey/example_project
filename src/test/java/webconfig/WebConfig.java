package webconfig;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:webconfig.properties"
})

public interface WebConfig extends Config {

    @Key("is.remote")
    Boolean isRemote();

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("base.url")
    String baseURL();

    @Key("search.item")
    String searchItem();

    @Key("search.site")
    String searchSite();

}
