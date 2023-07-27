package com.intheeast.lc;

import com.intheeast.collector.CSVMetadataCollector;
import com.intheeast.collector.MetadataCollector;
import com.intheeast.collector.PDFMetadataCollector;
import com.intheeast.export.CSVExport;
import com.intheeast.export.ExportMetadata;
import com.intheeast.export.PDFExport;
import com.intheeast.fetch.FetchMetadata;
import com.intheeast.fetch.JSONFetch;
import com.intheeast.fetch.XMLFetch;

public class Program {
	
	public static void setMetadataCollector(MetadataCollector mdcollector,
			FetchMetadata fetchMetadata, 
			ExportMetadata exportMetadata) {
		mdcollector.setMetadataCollector(fetchMetadata, exportMetadata);
	}
	
	public static void collectMetadata(MetadataCollector mdcollector) {
		mdcollector.collectMetadata();
	}

	public static void print(MetadataCollector mdcollector) {
		mdcollector.print();
	}

	public static void main(String[] args) {
		FetchMetadata fetchMetadata1 = JSONFetch.getInstance();
		ExportMetadata exportMetadata1 = PDFExport.getInstance();
		
		MetadataCollector mdcollector1 = new PDFMetadataCollector();
		setMetadataCollector(mdcollector1, fetchMetadata1, exportMetadata1);
		collectMetadata(mdcollector1);
		print(mdcollector1);
		
		
		FetchMetadata fetchMetadata2 = XMLFetch.getInstance();
		ExportMetadata exportMetadata2 = CSVExport.getInstance();
		
		MetadataCollector mdcollector2 = new CSVMetadataCollector();
		setMetadataCollector(mdcollector2, fetchMetadata2, exportMetadata2);
		collectMetadata(mdcollector2);
		print(mdcollector2);
//		mdcollector.setMetadataCollector(fetchMetadata, exportMetadata);
//		mdcollector.collectMetadata();
//		mdcollector.print();
	}
}
