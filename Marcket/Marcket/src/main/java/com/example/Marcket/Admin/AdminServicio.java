package com.example.Marcket.Admin;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServicio {
    private final AdminRepository adminRepo;

    public void createAdmin(Admin admin) {
        adminRepo.save(admin);
    }

    public List<Admin> getAllAdmins() {
        return adminRepo.findAll();
    }

    public Optional<Admin> getAdminById(Integer id) {
        return adminRepo.findById(id);
    }

    public void updateAdmin(Integer id, Admin admin) {
        // Verificamos si el admin existe antes de actualizar
        if (adminRepo.existsById(id)) {
            admin.setId(id); // Aseguramos que el ID del admin sea el correcto
            adminRepo.save(admin); // Guardamos el admin actualizado
        } else {
            throw new RuntimeException("Admin no encontrado para actualizar");
        }
    }

    public void deleteAdmin(Integer id) {
        // Verificamos si el admin existe antes de eliminar
        if (adminRepo.existsById(id)) {
            adminRepo.deleteById(id);
        } else {
            throw new RuntimeException("Admin no encontrado para eliminar");
        }
    }
}