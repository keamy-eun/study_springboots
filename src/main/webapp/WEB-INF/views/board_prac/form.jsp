<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
      <form action="/board_prac/list" method="post">
        <div>TITLE : <input type="text" name="" id="title"></div>
        <div>CONTENT : <input type="text" name="" id="content"></div>
        <div>NAME :<input type="text" name="" id="userName"></div>
        <div>DATE : <input type="text" name="" id="date"></div>
        <button type="submit" class="btn btn-primary">summit</button>
      </form>
    <form>
    </body>
</html>