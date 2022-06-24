package com.todos.tests;

import java.io.IOException;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
	}

	TodoPage todoPage;

	@Test
	public void iCanAddToDo() throws IOException {
		todoPage = new TodoPage();
		boolean elementText = todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(elementText);
		
		todoPage.sumbitToDo(prop.getProperty("todo1"));

		String elementTodo = todoPage.checkFieldContain(TodoPage.text1);
		
		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo1")));
		
		boolean elementSelected = todoPage.isElementSelected(TodoPage.select);
		Assert.assertFalse(elementSelected);
		System.out.println("bbbb");
		

	}
}
