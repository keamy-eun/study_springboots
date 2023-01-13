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
<div class="container">
        ${boardBean}
        <table class="table">
            <thead>
                <tr>
                    <th class="col-1" scope=>Title</th>
                    <td class="col-6">Hello : ${boardBean.title} </td>
                    <th>user name </th>
                    <td>Mark : ${boardBean.userName}</td>
                    <th>date</th>
                    <td>22.11.11</td>
                </tr>
            </thead>
            <tbody>
                <td colspan=6>${boardBean.content}</td>
            </tbody>
        </table>
        <div>
            <form action="/board_our/list">
                <button>go list</button>
            </form>
            <form action="/board_our/edit" method="post">
                <button>edit</button>
            </form>
        </div>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
