package com.intheeast.fetch;

import java.util.List;

public interface FetchMetadata {	
	String getFetchType();
	List<Object> fetchMetadata();
}