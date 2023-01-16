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
        <tr>
          <td>1</td>
          <td>${boardBeanList.title}</td>
          <td>${boardBeanList.content}</td>
          <td>${boardBeanList.userName}</td>
          <td>${boardBeanList.date}</td>
        </tr>
      </table>
      <form
        action="/board_prac/list"
        method="post"
      >
        <button class="btn btn-primary">list</button>
      </form>
    </div>
  </body>
</html>
