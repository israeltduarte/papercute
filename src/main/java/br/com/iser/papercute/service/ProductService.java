package br.com.iser.papercute.service;

import java.util.List;

import br.com.iser.papercute.dto.ProductDTO;
import br.com.iser.papercute.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public ProductDTO getProduct(Long id);

	public Product addProduct(ProductDTO dto);

	public ProductDTO updateProduct(Long id, ProductDTO dto);

	public String deleteProduct(Long id);

}