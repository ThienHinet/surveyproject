<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Tables</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            DataTables Advanced Tables
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>STT</th>
                                        <th>Họ Và Tên</th>
                                        <th>Email</th>
                                        <th>Số điện thoại</th>
                                        <th>Tiện ích</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <% int i=1; %>
                                    <c:forEach var="item" items="${listUser}">
                                    <tr class="odd gradeX">
                                        <td><%= i++ %></td>
                                        <td>${item.fullName}</td>
                                        <td>${item.email}</td>
                                        <td class="center">${item.numberphone}</td>
                                        <td class="center">XYZ</td>
                                    </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <!-- /.table-responsive -->
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
        </div>