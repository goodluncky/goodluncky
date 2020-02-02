package com.hrm.company.controller;

import com.hrm.common.entity.Result;
import com.hrm.common.entity.ResultCode;
import com.hrm.company.service.CompanyService;
import com.hrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @RequestMapping(value = "",method = RequestMethod.POST)
    public Result save(@RequestBody Company company){
        companyService.add(company);
        return new Result(ResultCode.SUCCESS);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value = "id") String id,@RequestBody Company company){
        //业务操作
        company.setId(id);
        companyService.update(company);
        return new Result(ResultCode.SUCCESS);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value = "id") String id){
        companyService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }
    @RequestMapping(value = "{/{id}}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value = "id") String id){
        Company company = companyService.findById(id);
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(company);
        return result;
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Result findAll(){
        List<Company> all = companyService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(all);
        return result;
    }
}
