package com.tqbao.studentmanagement.Controller;

import com.tqbao.studentmanagement.DAO.CertificateDAO;
import com.tqbao.studentmanagement.Model.Certificate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
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
    public Certificate get(String name) {
        return certificateDAO.read(name);
    }

    public List<Certificate> getAll() {
        return certificateDAO.readAll();
    }
    public ResultSet getAll(JComboBox jComboBox) {
        return certificateDAO.getAll(jComboBox);
    }

    public void update(Certificate certificate) {
        certificateDAO.update(certificate);
    }

    public void delete(int id) {
        certificateDAO.delete(id);
    }

    public void showCertificates(JTable listCertificates, DefaultTableModel dtm) {
        certificateDAO.showCertificates(listCertificates, dtm);
    }
}
