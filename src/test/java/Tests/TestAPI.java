package Tests;

import apiConfig.ApiHelper;
import org.junit.jupiter.api.Test;

public class TestAPI {

    @Test
    public void testAPI() {
        System.out.println("base URL: " + ApiHelper.getBaseUrl());
        System.out.println("base Token: " + ApiHelper.getToken());
    }

}
