package lk.ijse.spring.service;

import lk.ijse.spring.dto.IncomeDTO;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  11/3/2023 - 5:15 PM
 * @since : v0.01.0
 **/

public interface IncomeService {
    ArrayList<IncomeDTO> dailyIncome();
    ArrayList<IncomeDTO> monthlyIncome();
    ArrayList<IncomeDTO> AnnuallyIncome();
}
