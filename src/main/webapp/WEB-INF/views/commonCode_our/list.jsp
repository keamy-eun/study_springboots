<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />

<div class="container">
<form action="/commonCodeOur/form" method="get">
	<button class="btn btn-outline-info">Form</button>
</form>

<table class="table table-striped table-hover table-bordered">
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
		<c:forEach items="${resultMap}" var="resultData" varStatus="loop">
			<tr>
				<td class="text-center"><input type="checkbox" class="checkbox"
					name="COMMONCODE_ID"  /></td>
				<td>
					<form action="/commonCodeOur/edit/${resultData.COMMON_CODE_ID}" method="get">
					<button class="btn btn-link viewPopup">${resultData.COMMON_CODE_ID}</button>
					</form>
				</td>
				<td>${resultData.NAME}</td>
				<td class="text-center">
					<div class="btn-group">
						<button class="btn btn-outline-info"
							name="PARENT_COMMONCODE_ID" >
							${resultData.PARENT_COMMON_CODE_ID}
						</button>
					</div>
				</td>
				<td>
					<form action="/commonCodeOur/delete/${resultData.COMMON_CODE_ID}" method="post">
					<button class="btn btn-outline-info">delete</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
<!-- /.table-responsive -->