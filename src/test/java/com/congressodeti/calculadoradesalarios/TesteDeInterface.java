package com.congressodeti.calculadoradesalarios;

import java.io.File;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TesteDeInterface {

    @Value("${local.server.port}")
    protected int serverPort;

    @Rule
    public BrowserWebDriverContainer chrome = new BrowserWebDriverContainer()
            .withDesiredCapabilities(DesiredCapabilities.chrome())
            .withRecordingMode(VncRecordingMode.SKIP, new File("target"));

    @Test
    public void validaCalculoDeSalario() throws InterruptedException {
        RemoteWebDriver driver = chrome.getWebDriver();
        driver.get("http://172.18.0.1:" + serverPort + "/index.html");
        WebElement label = driver.findElement(By.id("rendaBrutaValor"));
        label.sendKeys("2000");
        WebElement botao = driver.findElement(By.id("btCalcula"));
        botao.click();
        Thread.sleep(1000L);
        WebElement clt = driver.findElement(By.id("cltValor"));
        WebElement pj = driver.findElement(By.id("pjValor"));
        Assertions.assertThat(clt.getText()).isEqualTo("R$ 1833.33332");
        Assertions.assertThat(pj.getText()).isEqualTo("R$ 1880");
    }

}
