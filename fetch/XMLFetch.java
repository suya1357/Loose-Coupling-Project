package com.intheeast.fetch;

import java.util.ArrayList;
import java.util.List;

public class XMLFetch implements FetchMetadata {
	
	final String fetchType = "XML";	
	private static XMLFetch instance = null;
	
	
    private XMLFetch() {
    }
    
    
    public static XMLFetch getInstance() {
        
        if (instance == null) {
            instance = new XMLFetch();
        }
        return instance;
    }
	
	@Override
	public String getFetchType() {		
		return this.fetchType;
	}	

	@Override
	public List<Object> fetchMetadata() {
		List<Object> metadata = new ArrayList<>();
		System.out.println("XML Fetching some json data");
        return metadata;
	}
}