
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>danh sách khách hàng</title>
  <style>
    table{
      margin: 0 auto ;
      text-align: center;
    }
    img{
      width: 100px ;
      height: 70px ;
    }
  </style>

</head>
<body>

<table border="1">
  <tr>
    <th colspan="4">Danh Sách Khách Hàng</th> </tr>
  <tr>
    <th>Tên</th>
    <th>Ngày Sinh</th>
    <th>Địa Chỉ</th>
    <th>Ảnh</th>
  </tr>

  <c:forEach var="i" items="${list}">
    <tr>
      <td>
        ${i.name}
      </td>
      
      <td>
        ${i.dateOffBirth}
    </td>
      <td>
       ${i.address}
      </td>
      <td>
        <img src="${i.picture}">
      </td>
    </tr>

  </c:forEach>

</table>
</body>
</html>