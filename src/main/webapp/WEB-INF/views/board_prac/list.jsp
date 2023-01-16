<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@
taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <div class="container">
      <table class="table table-bordered">
        <tr>
          <td>#</td>
          <td>TITLE</td>
          <td>CONTENT</td>
          <td>NAME</td>
          <td>DATE</td>
        </tr>
        <c:forEach items="${boardBeanList}" var="board" varStatus="status">
          <tr>
            <td>${status.count}</td>
            <td><a href="/board_prac/view?uid=${board.title}">${board.title}</a></td>
            <td>${board.content}</td>
            <td>${board.userName}</td>
            <td>${board.date}</td>
          </tr>
        </c:forEach >
      </table>
      <a href="/board_prac/form"
        ><button class="btn btn-primary">form</button></a
      >
      <a href="/board_prac/view"
      ><button class="btn btn-primary">view</button></a
    >
    </div>
  </body>
</html>
