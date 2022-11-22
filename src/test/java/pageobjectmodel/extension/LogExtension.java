package pageobjectmodel.extension;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class LogExtension implements BeforeEachCallback, AfterEachCallback, BeforeAllCallback {
    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {

        System.out.println("Log afterEach");

    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("beforeAll");

    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("beforeEach");

    }
}
