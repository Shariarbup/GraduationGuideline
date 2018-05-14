<%--
  Created by IntelliJ IDEA.
  User: Al Shariar
  Date: 5/12/2018
  Time: 1:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>University Official Information</title>
</head>
<body>

<form action="/createUniversityprofile" method="get">



    <h1>Create University Profile</h1>
    University Full Name:
    <input type="text" name="full_name">
    <br>
    <br>
    University Short Name:
    <input type="text" name="short_name">
    <br>
    <br>
    University  Type:
    <select>
        <option name="type">Public</option>
        <option name="type">Private</option>
    </select>
    <br>
    <br>
    University  Category:
    <select>
        <option name="category">Agricultural</option>
        <option name="category">Engineering</option>
        <option name="category">General</option>
        <option name="category">Science & Technology</option>
        <option name="category">Textile</option>
    </select>
    <br>
    <br>
    University  Established Date:
    <input type="text" name="est_date">
    <br>
    <br>
    University  Location:
    <input type="text" name="location">
    <br>
    <br>
    University  Division:
    <select>
        <option name="division">Barishal</option>
        <option name="division">Chittagong</option>
        <option name="division">Dhaka</option>
        <option name="division">Khulna</option>
        <option name="division">Mymensingh</option>
        <option name="division">Rajshahi</option>
        <option name="division">Rangpur</option>
        <option name="division">Sylhet</option>
    </select>
    <br>
    <br>
    University  Motto:
    <input type="text" name="motto">
    <br>
    <br>
    University  Chancellor:
    <input type="text" name="chancellor" value="President Abdul Hamid">
    <br>
    <br>
    University  Vice Chancellor:
    <input type="text" name="vc">
    <br>
    <br>
    University  Campus Area:
    <input type="text" name="campus">
    <br>
    <br>
    University  Contact Information:
    <input type="text" name="contact">
    <br>
    <br>
    University Website:
    <input type="text" name="website">
    <br>
    <br>

    <input type="submit" value="INSERT" name="insert">
</form>

</body>
</html>
