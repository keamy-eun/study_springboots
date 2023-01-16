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
  </head>
  <body>
    <div>jstl Formats - Number</div>
    <c:set var="num_first" value="1234567.89" />
    <div>세자리 구분 : <fmt:formatNumber value="${num_first}" type="number" /></div>
    <div>백분율 : <fmt:formatNumber value="${num_first}" type="percent" /></div>
    <c:set var="num_second" value="0.1234" />
    <div>백분율 :<fmt:formatNumber value="${num_second}" type="percent"/></div>
    
    <hr>
    <div>jstl Formats - Date</div>
    <c:set var="date_first" value="<%= new java.util.Date() %>" />
    <div>basic date 출력 : ${date_first}</div>
    <div>time 출력 : <fmt:formatDate value="${date_first}" type="time"/></div>
    <div>date 출력 : <fmt:formatDate value="${date_first}" type="date" /></div>
    <div>date&time 출력 : <fmt:formatDate value="${date_first}" type="both" /></div>
    
    <hr>
    <div>jstl Formats - Location</div>
    <div>Local lang-code : http://www.lingoes.net/en/translator/langcode.htm </div>
    <c:set var="num_third" value="1234567.89" />
    <c:set var="date_third" value="<%= new java.util.Date() %>" />
    <div> Country : Korea<fmt:setLocale value="ko-KR" scope="session"/></div>
    <div> Currency : <fmt:formatNumber value="${num_third}" type="currency" /></div>
    <div> Date : <fmt:formatDate value="${date_third}" type="both" /></div>

    <div> Country : USA<fmt:setLocale value="en-US" scope="session" /></div>
    <div> Currency : <fmt:formatNumber value="${num_third}" type="currency" /></div>
    <div> Date : <fmt:formatDate value="${date_third}" type="both" /></div>

    <div> Country : JAPAN<fmt:setLocale value="ja-JP" scope="session" /></div>
    <div> Currency : <fmt:formatNumber value="${num_third}" type="currency" /></div>
    <div> Date : <fmt:formatDate value="${date_third}" type="both" /></div>
  </body>
</html>
