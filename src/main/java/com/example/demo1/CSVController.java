package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CSVController {

    @Autowired
    private CSVService csvService;

    @GetMapping("/view-csv")
    public String viewCSV(Model model) {
        List<CSVRow> csvData = csvService.readCSV();
        model.addAttribute("csvData", csvData);
        return "viewCSV";
    }

    @GetMapping("/generate-pdf")
    public String generatePdf() {
        List<CSVRow> csvData = csvService.readCSV();
        csvService.generatePdf(csvData);
        return "viewCSV";
    }
}





