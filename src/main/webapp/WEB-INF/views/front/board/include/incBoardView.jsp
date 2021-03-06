<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/comm/taglib.jsp"%>

<script>
$(function(){
	// 데이터 삭제시
	$('.btnDelete').on('click',function(){
		if(confirm('정말로 삭제하시겠습니까?')){
			$('#deleteForm').submit();
		}
	});
});
</script>
                
<div class="bbs_wrap">
	<div class="bbs_view">
		<div class="title">
			<h4><c:out value="${result.title }"/></h4>
			<div class="author">
				<span class="writer">작성자 : <c:out value="${result.reg_name }"/></span>
				<span class="date">작성일 : <fmt:formatDate value="${result.reg_date}" type="date" pattern="yyyy-MM-dd"/></span>
				<c:if test="${boardConfig.board_type eq 'schedule'}">
				<span class="date">기간 : <c:out value="${result.start_day}"/> ~ <c:out value="${result.end_day}"/></span>
				</c:if>
				<span class="hit">조회수 : <fmt:formatNumber value="${result.read_cnt }"/></span>
			</div>
		</div>
		<c:if test="${boardConfig.file_count_limit > 0}">
		<div class="file_wrap">
			<span class="ico ico_file">첨부파일</span> 첨부파일 : 
			<c:forEach var="data" items="${fileList}" varStatus="i">
			<c:set var="downLoadLink" value="${siteDomain}/downLoad.do?file_key=${data.file_key}&save_file_name=${data.save_file_name}"/>
			<c:if test="${i.index > 0 }">,&nbsp;&nbsp;</c:if>
			<a href="${downLoadLink}"><c:out value="${data.real_file_name}"/> (<c:out value="${util:convertFileSize(data.file_size) }"/>)</a>
			</c:forEach>
		</div><!-- //file_wrap -->
		</c:if>
		<div class="context">
			<c:out value="${result.content}" escapeXml="false"/>
		</div>
	</div><!-- //bbs_view -->

	<div class="btn_wrap text_right">
		<c:if test="${result.reg_id eq GLOBAL_USER_ID || GLOBAL_USER_AUTH == 9}">
		<a href="#" class="btn btn_basic btnDelete">삭제</a>
		<a href="boardForm.do?board_key=${result.board_key}<c:out value="${defaultParameter}"/>" class="btn btn_basic primary">수정</a>
		</c:if>
		<a href="boardList.do?page=${theForm.page}<c:out value="${defaultParameter}"/>" class="btn btn_basic">목록</a>
	</div>

</div>

 