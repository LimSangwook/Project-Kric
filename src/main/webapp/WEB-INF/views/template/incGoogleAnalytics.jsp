<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/comm/taglib.jsp"%>

<c:set var="GLOBAL_SITE_DOMAIN">
<spring:eval expression="@config['SITE.DOMAIN']"/>
</c:set>

<c:if test="${GLOBAL_SITE_DOMAIN eq 'http://ywmuseum.com'}">
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-93102511-1', 'auto');
  ga('send', 'pageview');
</script>
</c:if>