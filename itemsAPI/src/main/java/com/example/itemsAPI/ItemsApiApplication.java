package com.example.itemsAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemsApiApplication.class, args);
	}

}
//12/10 --
//Reorganized file structure
//Added constructors and hash override to item.java
//Added starter code to itemcontroller
//Tested code via MySQL per example instructions
//----Item added and tested in Postman
//I don't believe I am connected to git properly
//----git status reflecting files that I am unsure about
//----did not add, commit, or push for now

//12/12 --
///item/all works
//item/"id", put and post does not work yet
//Unable to get error in --ItemServiceMySQL--to go away
// without causing errors in other files
//Added @repository to itemrepository
//delete works

//12/14--
//CRUD minus DTO is working
//The id numbering is off...not sure what is happening
//with that...but it's at least working

//Tried to add Dto with no success.
//Started a new file with different code,
//This file was successful--Finalprojbe --