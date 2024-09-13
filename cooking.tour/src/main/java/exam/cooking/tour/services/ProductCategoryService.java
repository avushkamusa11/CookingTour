package exam.cooking.tour.services;

import exam.cooking.tour.dto.CreateProductCategoryDto;
import exam.cooking.tour.dto.ProductCategoryDto;

import java.util.List;

public interface ProductCategoryService {
    ProductCategoryDto getBy(Long id);
    ProductCategoryDto save(CreateProductCategoryDto createProductCategoryDto);
    List<ProductCategoryDto> getAll();

}
