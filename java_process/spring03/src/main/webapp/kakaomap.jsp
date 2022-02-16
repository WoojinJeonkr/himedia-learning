<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>마커 생성하기</title>
</head>
<body>
<!-- div : 융퉁성 있게 사용할 수 있다. -->
<div id="map" style="width:500px;height:350px;"></div>
<!-- cdn 방식으로 연겷함 -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=d6482af903f95cd1dbfbd65324cd272a"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(37.57191561039663, 126.98580088861675), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

/* kakao.maps.Map라는 폴더 밑에 mapContainer, mapOption가 있음  */
var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

// 마커가 표시될 위치입니다 
var markerPosition  = new kakao.maps.LatLng(37.57191561039663, 126.98580088861675); 

// 마커를 생성합니다
var marker = new kakao.maps.Marker({
    position: markerPosition
});

// 마커가 지도 위에 표시되도록 설정합니다
marker.setMap(map);

// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
// marker.setMap(null);    
</script>
</body>
</html>