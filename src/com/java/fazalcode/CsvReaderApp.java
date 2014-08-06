package com.java.fazalcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.fazalcode.bean.Customer;

import au.com.bytecode.opencsv.CSVReader;

@WebServlet("/csv")
public class CsvReaderApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			 response.setContentType("text/html");
			 PrintWriter out=response.getWriter();
			 
			 
			 InputStream fis= Thread.currentThread().getContextClassLoader().getResourceAsStream("customer.csv");
			 
			 BufferedReader br= new BufferedReader(new InputStreamReader(fis));
			 CSVReader reader= new CSVReader(br,'|');
			 
			 String[] row=null;
			 List<Customer> cuslist= new ArrayList<Customer>();
			 
			 while((row=reader.readNext())!=null){
				 Customer customer=new Customer();
				 customer.setCustomerid(row[0]);
				 customer.setCustomername(row[1]);
				 customer.setEmail(row[2]);
				 customer.setPhone(row[3]);
				 customer.setCity(row[4]);
				 
				 cuslist.add(customer);
			 }
			
			 request.getSession().setAttribute("customer",cuslist);
			 request.getRequestDispatcher("/listingcustomers.jsp").forward(request,response);
			 
			 
		} catch (Exception e) {
			
		}
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
