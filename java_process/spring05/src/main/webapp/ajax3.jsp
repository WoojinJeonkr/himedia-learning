<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rss</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
// data를 명시하지 않고 url로 rss를 실행시키면 신문사 연결 실패가 나온다
$(function() { // dom(document object model) tree
	$('#b1').click(function() {
		$.ajax({
			/* url: "https://rss.hankooki.com/daily/dh_world.xml", */
			url: "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fentertainments%2F%3FoutputType%3Dxml&api_key=53xap3e91hcpwib0ac7gnkd4b1lfqcnoepwd8boo",
			data : {
				url: "https://www.chosun.com/arc/outboundfeeds/rss/category/entertainments/?outputType=xml",
				api_key : "53xap3e91hcpwib0ac7gnkd4b1lfqcnoepwd8boo",
				count : 20
			},
			success: function(result) {
				/* alert('신문사 연결 성공');
				alert('result'); */
				list = result.items;
				/* alert(list.length); */
				$(list).each(function(index, news) {
					/* console.log(index+": "+news.title+", "+news.author); */
					img = news.thumbnail
					console.log(img)
					// title
					title = news.title
					link = news.link
					// title을 클릭했을 때, link 연결(a태그)
					pubDate = news.pubDate
					// 날짜를 title 옆에 보이도록 하기
					// $('#d1').append('<img src=' + img + ' width="200" height="200">'+'<a href='+link+'>'+title+'</a>'+pubDate+'<br>');
					str = '<a href='+ link +'>'+title+pubDate'</a>';
					$('#d1').append('<img src=' + img + ' width="200" height="200">'+str+'<br>');
				});
			},
			error: function() {
				alert('신문사 연결 실패');
			}
		});
	});
});
</script>
</head>
<body>
	<button id="b1">조선일보(연예기사 받아오기)</button>
	<hr color="orange">
	
	<div id="d1"></div>
</body>
</html>