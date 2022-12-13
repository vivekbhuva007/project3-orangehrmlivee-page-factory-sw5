package com.orangehrmlive.testsuite;

import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.pages.ForgotPassword;
import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ForgotPasswordTest extends BaseTest {
    ForgotPassword forgotPassword;

    @BeforeMethod
    public void inIt() {
        forgotPassword = new ForgotPassword();
    }


    @Test(groups = {"smoke","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPassword.forgotPasswordLink();

        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPassword.resetPasswordMessage(),expectedMessage,"no message displayed");



    }}


