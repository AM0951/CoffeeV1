<%-- 
    Document   : result
    Created on : Oct 25, 2014, 8:25:15 PM
    Author     : Legatodie_2
--%>

<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Coffee Recommandation JSP View</h1>
<p>

<%
  List styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
    out.print("<br>try: " + it.next());
  }
%>
</p>
</body>
</html>
