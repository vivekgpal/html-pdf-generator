package com.example.demo1;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;



import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CSVService {

    private static final String SAMPLE_CSV_FILE_PATH = "src/main/resources/sip_reg_summary_sample.csv";
    private static final String OUTPUT_PDF_FILE_PATH = "output.pdf";

    @Autowired
    private TemplateEngine templateEngine;

    public List<CSVRow> readCSV() {
        List<CSVRow> records = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(SAMPLE_CSV_FILE_PATH))) {
            List<String[]> allData = csvReader.readAll();
            for (int i = 1; i < allData.size(); i++) {
                String[] row = allData.get(i);
                CSVRow record = new CSVRow(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10]);
                records.add(record);
                System.out.println(record);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return records;
    }

    public void generatePdf(List<CSVRow> csvData) {
        // Generate HTML
        Context context = new Context();
        context.setVariable("csvData", csvData);
        System.out.println("this is csvData "+csvData);
        String htmlContent = templateEngine.process("viewCSV", context);

        // Convert HTML to PDF and write to file
        try (FileOutputStream outputStream = new FileOutputStream(OUTPUT_PDF_FILE_PATH)) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.withHtmlContent(htmlContent, null);
            builder.toStream(outputStream);
            builder.run();
        } catch (Exception e) {
            throw new RuntimeException("PDF generation failed", e);
        }
    }
    public void generatePdfAtStartup(){
        List<CSVRow> csvData = readCSV();
        generatePdf(csvData);
    }
}




