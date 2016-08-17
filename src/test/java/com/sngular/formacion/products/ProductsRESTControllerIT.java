package com.sngular.formacion.products;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.sngular.formacion.shop.products.ProductsRESTController;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductsRESTController.class)
public class ProductsRESTControllerIT {

	private static final String PRODUCT_JSON = "{ \"name\": \"Play Station 4\", \"desc\": \"Super cool console\", \"price\": 399.0 }";
	
	@MockBean
	private ProductsRepository productsService;

	
	@Autowired
    private MockMvc mvc;
	
	@Test
	public void whenNewProductIsSent_ItWillBeCreatedWithUniqueId() throws Exception {
		
		mvc.perform(	
				post("/v1/products")
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.contentType(MediaType.APPLICATION_JSON)
				.content(PRODUCT_JSON));
//		.andExpect(status().isCr)
//		.andExpect(jsonPath("$.id").isNotEmpty())
//		.andExpect(jsonPath("$.name").value("Play Station 4"));
	}
	
}
