package com.itim.foodcharity.Service;

import com.itim.foodcharity.Dto.CharityDto;
import com.itim.foodcharity.Model.Charity;
import com.itim.foodcharity.Repository.CharityRepository;
import com.itim.foodcharity.iService.CharityService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;


@Service
public class CharityServiceImpl implements CharityService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CharityRepository charityRepository;

    @Override
    public Charity Add(CharityDto data) {
        Charity charity = modelMapper.map(data,Charity.class);
        charityRepository.save(charity);
        return charity;
    }

    @Override
    public void Delete(String charityId) {
        Charity charity = charityRepository.findById(charityId).
                orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + charityId));
        charityRepository.delete(charity);
    }

    @Override
    public void Update(CharityDto data) {
        Charity charity = modelMapper.map(data,Charity.class);
        Charity Oldcharity = charityRepository.findById(charity.getCharityId()).
                orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + charity.getCharityId()));
       Oldcharity.setAddress(charity.getAddress());
       Oldcharity.setName(charity.getName());
       Oldcharity.setPhoneNo(charity.getPhoneNo());
       charityRepository.save(Oldcharity);
    }

    @Override
    public List<Charity> getAll() {
        return charityRepository.findAll();
    }
}
