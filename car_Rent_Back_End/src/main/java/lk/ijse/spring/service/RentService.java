package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.RentDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  11/3/2023 - 5:15 PM
 * @since : v0.01.0
 **/

public interface RentService {
    CustomDTO rentIdGenerate();

    void bookingCars(@RequestBody RentDTO dto);

    CustomDTO getSumOfBooking();

    CustomDTO getSumOfBookingPending();

    CustomDTO getSumOfBookingActive();

    ArrayList<RentDTO> getAllRent();

    void deleteRent(String rentID);

    void bookingConform(String rentID, String driverId);

    void bookingReject(String rentID, String driverId);

    RentDTO searchId(String id);
}
