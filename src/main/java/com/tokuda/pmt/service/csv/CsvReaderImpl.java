package com.tokuda.pmt.service.csv;

import com.tokuda.pmt.entity.api.CsvEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class CsvReaderImpl implements CsvReader {

    @Override
    public List<CsvEntity> csvRead(String csvContent){
        List<CsvEntity> csvEntityList = new ArrayList<>();
        String[] csvRows = csvContent.split("\n");
        Arrays.asList(csvRows).forEach(csvRow -> {
            String[] csvData = csvRow.split(",");
            CsvEntity csvEntity = new CsvEntity();
            csvEntity.setProductCode(csvData[0]);
            csvEntity.setType(Integer.parseInt(csvData[1]));
            csvEntity.setMakerId(Integer.parseInt(csvData[2]));
            csvEntity.setProductName(csvData[3]);
            csvEntity.setColorId(Integer.parseInt(csvData[4]));
            csvEntity.setSizeId(Integer.parseInt(csvData[5]));
            csvEntity.setNote(csvData[6]);
            csvEntity.setStockPrice(Integer.parseInt(csvData[7]));
            csvEntity.setNotaxPrice(Integer.parseInt(csvData[8]));
            csvEntity.setTaxPrice(Integer.parseInt(csvData[9]));
            csvEntity.setMemberPrice(Integer.parseInt(csvData[10]));
            csvEntity.setAvailableNumber(Integer.parseInt(csvData[11]));
        });
        return csvEntityList;
    }
}
