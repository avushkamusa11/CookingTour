package exam.cooking.tour.services;

import exam.cooking.tour.dto.MeasuringUnitDto;
import exam.cooking.tour.entities.MeasuringUnits;
import exam.cooking.tour.repositories.MeasuringUnitsRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeasuringUnitServiceImpl implements MeasuringUnitService{

    @Autowired
    private MeasuringUnitsRepo measuringUnitsRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public MeasuringUnitDto getBy(Long id) {
        Optional<MeasuringUnits> measuringUnits = measuringUnitsRepo.findById(id);
        if(measuringUnits.isPresent()){
            return convertToDto(measuringUnits.get());
        }
        return null;
    }

    @Override
    public List<MeasuringUnitDto> getAll() {
        return measuringUnitsRepo.findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
    }

    @Override
    public MeasuringUnitDto createMeasuringUnit(MeasuringUnitDto measuringUnitDto) {
        measuringUnitsRepo.save(convertToMeasuringUnit(measuringUnitDto));
        return measuringUnitDto;
    }

    MeasuringUnits convertToMeasuringUnit(MeasuringUnitDto measuringUnitDto){
        return  modelMapper.map(measuringUnitDto, MeasuringUnits.class);
    }

    MeasuringUnitDto convertToDto(MeasuringUnits measuringUnits){
        return modelMapper.map(measuringUnits, MeasuringUnitDto.class);
    }
}
