package br.com.iser.papercute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.iser.papercute.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
