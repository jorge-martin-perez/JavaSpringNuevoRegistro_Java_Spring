<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="${pageContext.request.servletContext.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- CSS -->
<link rel="stylesheet" href="${pageContext.request.servletContext.contextPath}/css/newportal.css">

<title>Datos del usuario</title>
</head>

<body class="fondo">

	<div class="container">
		<div class="signup-form-container">

			<div class="form-header">
				<h3 class="registration">
					<i class="fa fa-user"></i>Sistema de gestión de Usuarios
				</h3>
				<br><br>
				<h4 align="center">¡¡Usuario dado de alta correctamente!!</h4>
			</div>
			<p></p>
			<br><br>
			<div class="form-row">
				<div class="col-10">
					<div class="form-body">
						<div class="form-group">
							<div>
								<form role="form" id="datos-usuario" autocomplete="off" class="credentials">
									<div class="input-group">
 										 Nombre: ${usuario.nombre} ${usuario.apellido}
 									</div>
									<div class="input-group">
 										 Email: ${usuario.email}
 									</div>
									<div class="input-group">
  										 Dirección: ${usuario.direccion}
 								</div>
									<div class="input-group">
 										 Teléfono: ${usuario.telefono}
 									</div>
								</form>
							</div>

						</div>
					</div>
				</div>

				<div class="col-1"></div>
			</div>

		</div>
	</div>

</body>
</html>
