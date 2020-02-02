package com.hrm.company.service;

import com.hrm.common.utils.IdWorker;
import com.hrm.company.dao.CompanyDao;
import com.hrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private IdWorker idWorker;
    /**
     * 保存企业
     */
    public void add(Company company){
        String id = idWorker.nextId()+"";
        company.setId(id);
        company.setAuditState("0");//0:未审核，1.已审核
    }

    /**
     * 更新企业
     */
    public void update(Company company){
        Company temp = companyDao.findById(company.getId()).get();
        temp.setName(company.getName());
        temp.setCompanyPhone(company.getCompanyPhone());
        companyDao.save(temp);
    }

    /**
     * 删除企业
     */
    public void deleteById(String id){
        companyDao.deleteById(id);
    }
    /**
     * 根据id查询企业
     */
    public Company findById(String id){
        return companyDao.findById(id).get();
    }
    /**
     * 查询企业列表
     */
    public List<Company> findAll(){
        return companyDao.findAll();
    }
}
