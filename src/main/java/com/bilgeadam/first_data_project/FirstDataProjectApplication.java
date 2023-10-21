package com.bilgeadam.first_data_project;

import com.bilgeadam.first_data_project.entities.Category;
import com.bilgeadam.first_data_project.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class FirstDataProjectApplication  implements CommandLineRunner {

	private final CategoryRepository categoryRepository;

	public FirstDataProjectApplication(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstDataProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Category> categories = categoryRepository.findAll();
		System.out.println(Objects.nonNull(categories) ? categories.toString() : "No Value");
		List<Category> categoryList = categoryRepository.findByName("Kebabs");
		System.out.println(Objects.nonNull(categoryList) ? categoryList.toString() : "No Value");
		addCategory();
	}

	private void addCategory(){
		Category category=new Category();
		category.setId(10);
		category.setName("Doner");
		category.setDescription("Turkish Doner");
		Category returnValue = categoryRepository.saveAndFlush(category);
		System.out.println(Objects.nonNull(returnValue) ? returnValue.toString() : "No Save");
	}
}
