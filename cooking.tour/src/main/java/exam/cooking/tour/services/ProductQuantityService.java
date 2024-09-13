package exam.cooking.tour.services;

import exam.cooking.tour.dto.CreateProductQuantityDto;
import exam.cooking.tour.dto.ProductQuantityDto;
import exam.cooking.tour.entities.ProductQuantity;

import java.util.List;

public interface ProductQuantityService {
    ProductQuantityDto getBy(Long id);
    ProductQuantityDto save(CreateProductQuantityDto createProductQuantityDto);
    List<ProductQuantityDto> getAll();
}
