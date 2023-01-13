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
      <div class="container text-center fs-5">USER LIST</div>
              <table class="table">
            <thead>
                <tr>
                    <th scope=>#</th>
                    <th scope=class="col-9">Title</th>
                    <th scope=>user name</th>
                    <th scope=>date</th>
                </tr>
            </thead>
            <tbody>
              <c:forEach items="${boardBean}" var="board" varStatus="status">
                <tr>
                  <th scope=>${status.count}</th>
                  <td><a href="/board/view?uid=Mark">${board.title}</a></td>
                  <td>${board.content}1</td>
                  <td>${board.userName}2</td>
                  <td>${board.date}3</td>
                </tr>
              </c:forEach>
              <%-- <tr>
                  <th scope=>1</th>
                  <td><a href="/board/view?uid=Mark">Mark</a></td>
                  <td>${boardBean.get(0).content}</td>
                  <td>@mdo</td>
                  <td>22.11.11</td>
              </tr>
              <tr>
                  <th scope=>2</th>
                  <td><a href="/board/view?uid=Jacob">Jacob</a></td>
                  <td>${boardBean.get(1).content}</td>
                  <td>@fat</td>
                  <td>22.11.11</td>
              </tr>
              <tr>
                  <th scope=>3</th>
                  <td><a href="/board/view?uid=Larry">Larry</a></td>
                  <td>Bird</td>
                  <td>@twitter</td>
                  <td>22.11.11</td>
              </tr> --%>
            </tbody>
        </table>
      <form action="/board/form" method="get">
        <div class="mt-3">
            <button type="submit" class="btn btn-primary">Form</button>
        </div>
      </form>
    </body>
  </html>
</html>
