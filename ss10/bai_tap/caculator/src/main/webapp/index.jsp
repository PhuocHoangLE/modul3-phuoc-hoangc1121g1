<%--
  Created by IntelliJ IDEA.
  User: Lê Phước Hoàng
  Date: 3/11/2022
  Time: 1:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form method="post" action="/calculate">
    <fieldset>
    <legend>Calcutor</legend>
    <table>
      <tr>
        <td>First operand: </td>
        <td>
          <input name="firt-operand" type="text">
        </td>
      </tr>
      <tr>
        <td>Operator: </td>
        <td>
          <select name="operator">
            <option value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>Second operand: </td>
        <td>
          <input name="second-operand" type="text">
        </td>
      </tr>
      <tr>
        <td></td>
        <td>
          <input type="submit" value="Calculator">
        </td>
      </tr>
    </table>
    </fieldset>
  </form>
  </body>
</html>
