package com.tokuda.pmt.controller;

import com.tokuda.pmt.entity.api.ApiEntity;
import com.tokuda.pmt.service.csv.CsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.Charset;

@Controller
@RequestMapping("/api/v1/csv")
public class CsvApiController {

    private final CsvService csvService;

    @Autowired
    public CsvApiController(CsvService csvService) {
        this.csvService = csvService;
    }

//    @PostMapping
//    public ResponseEntity<ApiEntity> csvLoad(RequestEntity<MultipartFile> fileRequestEntity){
//        MultipartFile file = fileRequestEntity.getBody();
//        if (file.isEmpty()){
//            return ResponseEntity.badRequest().body(new ApiEntity("no content","File is no content"));
//        }
//        try{
//            String csvContent = new String(file.getBytes(), Charset.forName("utf-8"));
//            csvService.csvAnalyze(csvContent, 1,1);
//        }catch (NumberFormatException e){
//            return ResponseEntity.badRequest().body(new ApiEntity("file format error","File format is not standard"));
//        }catch (IOException e){
//            return ResponseEntity.badRequest().body(new ApiEntity("file content error","File content is error"));
//        }
//        return ResponseEntity.ok(new ApiEntity("ok","File is upload and add to db successfully"));
//    }

    @PostMapping
    public ResponseEntity<ApiEntity> csvLoad(@RequestParam("csvFile")MultipartFile file, @RequestParam("supplierId") int supplierID){
        if (file.isEmpty()){
            return ResponseEntity.badRequest().body(new ApiEntity("error","File is no content"));
        }
        try{
            String csvContent = new String(file.getBytes(), Charset.forName("utf-8"));
            csvService.csvAnalyze(csvContent, 1, supplierID);
        }catch (NumberFormatException e){
            return ResponseEntity.badRequest().body(new ApiEntity("error","File format is not standard"));
        }catch (IOException e){
            return ResponseEntity.badRequest().body(new ApiEntity("error","File content is error"));
        }
        return ResponseEntity.ok(new ApiEntity("ok","File is upload and add to db successfully"));
    }

}
