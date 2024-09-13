package exam.cooking.tour.services;

import exam.cooking.tour.dto.MeasuringUnitDto;
import exam.cooking.tour.entities.MeasuringUnits;

import java.util.List;

public interface MeasuringUnitService {
    MeasuringUnitDto getBy(Long id);
    List<MeasuringUnitDto> getAll();
    MeasuringUnitDto createMeasuringUnit(MeasuringUnitDto measuringUnitDto);
}
