package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon extends Main {


    @Test
    public void testSearchBoxTypeAble() throws InterruptedException {
        searchBoxIsTypable();
        System.out.println(driver.getTitle());
// Assert.assertEquals("Amazon.com : Samsung s20 plus",driver.getTitle());
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).isDisplayed());
    }



    @Test
    public void testSearchElectronics() throws InterruptedException {
        searchElectronics();
    }
    @Test
    public void testFindAGift() throws InterruptedException {
        findAGift();
    }
    @Test
    public void testMensFashion() throws InterruptedException {
        mensFashion();
    }
    @Test
    public void testFindSelectYourAddress() throws InterruptedException {
        findSelectYourAddress();
    }
    @Test
    public void testDeskSupplies() throws InterruptedException {
        deskSupplies();
    }
    @Test
    public void testSeachEchoDot() throws InterruptedException {
        searchEchoDot();
    }
    @Test
    public void testBestSellersButton(){
        bestSellersButton();
        Assert.assertEquals("Amazon.com Best Sellers: The most popular items on Amazon",driver.getTitle());

    }
    @Test
    public void testCustomerServicesButton() throws InterruptedException {
        customerServices();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).isDisplayed());
    }
    @Test
    public void testtodaysDealButton() throws InterruptedException {
        todaysDeals();
        Assert.assertEquals("Gold Box Deals | Today's Deals - Amazon.com",driver.getTitle());
    }
    @Test
    public void testNewRelease(){
        newRelease();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"zg_banner_text_wrapper\"]")).isDisplayed());
    }
    @Test
    public void testTryPrime() throws InterruptedException {
        tryPrimeButton();
        Assert.assertEquals("Amazon.com: Amazon Prime", driver.getTitle());
    }

    @Test
    public void testShoppingCart() throws InterruptedException {
        shoppingCart();
    }

    @Test
    public void testamazonBasic() throws InterruptedException {
        amazonBasic();
    }

    @Test
    public void testSellButton() throws InterruptedException {
        sellButton();
    }

    @Test
    public void testSetProductSearch() throws InterruptedException {
        setProductSearch();
    }

    @Test
    public void testsetSelectYourAddressd() throws InterruptedException {
        setSelectYourAddressd();
    }

    @Test
    public void testamazonBurgerButtonIsDiplayed() {
        amazonBurgerButtonIsDiplayed();
    }

    @Test
    public void testamazonBurgerButtonIsEnable() {
        amazonBurgerButtonIsEnable();
    }

    @Test
    public void testGiftCardButtonDisplay() {
        giftCardButtonDisplay();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).isDisplayed());
    }

    @Test
    public void testGiftCardHomePageDisplay() {
        giftCardHomePageDisplay();
        Assert.assertEquals("Amazon.com Gift Cards", driver.getTitle());
    }

    @Test
    public void testEGiftCardClickable() {
        eGiftCardButtonIsClickAble();
    }

    @Test
    public void testBirthDayButtonClickable() throws InterruptedException {
        birthDayButtonIsActive();
        Assert.assertEquals("Amazon.com Gift Cards", driver.getTitle());
    }

    @Test
    public void testRedeemGiftCard() throws InterruptedException {
        redeemGiftCard();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ap_email']")).isDisplayed());
    }

    @Test
    public void testViewYourBalance() throws InterruptedException {
        viewYourBalace();
        Assert.assertEquals("Amazon Sign-In", driver.getTitle());
    }

    @Test
    public void testReloadYourBalance() throws InterruptedException {
        reloadYourBalance();
        Assert.assertEquals("Reload Your Balance", driver.getTitle());
    }

    @Test
    public void testAmazonCash() throws InterruptedException {
        amazonCash();
        Assert.assertEquals("Amazon Cash", driver.getTitle());
    }


}

