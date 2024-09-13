package exam.cooking.tour.services;

import exam.cooking.tour.dto.CreateProductQuantityDto;
import exam.cooking.tour.dto.ProductQuantityDto;
import exam.cooking.tour.repositories.ProductQuantityRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductQuantityServiceImpl implements ProductQuantityService{
    @Autowired
    private ProductQuantityRepo productQuantityRepo;
    @Autowired
    private ModelMapper modelMapper;
     
    @Override
    public ProductQuantityDto getBy(Long id) {
        return null;
    }

    @Override
    public ProductQuantityDto save(CreateProductQuantityDto createProductQuantityDto) {
        return null;
    }

    @Override
    public List<ProductQuantityDto> getAll() {
        return null;
    }
}
