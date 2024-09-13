package exam.cooking.tour.services;

import exam.cooking.tour.dto.CreateProductCategoryDto;
import exam.cooking.tour.dto.ProductCategoryDto;
import exam.cooking.tour.dto.ProductDto;
import exam.cooking.tour.entities.Product;
import exam.cooking.tour.entities.ProductCategory;
import exam.cooking.tour.entities.User;
import exam.cooking.tour.repositories.ProductCategoryRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
    @Autowired
    private ProductCategoryRepo productCategoryRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductCategoryDto getBy(Long id) {
        Optional<ProductCategory> productCategory = productCategoryRepo.findById(id);
        if(productCategory.isPresent()){
            return convertToDto(productCategory.get());
        }
        return null;
    }



    @Override
    public ProductCategoryDto save(CreateProductCategoryDto createProductCategoryDto) {
        ProductCategory productCategory = convertCreateProductCategoryDtoToProductCategory(createProductCategoryDto);
        return convertToDto(productCategory);
    }

    @Override
    public List<ProductCategoryDto> getAll() {
        return productCategoryRepo.findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
    }
    private ProductCategoryDto convertToDto(ProductCategory productCategory) {
        ProductCategoryDto productCategoryDto = modelMapper.map(productCategory, ProductCategoryDto.class);
        return productCategoryDto;
    }
    private ProductCategory convertCreateProductCategoryDtoToProductCategory(CreateProductCategoryDto createProductCategoryDto) {
        return modelMapper.map(createProductCategoryDto, ProductCategory.class);
    }
}
