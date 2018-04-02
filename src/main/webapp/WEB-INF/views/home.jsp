<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en" ng-app="SiovisWebApp">

<c:import url="../views/jspf/resources.jsp" />

<body ng-controller="HomeController">
	<c:import url="../views/jspf/header.jsp" />

	<div class="container-fluid" >
		<div class="row">
		
			<c:import url="../views/jspf/navbar.jsp" />
			
			<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
			
			<div id="example" ng-app="KendoDemos">
			    <div>
			        <kendo-grid options="mainGridOptions">
			            <div k-detail-template>
			                <kendo-tabstrip>
			                <ul>
			                    <li class="k-state-active">Orders</li>
			                    <li>Contact information</li>
			                </ul>
			                <div>
			                    <div kendo-grid k-options="detailGridOptions(dataItem)"></div>
			                </div>
			                <div>
			                    <ul class="contact-info-form">
			                        <li><label>Country:</label> <input class="k-textbox" ng-model="dataItem.Country" /></li>
			                        <li><label>City:</label> <input class="k-textbox" ng-model="dataItem.City" /></li>
			                        <li><label>Address:</label> {{dataItem.Address}}</li>
			                        <li><label>Home phone:</label> {{dataItem.HomePhone}}</li>
			                    </ul>
			                </div>
			                </kendo-tabstrip>
			            </div>
			        </kendo-grid>
			
			
			    </div>
			</div>
			
			
			<style>
			  .contact-info-form {
			    list-style-type: none;
			    margin: 30px 0;
			    padding: 0;
			  }
			
			  .contact-info-form li {
			    margin: 10px 0;
			  }
			
			  .contact-info-form label {
			    display: inline-block;
			    width: 100px;
			    text-align: right;
			    font-weight: bold;
			  }
			</style>
			
			<script>
			    angular.module("SiovisWebApp", [ "kendo.directives" ])
			        .controller("HomeController", function($scope){
			        	
			        	$scope.navBarList = <c:out value="${navBarList}" escapeXml="false"/>;
// 			        	$scope.sessionData = {} ;
			        	
			            $scope.mainGridOptions = {
			                dataSource: {
			                    type: "odata",
			                    transport: {
			                        read: "https://demos.telerik.com/kendo-ui/service/Northwind.svc/Employees"
			                    },
			                    pageSize: 5,
			                    serverPaging: true,
			                    serverSorting: true
			                },
			                sortable: true,
			                pageable: true,
			                dataBound: function() {
			                    this.expandRow(this.tbody.find("tr.k-master-row").first());
			                },
			                columns: [{
			                    field: "FirstName",
			                    title: "First Name",
			                    width: "120px"
			                    },{
			                    field: "LastName",
			                    title: "Last Name",
			                    width: "120px"
			                    },{
			                    field: "Country",
			                    width: "120px"
			                    },{
			                    field: "City",
			                    width: "120px"
			                    },{
			                    field: "Title"
			                }]
			            };
			
			            $scope.detailGridOptions = function(dataItem) {
			                return {
			                    dataSource: {
			                        type: "odata",
			                        transport: {
			                            read: "https://demos.telerik.com/kendo-ui/service/Northwind.svc/Orders"
			                        },
			                        serverPaging: true,
			                        serverSorting: true,
			                        serverFiltering: true,
			                        pageSize: 5,
			                        filter: { field: "EmployeeID", operator: "eq", value: dataItem.EmployeeID }
			                    },
			                    scrollable: false,
			                    sortable: true,
			                    pageable: true,
			                    columns: [
			                    { field: "OrderID", title:"ID", width: "56px" },
			                    { field: "ShipCountry", title:"Ship Country", width: "110px" },
			                    { field: "ShipAddress", title:"Ship Address" },
			                    { field: "ShipName", title: "Ship Name", width: "190px" }
			                    ]
			                };
			            };
			        })
			</script>
			
			</main>


		</div>
	</div>


	
	
	
	
	
</body>


</html>