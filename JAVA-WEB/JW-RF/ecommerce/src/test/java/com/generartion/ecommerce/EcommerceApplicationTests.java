package com.generartion.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generartion.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void pruebaGET() throws Exception {
		this.mockMvc.perform(get("/miOtso/productos/1"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().string(
						containsString("papasSabritas.jpg")
						));
	}// pruebaGET
	
	@Test
	@Disabled("Deshabilitado porque ya fue borrado")
	public void pruebaDELETE() throws Exception {
		this.mockMvc.perform(delete("/miOtso/productos/7"))
		.andDo(print())
		.andExpect(status().isOk());
	}// pruebaDELETE Se hizo de esta forma ya que el controller es void
	
	
	
	@Test
	public void pruebaPOST() throws Exception {
		Producto p = new Producto();
		p.setNombre("Maruchan de Pollo");
		p.setDescripcion("Sopa Maruchan de Pollo");
		p.setuRL_Imagen("sopaMaruchanPollo.webp");
		p.setPrecio(20.01);
		
		this.mockMvc.perform(post("/miOtso/productos/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p))
				)
		.andDo(print())
		.andExpect(status().isOk());
	}//pruebaPOST
	
	private static String asJsonString(final Object obj) {
        try {
          return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }//catch
     } // asJsonString
	
	@Test
	public void pruebaPUT () throws Exception {
		this.mockMvc.perform(put("/miOtso/productos/6")
				.queryParam("url_Imagen", "imagenx.jpg")
				)
				.andDo(print())
				.andExpect(status().isOk());
	}//prueba PUT
	
}
