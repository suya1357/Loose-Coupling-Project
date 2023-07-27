package com.intheeast.collector;

import com.intheeast.export.ExportMetadata;
import com.intheeast.fetch.FetchMetadata;

public interface MetadataCollector {
	public void setMetadataCollector(FetchMetadata fetchMetadata, ExportMetadata exportMetadata);
	public void collectMetadata();
	public void print();
}
