package com.itim.foodcharity.Controller;

import com.itim.foodcharity.Dto.CharityDto;
import com.itim.foodcharity.Model.*;
import com.itim.foodcharity.iService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("app")
public class FoodCharityController {
    @Autowired
    private CharityService charityService;

    @PostMapping("/addCharity")
    public Charity AddCharity(@RequestBody CharityDto dto) {
        System.out.println(dto.getAddress());
        return charityService.Add(dto);
    }

    @PostMapping("/updateCharity")
    public String UpdateCharity(@RequestBody CharityDto dto) {
        try {
            System.out.println(dto.getAddress());
            charityService.Update(dto);
            return "Ok";
        }catch (Exception e){
            return e.getLocalizedMessage();
        }

    }

}
