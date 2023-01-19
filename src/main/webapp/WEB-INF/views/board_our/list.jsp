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
    <div>
    <% String firstWithRequest = (String)request.getAttribute("firstString"); %>
      <div>With Request.getAttribute : <%= firstWithRequest %></div>
    </div>

    <div>
      <div>With Get Value on Spring : ${firstString}, ${boardList}</div>
    </div>
<%-- firstWithReqeust를 사용하려면 ${firstString},  --%>
    <hr>
    <div class="badge bg-info fs-5">jstl if</div>
    <%-- <@ if(){} @>    if문에 else는 없기때문에 else기능은 choose로 사용--%>
    <c:if test="${firstString eq 'firstValue'}"> 
      <h5>Matching : firstString eq 'firstValue'</h5>
    </c:if >
    <c:set var="firstString" value="good" />
    <c:if test="${firstString ne 'firstValue'}">
      <h5>Not Matching : String eq 'good'</h5>
    </c:if >
    <c:set var="num_first" value="5" />
    <c:if test="${num_first gt 4}">
      <h5>Greater than 5 : num_first > 5</h5>
    </c:if >

    <hr>
    <div class="badge bg-info fs-5">jstl switch</div>
    <c:choose>
      <c:when test="${num_first eq 3}">
        <h5>3 이다</h5>
      </c:when >
      <c:when test="${num_first eq 5}">
        <h5>5 이다</h5>
      </c:when >
      <c:otherwise >
        <h5>3과 5가 아니다</h5>
      </c:otherwise >
    </c:choose>

    <hr>
    <div class="badge bg-info fs-5">jstl for</div>
    <%-- for(BoardBean board : boardList){} --%>
    <c:forEach items="${boardList}" var="board" varStatus="status">
      <h5>${board.title} ${board.userName} ${status.count}, ${status.index}, ${status.first}. ${status.last}</h5>
    </c:forEach>

<%-- ${}를 사용할 땐 <% %> JSP문법과 섞이지 않고
      위의 firstWithRequest와 같이 선언하지도 않는다.--%>
    <div>
      <div>With Get Value on Spring Array : ${membersList.get(0).getTitle()}</div>
      <div>With Get Value on Spring Array : ${membersList.get(0).title}</div>
    </div>
    
    <%-- <div>
    <% for(int i=0; i<membersList.size(); i++){%>
      <div>With Get Value on Spring Array : ${membersList.get(i).title}</div>
      <% } %>
    </div> --%>
    <%--  위 문법이 작동하지 않는 이유는? --%>

    <form action="/board_our/list" method="post">
        <table class="table">
            <thead>
                <tr>
                    <th scope=>#</th>
                    <th scope=class="">Title</th>
                    <th scope=class="">Title with Path</th>
                    <th scope=class="">Title to NoticeController</th>
                    <th scope=>user name</th>
                    <th scope=>date</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope=>1</th>
                    <td><a href="/board_our/view?uid=Hello">Hello</a></td>
                    <td><a href="/board_our/view/Hello">Hello</a></td>
                    <td><a href="/notice/edit/Hello">Hello</a></td>
                    <td>Mark</td>
                    <td>22.11.11</td>
                </tr>
                <tr>
                    <th scope=>2</th>
                    <td><a href="/board_our/view?uid=Otto">Otto</a></td>
                    <td><a href="/board_our/view/Otto">Otto</a></td>
                    <td><a href="/notice/edit/Otto">Otto</a></td>
                    <td>Mark</td>
                    <td>22.11.11</td>
                </tr>
                <tr>
                    <th scope=>3</th>
                    <td><a href="/board_our/view?uid=Jasco">Jasco</a></td>
                    <td><a href="/board_our/view/Jasco">Jasco</a></td>
                    <td><a href="/notice/edit/Jasco">Jasco</a></td>
                    <td>Mark</td>
                    <td>22.11.11</td>
                </tr>
            </tbody>
        </table>
    </form>
      <a href="/board_our/form">form</a>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>