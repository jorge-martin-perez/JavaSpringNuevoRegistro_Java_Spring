<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="${pageContext.request.servletContext.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="${pageContext.request.servletContext.contextPath}/css/newportal.css">

<title>Nuevo registro</title>
</head>

<body class="fondo">

	<div class="container">
		<div class="signup-form-container">

			<div class="form-header">
				<h3 class="registration">
					<i class="fa fa-user"></i>Sistema de gestión de Usuarios
				</h3>
				<br><br>
				<h4 align="center">Alta de nuevo usuario</h4>
			</div>
			<p></p>
			<br><br>
			<div class="form-row">
				<div class="col-1"></div>
				<div class="col-10">
					<div class="form-body">
						<div class="form-group">
							<div>

								<!-- formulario -->
								<form:form action="guardar" method="post"
										   modelAttribute="usuario"
										   class="credentials">

									<label>Nombre:</label>
									<form:input path="nombre"/><br/><br/>

									<label>Apellido:</label>
									<form:input path="apellido"/><br/><br/>

									<label>Usuario:</label>
									<form:input path="user"/><br/><br/>

									<label>Password:</label>
									<form:password path="password"/><br/><br/>

									<label>Email:</label>
									<form:input path="email"/><br/><br/>

									<label>Dirección:</label>
									<form:input path="direccion"/><br/><br/>

									<label>Teléfono:</label>
									<form:input path="telefono"/>
									<button type="submit"
											style="background-color:#14b8a6; color:white; border:none; padding:7px 15px; border-radius:4px; cursor:pointer; font-weight:bold;">
										Guardar
									</button>

								</form:form>

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