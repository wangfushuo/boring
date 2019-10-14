<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>

</head>
<body>
    <table>
    <c:forEach items="${list }" var="goods">
          <tr>
              <td>${goods.id }</td>
              <td>${goods.name }</td>
              <td>${goods.price}</td>
              <td>${goods.count }</td>

          </tr>
        
          
     </c:forEach>  
    
    </table>



</body>
</html>