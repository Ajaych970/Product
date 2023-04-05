<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="./base.jsp"%>

</head>
<body>

	<h2 class="text-center heading">Update Product</h2>
	<form action="${pageContext.request.contextPath }/handle_update" method="get">
		<div class="container-fluid">
		<div class="row">
		 
			<div class="col-md-6 offset-md-3">
			<label>Product ID</label></br>
			
			 <input type="text" value="${product.id }" name="id" /></br>
				<label for="exampleFormControlInput1" class="form-label">Product Name</label> 
					<input 
					type="text" 
					class="form-control"
					name="name"
					id="exampleFormControlInput1" 
					placeholder="Enter Product name"
					value="${product.name }">
			</div>
			<div class="col-md-6 offset-md-3">
				<label for="exampleFormControlTextarea1" class="form-label">Description</label>
				<textarea 
				class="form-control" 
				id="exampleFormControlTextarea1"
				name="desctiption"
				placeholder="Enter Product Description here..."
				rows="3">${product.desctiption }
				</textarea>
			</div>
			<div class="col-md-6 offset-md-3">
				<label for="exampleFormControlInput1" class="form-label">Price</label> 
					<input 
					type="number" 
					class="form-control"
					id="price" 
					name="price"
					placeholder="product price"
					value="${product.price }">
			</div>
			
			<div class="container text-center">
				<a  href="${pageContext.request.contextPath }/"
				class="btn btn-outline-danger">Back</a>
				<button type="submit" class="btn btn-primary">Update</button>
				
			</div>
		</div>
	</div>
	
	</form>
</body>
</html>