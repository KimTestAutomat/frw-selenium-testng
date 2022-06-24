package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	/*Locators*/
	public static final String InputToDo = "//input[@ng-model='newTodo']";
	public static final String CheckToDo = "/html/body/ng-view/section/section/ul/li/div/label";
	public static final String SelectedToDo = "//input[@ng-model='todo.completed']";
	public static final String DeleteToDo = "//*[@ng-click = 'removeTodo(todo)']";
	//
	/*FindBy*/
	@FindBy(how = How.XPATH, using = InputToDo)
	public static WebElement inputText;

	@FindBy(how = How.XPATH, using = CheckToDo)
	public static WebElement text1;
	@FindBy(how = How.XPATH, using = SelectedToDo)
	public static WebElement select;
	@FindBy(how = How.XPATH, using = DeleteToDo)
	public static WebElement delete;
	/*Methods*/

	public void sumbitToDo(String todo) {

		writeText(inputText, todo);
		inputText.sendKeys(Keys.ENTER);

	}

	public Boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();

		return isElementDisplayed;

	}

	public String checkFieldContain(WebElement element) {
		String checkFiledContain = element.getText();
		return checkFiledContain;
	}

	public Boolean isElementSelected(WebElement element) {
         Boolean isSelected=element.isSelected();
		
		return isSelected;
	}
	
	public void removeElement(WebElement element) {
		
		executor.executeScript("arguments[0].click();", element);
			
	}
}