package com.itim.foodcharity.Controller;

import com.itim.foodcharity.Dto.CharityDto;
import com.itim.foodcharity.Model.*;
import com.itim.foodcharity.iService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

           // System.out.println(dto.);
            charityService.Update(dto);
            return "Ok";
        }catch (Exception e){
            return e.getLocalizedMessage();
        }

    }

    @PostMapping("/delete/{id}")
    public boolean DeleteCharity(@PathVariable String id) {
        System.out.println(id);
       return charityService.Delete(id);
    }

    @PostMapping("/all")
    public List<Charity> AllCharity() {
        return charityService.getAll();
    }


}
