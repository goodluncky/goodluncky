<%@page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>sssssssssssssssssssss</h2>
<h3>message:${mytest}</h3>
${message}
${modelAndView.mytest}
${mytest}
1<%request.getAttribute("mytest");%>1

</body>
</html>
