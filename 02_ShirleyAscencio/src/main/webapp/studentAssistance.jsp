<!doctype html>
<html lang="en">
<head>
<%@include file="component/allcss.jsp"%>
<link rel="stylesheet" href="css/student.css">
</head>
<body>

	<jsp:include page="component/header.jsp"></jsp:include>
	<jsp:include page="component/navbar.jsp"></jsp:include>
	<div class="container">

		<div class="my-1 p-3 bg-body rounded shadow-sm">
				<h5 class="border-bottom pb-2 mb-0">
					Asistencia <span class="float-end" id="horaActual"></span>
				</h5>
				<div class="row mt-3">
				<div class="input-group mb-3">
						<span class="input-group-text" id="btnBuscar"><i
							class='bx bx-search-alt-2'></i></span> <input type="search"
							class="form-control" placeholder="Buscar..." id="inputBuscar">
					</div>
				<div class="col">
					<div class="dropdown">
						<span id="horaActual"></span>
					</div>
				</div>
				<div class="col">
					<div class="dropdown">
						<button class="btn btn-secondary dropdown-toggle" type="button"
							id="grado" data-bs-toggle="dropdown" aria-expanded="false">Grado</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton2">
							<li><a class="dropdown-item" href="#" id="primero">1°</a></li>
							<li><a class="dropdown-item" href="#" id="segundo">2°</a></li>
							<li><a class="dropdown-item" href="#" id="tercero">3°</a></li>
							<li><a class="dropdown-item" href="#" id="cuarto">4°</a></li>
							<li><a class="dropdown-item" href="#" id="quinto">5°</a></li>
						</ul>
					</div>
				</div>
				<br>
				<div class="col">
					<div class="dropdown">
						<button class="btn btn-secondary dropdown-toggle" type="button"
							id="seccion" data-bs-toggle="dropdown" aria-expanded="false">Seccion</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton3">
							<li><a class="dropdown-item" href="#" id="seccionA">A</a></li>
							<li><a class="dropdown-item" href="#" id="seccionB">B</a></li>
							<li><a class="dropdown-item" href="#" id="seccionC">C</a></li>
						</ul>
					</div>
				</div>
				<div class="col">
					<div class="dropdown">
						<button class="btn btn-secondary dropdown-toggle" type="button"
							id="materia" data-bs-toggle="dropdown" aria-expanded="false">Materia</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton3">
							<li><a class="dropdown-item" href="#" id="materiaM">Matematicas</a></li>
							<li><a class="dropdown-item" href="#" id="materiaE">Educacion
									Fisica</a></li>
							<li><a class="dropdown-item" href="#" id="materiaC">Comunicacion</a></li>
							<li><a class="dropdown-item" href="#" id="materiaI">Ingles</a></li>
							<li><a class="dropdown-item" href="#" id="materiaA">Arte</a></li>
							<li><a class="dropdown-item" href="#" id="materiaDP">DPCC</a></li>
							<li><a class="dropdown-item" href="#" id="materiaF">Fisica</a></li>
							<li><a class="dropdown-item" href="#" id="materiaCS">Ciencias
									Sociales</a></li>
							<li><a class="dropdown-item" href="#" id="materiaEPT">EPT</a></li>
							<li><a class="dropdown-item" href="#" id="materiaER">Educacion
									Religiosa</a></li>
							<li><a class="dropdown-item" href="#" id="materiaCT">Ciencia
									y Tecnologia</a></li>
							<li><a class="dropdown-item" href="#" id="materiaT">Tutoria</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="my-1 p-3 bg-body rounded shadow-sm" id="">
				<h5 class="border-bottom pb-2 mb-0 text-center">
					Asistencia Aula <span class="float-end" id="horaActual"></span>
				</h5>
				<div class="row">
					<div class="col">
						<p>
							Grado: <span id="gradoSeleccionado"></span>
						</p>
					</div>
					<div class="col">
						<p>
							Sección: <span id="seccionSeleccionada"></span>
						</p>
					</div>
					<div class="col">
						<p>
							Materia: <span id="materiaSeleccionada"></span>
						</p>
					</div>
					<div class="col">
						<p>
							Turno: <span id="turnoActual"></span>
						</p>
					</div>
				</div>
			</div>
		</div>
		<div class="my-3 p-3 bg-body rounded shadow-sm">
			<table class="table table-sm table-hover" id="tablaAsistencia">
				<thead>
					<tr>
						<th scope="col" class="text-center">N°</th>
						<th scope="col" class="text-center">APELLIDOS Y NOMBRES</th>
						<th scope="col">MATERIA</th>
						<th scope="col">ESTADO</th>
					</tr>
				</thead>
				<tbody id="detalleTabla">
				</tbody>
			</table>
		</div>

	</div>
	<%@include file="component/allscript.jsp"%>

	<!-- 	Script para gestionar las funciones de esta vista -->
	<script type="text/javascript"
		src="js/studentAssistanceValidaciones.js"></script>
	<script type="text/javascript" src="js/studentAssistance.js"></script>
</body>
</html>
