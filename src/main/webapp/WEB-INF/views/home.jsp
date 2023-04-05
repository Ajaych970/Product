<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
<%@ include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">Welcome To Product App</h1>

				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${product }" var="p">
						<tr>
							<td>2023_${p.id }</td>
							<td>${p.name }</td>
							<td>${p.desctiption }</td>
							<td>&#8377 ${p.price }</td>
							<td>  
								<a href="delete/${p.id }"><i class="fa-solid fa-trash text-danger" style="font-size: 20px "></i></a>
								<a href="update/${p.id }"><i class="fa-regular fa-pen-to-square text-primary" style="font-size: 20px"></i></a>
							</td>
						</tr>
					
					</c:forEach>
						
						
					</tbody>
				</table>
				
				<div class="container text-center">
				
				<a href="add-product" class="btn btn-outline-success">Add Product</a>
				
				</div>
				
				
			</div>

		</div>

	</div>
</body>
</html>