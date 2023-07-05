<!doctype html>
<html lang="en">
<head>
	<%@include file="component/allcss.jsp" %>
</head>
<body>

<jsp:include page="component/header.jsp"></jsp:include>

<jsp:include page="component/navbar.jsp"></jsp:include>


	<div class="container">

		<div class="my-3 p-3 bg-body rounded shadow-sm">
			<h5 class="border-bottom pb-2 mb-0">Asistencia Docente</h5>
			<div class="container">

				<div class="my-3 p-3 bg-body rounded shadow-sm">
					<h5 class="border-bottom pb-2 mb-0">Docentes</h5>
					<div class="row mt-3">
						<div class="col-md-6">
							<div class="input-group mb-3">
								<span class="input-group-text" id="basic-addon1"><i
									class='bx bx-search-alt-2'></i></span> <input type="search"
									class="form-control" placeholder="Buscar..."
									id="idBuscarProfesor">
							</div>
						</div>
						<div class="col">
							<div class="dropdown">
								<button class="btn btn-secondary dropdown-toggle" type="button"
									id="dropdownMenuButton1" data-bs-toggle="dropdown"
									aria-expanded="false">Turno</button>
								<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
									<li><a class="dropdown-item" href="#" id="mañana">Mañana</a></li>
									<li><a class="dropdown-item" href="#" id="tarde">Tarde</a></li>
								</ul>
							</div>
						</div>

						<div class="col input-group-sm">
							<label for="frmFechaNacimiento" class="form-label">Fecha:</label>
							<input type="date" class="form-control" id="frmFechaNacimiento">
						</div>

						<div class="col">
							<div class="dropdown">
								<button class="btn btn-secondary dropdown-toggle" type="button"
									id="dropdownMenuButton1" data-bs-toggle="dropdown"
									aria-expanded="false">Exportar</button>
								<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
									<li><a class="dropdown-item" href="#" id="descargarPDF">Pdf</a></li>
									<li><a class="dropdown-item" href="#" id="descargarEXCEL">Excel</a></li>
									<li><a class="dropdown-item" href="#" id="descargarCSV">Csv</a></li>
								</ul>
							</div>
						</div>
						<div class="col">
							<button type="button" class="btn btn-primary" id="btnRegistrar">Registar</button>
						</div>
						<div class="my-3 p-3 bg-body rounded shadow-sm">
							<table class="table table-sm table-hover" id="tablaTeacher">
								<thead>
									<tr>
										<th scope="col">N°</th>
										<th scope="col">N° Documento</th>
										<th scope="col">Nombres y Apellidos</th>
										<th scope="col">Cargo</th>
										<th scope="col">J. laboral</th>
										<th scope="col">Asistencia</th>
										<th scope="col">Tardanza</th>
										<th scope="col">Licencia</th>
										<th scope="col">Permiso</th>
										<th scope="col">Vacaciones</th>
										<th scope="col">Justificado</th>
									</tr>
								</thead>
								<tbody id="tablaTeacher">
								</tbody>
							</table>
						</div>
					</div>
				</div>


				<%@include file="component/allscript.jsp"%>
</body>
</html>