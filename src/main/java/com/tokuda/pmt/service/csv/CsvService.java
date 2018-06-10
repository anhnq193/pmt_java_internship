package com.tokuda.pmt.service.csv;

import com.tokuda.pmt.entity.api.CsvEntity;

public interface CsvService {
    void csvAnalyze(String csvContent, int shopId, int supplerId);
    int productEntitySave(CsvEntity csvEntity, int shopId, int supplerId);
    void stockEntitySave(CsvEntity csvEntity, int shopId, int productId);
    void inStockEntitySave(CsvEntity csvEntity, int shopId, int productId);
}
