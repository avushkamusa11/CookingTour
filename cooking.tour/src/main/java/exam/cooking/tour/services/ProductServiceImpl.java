package exam.cooking.tour.services;

import exam.cooking.tour.dto.CreateProductDto;
import exam.cooking.tour.dto.CreateUserDto;
import exam.cooking.tour.dto.ProductDto;
import exam.cooking.tour.dto.UserDto;
import exam.cooking.tour.entities.Product;
import exam.cooking.tour.entities.ProductCategory;
import exam.cooking.tour.entities.User;
import exam.cooking.tour.repositories.ProductCategoryRepo;
import exam.cooking.tour.repositories.ProductRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ProductCategoryRepo productCategoryRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDto getBy(Long id) {
        Optional<Product> product = productRepo.findById(id);
        if(product.isPresent()){
            return convertToDto(product.get());
        }
        return null;
    }

    @Override
    public ProductDto save(CreateProductDto createProductDto) {
        Product product = convertCreateProductDtoToProduct(createProductDto);
        return convertToDto(product);
    }

    @Override
    public List<ProductDto> getAll() {
        return productRepo.findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
    }

    private ProductDto convertToDto(Product product){
        ProductDto productDto = modelMapper.map(product, ProductDto.class);
        return productDto;
    }

    private Product convertCreateProductDtoToProduct(CreateProductDto createProductDto){
        Optional<ProductCategory> category = productCategoryRepo.findById(createProductDto.getCategoryId());
        Product product = new Product();
        if(category.isPresent()){
            product.setProductCategory(category.get());
        }else{
            ProductCategory defaultProductCategory = productCategoryRepo.findById(1l).get();
            product.setProductCategory(defaultProductCategory);
        }
        product.setName(createProductDto.getName());
        return product;
    }
}
