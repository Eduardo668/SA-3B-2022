package br.com.polus.adminService;

import br.com.polus.models.AdminUser;

import java.util.List;

public interface AdminService {
    public AdminUser saveAdm(AdminUser adminUser);
    public List<AdminUser> findAll();
}

