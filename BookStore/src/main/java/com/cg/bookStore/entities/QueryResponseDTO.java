package com.cg.bookStore.entities;

import java.util.List;

public class QueryResponseDTO {

	private List<CustomerInformation> list;
	 private int totalNoOfPages;
	 private int currentPageNumber;
	public List<CustomerInformation> getList() {
		return list;
	}
	public void setList(List<CustomerInformation> list) {
		this.list = list;
	}
	public int getTotalNoOfPages() {
		return totalNoOfPages;
	}
	public void setTotalNoOfPages(int totalNoOfPages) {
		this.totalNoOfPages = totalNoOfPages;
	}
	public int getCurrentPageNumber() {
		return currentPageNumber;
	}
	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}
	 
}
