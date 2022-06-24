package com.todos.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class RemoveTodoTest extends Setup {

	public RemoveTodoTest() throws IOException {
		
		super();
	}



	@Test

	public void iCanRemoveTod() throws IOException, InterruptedException {

		TodoPage todoPage = new TodoPage();
		todoPage.sumbitToDo(prop.getProperty("todo1"));
		// Thread.sleep(0);
		todoPage.removeElement(TodoPage.delete);
		System.out.println("ttttttt");

	}

}
