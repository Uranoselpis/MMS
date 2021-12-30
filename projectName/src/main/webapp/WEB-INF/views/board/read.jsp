<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>게시글 읽기</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

bno : ${vo.bno}<br>
writer : ${vo.writer}<br>
date : ${vo.regdate} | ${vo.updatedate}<br>
viewcnt : ${vo.viewcnt}<br>
title : ${vo.title}<br>
content :<br> 
<textarea rows="10" readonly>${vo.content}</textarea><br>
 
 
 <button class="updateui">수정 화면</button> 
 <button class="delete">삭제</button> 
 <button>목록</button> 
 <button>댓글 화면</button><br>
 
 <form name="fordelete">
 
 </form>

<script type="text/javascript">
	$(document).ready(function() {
		
		$("body").on("click",".updateui", function() {
			location.assign("/board/updateui/${vo.bno}/${curPage}")
		});
			
		$("body").on("click", ".delete", function() {
			$("[name='fordelete']").attr("action", "/board/delete/${vo.bno}/{curPage}");
			$("[name='fordelete']").attr("method", "post");
			$("[name='fordelete']").submit();
		});
		
		$("button").eq(2).click(function() {
			location.assign("/board/list/${curPage}")
		});
		
		
		
	});

</script>

</body>
</html>