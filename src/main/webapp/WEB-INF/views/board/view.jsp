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
  <html lang="en">
  <body>
    <div class="container text-center fs-5">VIEW PAGE</div>
      <table class="table table-bordered">
        <tr>
          <td>Title</td>
          <td>Content</td>
          <td>Name</td>
          <td>Date</td>
          <td></td>
        </tr>
        <tr>
          <td>Metrix</td>
          <td>fake reality</td>
          <td>Neo</td>
          <td>1999-01-01</td>
          <td>
      <form action="/board/edit" method="get">
      <div>
        <div>
          <button type="submit" class="btn btn-primary">EDIT</button>
        </div>
      </div>
    </form>
    </td>
        </tr>
      </table>

    <form action="/board/list" method="post">
      <div>
        <div>
          <button type="submit" class="btn btn-primary">LIST</button>
        </div>
      </div>
    </form>
  </body>
</html>
