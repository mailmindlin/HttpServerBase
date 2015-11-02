package com.divisors.projectcuttlefish.httpserver.api;

import java.nio.channels.SeekableByteChannel;

import com.divisors.projectcuttlefish.httpserver.api.response.HttpResponseLine;

public interface HttpResponse {
	HttpResponseLine getResponseLine();
	
	HttpHeader[] getHeaders();
	HttpHeader getHeader(String key);
	boolean addHeader(HttpHeader header);
	boolean addHeader(HttpHeaderValue header);
	boolean addHeader(String key, String...values);
	boolean setHeader(HttpHeader header);
	boolean setHeader(HttpHeaderValue header);
	boolean setHeader(String key, String...values);
	void removeHeader(String key);
	
	SeekableByteChannel getResponseBody();
}
