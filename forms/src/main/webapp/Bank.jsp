<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bank login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style>

        h1 {
            color: #dc3545; /* Bootstrap's red color */
            margin-top:100px;
            text-align: center;
            }
</style>
</head>
<body>
<h1>Bank Form</h1>
<form class="form-horizontal" action="bank" method="post">
    <div class="form-group">
        <label class="control-label col-sm-2" for="first-name">User Name:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="first-name" placeholder="Enter user name" name="userName">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="last-name">Phone No:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="last-name" placeholder="Enter phone no" name="number">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="last-name">OTP:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="last-nam" placeholder="Enter otp" name="otp">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </div>
</form>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>