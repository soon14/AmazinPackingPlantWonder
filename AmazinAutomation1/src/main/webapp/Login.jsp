
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Gentelella Alela! |</title>

<!-- Bootstrap -->
<link
	href="<c:url value="/resources/vendors/bootstrap/dist/css/bootstrap.min.css"/>"
	rel="stylesheet">
<!-- Font Awesome -->
<link
	href="<c:url value="/resources/vendors/font-awesome/css/font-awesome.min.css"/>"
	rel="stylesheet">
<!-- NProgress -->
<link href="<c:url value="/resources/vendors/nprogress/nprogress.css"/>"
	rel="stylesheet">
<!-- Animate.css -->
<link
	href="<c:url value="/resources/vendors/animate.css/animate.min.css"/>"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link href="<c:url value="/resources/build/css/custom.min.css"/>"
	rel="stylesheet">
</head>

<body class="login">
	<div>
		<a class="hiddenanchor" id="signup"></a> <a class="hiddenanchor"
			id="signin"></a>

		<div class="login_wrapper">
			<div class="animate form login_form">
				<section class="login_content">


					<form name="f" action="login" method="POST">
						<img src="resources/images/plant_logo.png" style="width: 200px;">
						<br> <br>
						<div>
							<input type="text" id="username" name="j_username"
								class="form-control" placeholder="Username" required="" />
						</div>
						<div>
							<input type="password" id="password" name="j_password"
								class="form-control" placeholder="Password" required="" />
						</div>
						<div>
							<button type="submit" name="LogIn" class="btn btn-default submit">LogIn</button>
						</div>

						<div class="clearfix"></div>

						<div class="separator">
							<br>
							<div>
								<a href="http://amzbizsol.in/"><img
									src="resources/images/amazin.png"></a>
								<p>© 2017 Amazin Automation. All Rights Reserved.</p>
							</div>
						</div>
					</form>
				</section>
			</div>
		</div>
	</div>
	<!-- Dialog box for information -->

	<div id="dialog" title="Information Message">
		<p>
			<span class="ui-icon ui-icon-circle-check"
				style="float: left; margin: 0 7px 50px 0;"></span>
		<div id="msg"></div>
		</p>

	</div>


	<!-- Dialog box for information  ends here -->

	<script>
		bootstrap_alert = function() {
		}
		bootstrap_alert.warning = function(message, alert, timeout) {
			$(
					'<div id="floating_alert" class="alert alert-' + alert + '  col-md-4 fade in"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button><b>'
							+ message + '</b>&nbsp;&nbsp;</div>').appendTo(
					'body');

			/*  setTimeout(function () {
			 	$(".alert").alert('close');
			 }, timeout); */

			$("#floating_alert").fadeTo(2000, 500).slideUp(500, function() {
				$("#floating_alert").slideUp(500);
			});

		}
		function alertbox(message, type) {
			$("#floating_alert").remove();
			bootstrap_alert.warning(message, type);

		}
	</script>

</body>

</html>