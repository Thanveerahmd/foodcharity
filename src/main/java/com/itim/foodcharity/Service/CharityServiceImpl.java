package com.itim.foodcharity.Service;

import com.itim.foodcharity.Dto.CharityDto;
import com.itim.foodcharity.Model.Charity;
import com.itim.foodcharity.Repository.CharityRepository;
import com.itim.foodcharity.iService.CharityService;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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
    public boolean Delete(String charityId) {
                ObjectId ob = new ObjectId(charityId);
            Charity charity = charityRepository.findByCharityId(ob).
                orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + charityId));
        charityRepository.delete(charity);
        return true;
    }

    @Override
    public void Update(CharityDto data) {
        Charity charity = modelMapper.map(data,Charity.class);
        System.out.println(charity.getName()+" awa");
        ObjectId ob =  new ObjectId(charity.getCharityId());
        System.out.println(ob.toString());
        Optional<Charity> Oldcharity = charityRepository.findByCharityId(ob);
        if(Oldcharity.isPresent()){
            System.out.println("Came in");
            Charity charity1 = Oldcharity.get();
            charity1.setAddress(charity.getAddress());
            charity1.setName(charity.getName());
            charity1.setPhoneNo(charity.getPhoneNo());
            charityRepository.save(charity1);
        }else{
            System.out.println("Not Present");
        }
//                orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + charity.getCharityId()));



    }

    @Override
    public List<Charity> getAll() {
        return charityRepository.findAll();
    }
}
