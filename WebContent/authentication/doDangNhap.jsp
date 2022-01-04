<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.ArrayList,dao.*,model.*"%>
<%
	String email = (String)request.getParameter("username");
	String password = (String)request.getParameter("password");
	
	NguoiDung nd = new NguoiDung();
	
	nd.setEmail(email);
	nd.setMatkhau(password);
	
	NguoiDungDAO dao = new NguoiDungDAO();
	boolean kq = dao.login(nd);
	
	if(kq){		
		response.sendRedirect("client\\GDTrangChu.jsp");
	}else{
		response.sendRedirect("GDDangNhap.jsp");
	}
%>