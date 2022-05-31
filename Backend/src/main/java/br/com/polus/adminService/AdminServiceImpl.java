package br.com.polus.adminService;

import br.com.polus.models.AdminUser;
import br.com.polus.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;


    @Override
    public AdminUser saveAdm(AdminUser adm_name) {
        return adminRepository.save(adm_name);
    }
}


