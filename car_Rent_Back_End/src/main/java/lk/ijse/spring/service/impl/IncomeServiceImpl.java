package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.IncomeDTO;
import lk.ijse.spring.repo.IncomeRepo;
import lk.ijse.spring.service.IncomeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  11/3/2023 - 5:16 PM
 * @since : v0.01.0
 **/
@Service
@Transactional
public class IncomeServiceImpl implements IncomeService {
    @Autowired
    private IncomeRepo incomeRepo;
    @Autowired
    private ModelMapper mapper;

    @Override
    public ArrayList<IncomeDTO> dailyIncome() {
        return new ArrayList<IncomeDTO>(incomeRepo.dailyIncome());
    }

    @Override
    public ArrayList<IncomeDTO> monthlyIncome() {
        return new ArrayList<IncomeDTO>(incomeRepo.MonthlyIncome());
    }

    @Override
    public ArrayList<IncomeDTO> AnnuallyIncome() {
        return new ArrayList<IncomeDTO>(incomeRepo.AnnuallyIncome());
    }
}
