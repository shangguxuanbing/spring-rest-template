<html xmlns="http://www.w3.org/1999/xhtml">
	
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<title>Mango Backend</title>
	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	
	<link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/static/css/index.css" />
	

</head>
<body>
	
<div id="wrap">
	<div id="left">
		<h1 id="header">Hello Mango?</h1>
	
		<p>You will be redirected to <span class="other">API docs</span> in <span id="count"></span> seconds</p>	
		
	
	</div>
</div>


<script type="text/javascript">
window.onload=function() {
function countdown() {
if ( typeof countdown.counter == 'undefined' ) {
    countdown.counter = 5; // initial count
    }
if(countdown.counter > 0) {
	document.getElementById('count').innerHTML = countdown.counter--;
    setTimeout(countdown, 3);
    }
else {
    location.href = '/static/swagger-ui/index.html';
    }
}
countdown();
};
</script>

</body>
</html>
