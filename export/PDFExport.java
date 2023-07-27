package com.intheeast.export;

import java.io.File;
import java.util.List;

public class PDFExport implements ExportMetadata {
	
	final String exportType = "PDF";
	
	private static PDFExport instance = null;
	
	// �����ڸ� private�� �����Ͽ� �ܺο��� �ν��Ͻ��� ������ �� ������ �մϴ�.
    private PDFExport() {
    }
    
    // �ܺο��� �ν��Ͻ��� ������ �� �ִ� ���� �޼ҵ带 �߰��մϴ�.
    public static PDFExport getInstance() {
        // �ν��Ͻ��� �����Ǿ� ���� ���� ��쿡�� �ν��Ͻ��� �����մϴ�.
        if (instance == null) {
            instance = new PDFExport();
        }
        return instance;
    }
	
	@Override
	public String getExportType() {
		return this.exportType;
	}

	@Override
	public File export(List<Object> metadata) {
		System.out.println("PDF Exporting data...");
        // Export Metadata
        File outputCSV = null;
        return outputCSV;
	}
}