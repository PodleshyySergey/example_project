package apiConfig;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:api.properties",
        "file:C:\\Devel\\example_project\\token.properties" //только с полным путем до файла, значение токена бралось из него.
})

public interface ApiConfig extends Config {

    @Key("api.base.url")
    String baseUrl();

    @Key("api.base.token")
    String baseToken();

}
