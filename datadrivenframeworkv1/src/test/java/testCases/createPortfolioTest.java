package testCases;

import Keyword.ApplicationKeywords;

public class createPortfolioTest extends ApplicationKeywords {
    public void portFolioTest(){
    /*
     * 1.Open Target Website
     * 2.Click on Sign In button/link
     * 3.Enter valid credentials
     * 4.Click on Submit button
     * 5.Verify you are on Portfolio Page after login
     * 6.Click on Create Portfolio link/button
     * 7.Enter Portfolio Name
     * 8.Click on Create Portfolio Link   
     */

    // GenericKeywords gK = new GenericKeywords();
     //ValidationKeywords vK = new ValidationKeywords();
     ApplicationKeywords aK = new ApplicationKeywords();
     aK.openBrowser("chrome"); 
     aK.navigateTo("https://example.com"); // Replace with actual URL
        aK.click("SignInButton"); // Replace with actual element identifier 
    }
    

}
