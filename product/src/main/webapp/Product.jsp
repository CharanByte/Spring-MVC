<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product Form</title>
    <!-- Bootstrap CSS CDN -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-container h2 {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="form-container">
                    <h2>Product Form</h2>
                    <form action="product" method="post">
                        <div class="form-group">
                            <label for="name">Name</label>
                            <input type="text" class="form-control" id="name" name="name" placeholder="Enter product name" value="${dto.name}">
                        </div>
                        <div class="form-group">
                            <label for="type">Type</label>
                            <select class="form-control" id="type" name="type" value="${dto.type}">
                                <option value="">Select type</option>
                                <option value="Electronics">Electronics</option>
                                <option value="Furniture">Furniture</option>
                                <option value="Appliances">Appliances</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="cost">Cost</label>
                            <input type="text" class="form-control" id="cost" name="cost" placeholder="Enter product cost" value="${dto.cost}">
                        </div>
                        <div class="form-group">
                            <label for="manf">Manufacturer</label>
                            <select class="form-control" id="manf" name="manf" value="${dto.manf}">
                                <option value="">Select manufacturer</option>
                                <option value="Kiratech Innovations Pvt Ltd">Kiratech Innovations Pvt Ltd</option>
                                <option value="Vill-Raipur">Vill-Raipur</option>
                                <option value="Innovations">Innovations</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="date">Manufacturing Date</label>
                            <input type="text" class="form-control" id="date" name="date" placeholder="dd-mm-yyyy" value="${dto.date}">
                        </div>
                        <div class="form-group">
                            <label for="warranty">Warranty (months)</label>
                            <input type="number" class="form-control" id="warranty" name="warranty" placeholder="Enter warranty period" value="${dto.warranty}">
                        </div>
                        <button type="submit" class="btn btn-primary">Save</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- Bootstrap JS and dependencies (optional but recommended) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@
