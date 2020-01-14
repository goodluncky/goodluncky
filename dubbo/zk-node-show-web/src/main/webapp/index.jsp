<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/4
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <script type="text/javascript">
        var url_prefix="${pageContext.request.contextPath}";
        function buy(userId,goodName,price,amount) {
            window.location.href=url_prefix + "/buy/goods?userId="+userId
            +"&name="+goodName
            +"&price="+price
            +"&amount="+amount;
        }
        function getAddress(userId) {
            window.location.href=url_prefix + "/buy/getaddress?userId="+userId;
        }
    </script>
</head>
<body>
<div style="margin-left: 400px">
    <p>商品列表</p>
    <table border="1" cellpadding="1" width="60%">
        <tr>
            <td>商品名称</td>
            <td>单价</td>
            <td>库存</td>
            <td>操作</td>
        </tr>
        <tr>
            <td>thinkpad</td>
            <td>6000</td>
            <td>30</td>
            <td><a href="javascript:void(0)" onclick="buy(1,'thinkpad',6000,1)">购买</a> </td>
        </tr>
        <tr>
            <td>huawei</td>
            <td>1000</td>
            <td>10</td>
            <td>购买</td>
        </tr>
    </table>
    <div style="margin-left: 400px"><a href="javascript:void(0)" onclick="getAddress(1)">我的收件人地址</a></div>
</div>
</body>
</html>
