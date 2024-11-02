package ru.netology.transfer.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.transfer.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private SelenideElement codeField = $("[data-test-id=code] input");
    private SelenideElement verifyButton = $("[data-test-id=action-verify]");

    public VerificationPage() {
        codeField.shouldBe(visible);
    }


    public DashboardPage setVerificationCode(String code) {
        codeField.setValue(code);
        verifyButton.click();
        return new DashboardPage();
    }
}


