package br.com.iser.papercute.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iser.papercute.constant.Path;
import br.com.iser.papercute.dto.ProductDTO;
import br.com.iser.papercute.entity.Product;
import br.com.iser.papercute.service.ProductService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	private ModelMapper mapper;

	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts() {

		log.info("ProductController.getProduct - Start");

		List<Product> response = this.productService.getAllProducts();

		log.info("ProductController.getProduct - End - ProductDTO: {}", response);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PostMapping
	public ResponseEntity<ProductDTO> addProduct(ProductDTO dto) {

		log.info("ProductController.addProduct - Start - ProductDTO: {}", dto);

		Product product = this.productService.addProduct(dto);

		ProductDTO response = this.mapper.map(product, ProductDTO.class);

		log.info("ProductController.addProduct - End - ProductDTO: {}", response);

		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping(Path.ID_PRODUCT)
	public ResponseEntity<ProductDTO> getProduct(Long id) {

		log.info("ProductController.getProduct - Start - Long: {}", id);

		ProductDTO response = this.productService.getProduct(id);

		log.info("ProductController.getProduct - End - ProductDTO: {}", response);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping(Path.ID_PRODUCT)
	public ResponseEntity<ProductDTO> updateProduct(Long id, ProductDTO dto) {

		log.info("ProductController.getProduct - Start - Long: {} - ProductDTO: {}", id, dto);

		ProductDTO response = this.productService.getProduct(id);

		log.info("ProductController.getProduct - End - ProductDTO: {}", response);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@DeleteMapping(Path.ID_PRODUCT)
	public ResponseEntity<String> deleteProduct(Long id) {

		log.info("ProductController.getProduct - Start - Long: {}", id);

		String response = this.productService.deleteProduct(id);

		log.info("ProductController.getProduct - End - String: {}", response);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}