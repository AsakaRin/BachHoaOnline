<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.ArrayList,dao.*,model.*"%>
<%
	String username = (String)request.getParameter("username");
	String password = (String)request.getParameter("password");
	String hovaten = (String)request.getParameter("name");
	
	NguoiDung nd = new NguoiDung();
	
	nd.setEmail(username);
	nd.setMatkhau(password);
	nd.setHovaten(hovaten);
	
	NguoiDungDAO dao = new KhachHangDAO();
	boolean kq = dao.register(nd);
	
	if(kq){		
		response.sendRedirect("client\\GDTrangChu.jsp");
	}else{
		response.sendRedirect("GDDangNhap.jsp");
	}
%>