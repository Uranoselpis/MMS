<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<nav aria-label="Page navigation example">
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="/board/list/${pt.curPage > 1 ? pt.curPage-1:1}">
       <span aria-hidden="true"> &laquo;</a></span>
    </li>
    
    <c:forEach begin="${pt.beginPageNum}" end="${pt.endPageNum}" var="i">
    <li class="page-item ${i==pt.curPage?'active':''}">
    <a class="page-link" href="/board/list/${i}">${i}</a></li>
    </c:forEach>

    <li class="page-item">
      <a class="page-link" href="/board/list/${pt.curPage<pt.totalPage?pt.curPage+1:pt.totalPage}">
        &raquo;</a>
    </li>
  </ul>
</nav>