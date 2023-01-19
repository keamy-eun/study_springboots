<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />

  </head>
  <body>
    <div>list - made by JSP</div>
    <div class="container text-center fs-5">USER LIST</div>
        <table class="table">
            <thead>
              <tr class="text-center">
                <th><input type="checkbox" id="selectall" /></th>
                <th>코드 ID</th>
                <th>코드명</th>
                <th>부모 코드 ID</th>
                <th>delete</th>
              </tr>
            </thead>
              <tbody>
                <tr>
                    <td>
                    ${resultData.COMMON_CODE_ID}
                    </td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
              </tbody>
        </table>
      <form action="/board/form" method="get">
        <div class="mt-3">
            <button type="submit" class="btn btn-primary">Form</button>
        </div>
      </form>
  </body>
</html>
