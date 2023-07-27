package com.intheeast.export;

import java.io.File;
import java.util.List;

public class CSVExport implements ExportMetadata{
	
	final String exportType = "CSV";	
	private static CSVExport instance = null;
	
	
    private CSVExport() {
    }
    
    
    public static CSVExport getInstance() {
        
        if (instance == null) {
            instance = new CSVExport();
        }
        return instance;
    }
	
	@Override
	public String getExportType() {
		return this.exportType;
	}
	
	@Override
	public File export(List<Object> metadata) {
		System.out.println("CSV Exporting data...");
        // Export Metadata
        File outputCSV = null;
        return outputCSV;
	}
}
