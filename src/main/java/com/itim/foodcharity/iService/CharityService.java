package com.itim.foodcharity.iService;

import com.itim.foodcharity.Dto.CharityDto;
import com.itim.foodcharity.Model.Charity;

import java.util.List;

public interface CharityService {
    public Charity Add(CharityDto data);
    public void Delete(String charityId);
    public void Update(CharityDto data);
    public List<Charity> getAll();
}
