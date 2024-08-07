/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package HomePage;
  import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Shiva Raj
 */

 public class CSVDataToWebDriver {
    public static void main(String[] args) {
        // Set path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Read data from CSV file and interact with WebDriver
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String username = data[0];
                String password = data[1];

                // Navigate to the login page
                driver.get("https://example.com/login");

                // Find username and password fields and input data
                WebElement usernameField = driver.findElement(By.id("username"));
                WebElement passwordField = driver.findElement(By.id("password"));
                usernameField.sendKeys(username);
                passwordField.sendKeys(password);

                // Perform login action (assuming there's a login button)
                WebElement loginButton = driver.findElement(By.id("login-button"));
                loginButton.click();

                // Additional actions as needed...
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the WebDriver session
        driver.quit();
    }
}
    

