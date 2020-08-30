package com.example.stock.ws.rest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.Dao.ProduitDao;
import com.example.stock.bean.Produit;
import com.example.stock.service.facade.ProduitService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/produite-Api/Produit/")
public class ProduitRest {
    @Autowired
    private ProduitService produitService;

    @GetMapping("findByid/id/{id}")
    public Produit findByid(@PathVariable Long id) {
        return produitService.findByid(id);
    }

    @GetMapping("findByName/name/{name}")
    public Produit findByLibelle(@PathVariable String name) {
        return produitService.findByLibelle(name);
    }

    @GetMapping("findAll")
    public List<Produit> findAll() {
        return produitService.findAll();
    }

    @PostMapping("save")
    public int save(@RequestBody Produit pr) {
        return produitService.save(pr);
    }

    @DeleteMapping("deleteById/id/{id}")
    public int deleteById(@PathVariable Long id) {
        return produitService.deleteById(id);
    }
    @GetMapping("get/{reportFormat}")
    public String exportReport( @PathVariable String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users";
        List<Produit> employees = produitService.findAll();
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:produits.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Bendrimou Ayoub");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\"+"produits"+".html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\"+"produits"+".pdf");
        }

        return "report generated in path : " + path;
    }

}
