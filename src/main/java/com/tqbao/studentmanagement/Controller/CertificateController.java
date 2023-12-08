package com.tqbao.studentmanagement.Controller;

import com.tqbao.studentmanagement.DAO.CertificateDAO;
import com.tqbao.studentmanagement.Model.Certificate;

import java.util.List;

public class CertificateController {
    private CertificateDAO certificateDAO;
    public CertificateController() {
        certificateDAO = new CertificateDAO();
    }

    public void add(Certificate certificate) {
        certificateDAO.add(certificate);
    }

    public Certificate get(int id) {
        return certificateDAO.read(id);
    }

    public List<Certificate> getAll() {
        return certificateDAO.readAll();
    }

    public void update(Certificate certificate) {
        certificateDAO.update(certificate);
    }

    public void delete(int id) {
        certificateDAO.delete(id);
    }
}
