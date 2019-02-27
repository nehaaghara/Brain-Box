<%-- 
    Document   : welcome
    Created on : Feb 6, 2019, 5:45:50 PM
    Author     : ITMCS-Java
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.brainbox.model.UserTable"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{
                border: 2px dotted red;
                text-align: center;
            }
            tr td {
                margin: 5px;
                padding: 5px;
                border: 2px solid black;
            }
        </style>
    </head>
    <body>
        <h1>WELCOME YOU ARE LOGIN IN  ACCOUNT</h1>
        
        <% List<UserTable> lst=(List<UserTable>)request.getAttribute("data"); %>
        <table>
            <th>Username</th>
            <th>Password</th>
            <tr>
                <%
                for (int i=0;i <lst.size() ;i++)
                {%>
                <td><%= lst.get(i).getUsername() %></td>
                <td><%= lst.get(i).getPassword()%></td>
                <%}
                
                %>
            </tr>
            
            
        </table>
        
    </body>
</html>
