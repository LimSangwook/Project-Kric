<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/comm/taglib.jsp"%>

<style>
.sun {color:red !important;}
.sat {color:blue !important;}
</style>

<!-- 일정 게시판 script -->
<script type="text/javascript" src="/assets/script/board.schedule.js"></script>

<script type="text/javascript">
$(function(){
	cal.params.museumNo = "${param.museum_no}";
	cal.params.menuCode = "${param.menu_code}";	
	cal.params.searchYear = "${param.searchYear}";
	cal.params.searchMonth = "${param.searchMonth}";	
	cal.params.boardId = "${boardConfig.board_id}";
	cal.params.linkAddress = "boardView.do";
	cal.init();
});
</script>

<div class="bbs_wrap">
	
	<div id="calenda">
	<!-- 일정게시판 영역 -->
	</div>

</div>