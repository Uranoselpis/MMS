<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<form action="/item/update" method="post">
제품 ID: <input name="itemid" value="${vo.itemid}"><br>
저품 명: <input name="itemname" value="${vo.itemname}"><br>
제품 가격: <input name="itemprice" value="${vo.itemprice}"><br>
제품 수량: <input name="itemcount" value="${vo.itemcount}"><br>
판매자: <input name="userid" value="${vo.userid}"><br>
<input type="submit" value="수정 완료">
</form>

<script type="text/javascript">
 $(document).ready(function() {
	$("input[type='submit']").click(function(event) {
		event.preventDefault();
		
		var price = $("[name='itemprice']").val();
		if (price == '') {
			return;
		}
		
	});
});

</script>
</body>
</html>