
<%@ page language="java" contentType="text/html; charset=UTF-8 " 
   pageEncoding="UTF-8" import="java.util.ArrayList" import ="project.modle.program"
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>program</title>
</head>
<body>
    <%
      ArrayList program2 = (ArrayList)request.getAttribute("program");
      out.println("<table border><tr><th>day1</th><th>day2</th><th>day3</th><th>day4</th><th>day5</th><th>day6</th></tr>");
      for(Object obj : program2){
    	  program pro =(program)obj;
    	  String day1=pro.getDay1();
    	  String day2=pro.getDay2();
    	  String day3=pro.getDay3();
    	  String day4=pro.getDay4();
    	  String day5=pro.getDay5();
    	  String day6=pro.getDay6();
    	  out.println("<tr><td>"+day1+"</td><td>"+day2+"</td><td>"+day3+"</td><td>"+day4+"</td><td>"+day5+"</td><td>"+day6+"</td></tr>");
      } 
      out.println("</table>");	  
    
    %>
     
     
</body>
</html>