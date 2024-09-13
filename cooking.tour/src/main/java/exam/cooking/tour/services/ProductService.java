package exam.cooking.tour.services;

import exam.cooking.tour.dto.CreateProductDto;
import exam.cooking.tour.dto.ProductDto;
import exam.cooking.tour.entities.Product;

import java.util.List;

public interface ProductService {
    ProductDto getBy(Long id);
    ProductDto save(CreateProductDto createProductDto);
    List<ProductDto> getAll();
}
