package com.tokuda.pmt.service.csv;

import com.tokuda.pmt.entity.api.CsvEntity;

import java.util.List;

public interface CsvReader {
    List<CsvEntity> csvRead (String csvContent);
}
