<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="kendo" uri="http://www.kendoui.com/jsp/tags"%>
<%@taglib prefix="demo" tagdir="/WEB-INF/tags"%>
<demo:header />
    <div class="demo-section k-content">
        <div class="k-rtl">
            <h4>Choose date:</h4>
	        <kendo:dateTimePicker name="datetimepicker" style="width: 100%;"></kendo:dateTimePicker>
	    </div>
    </div>
<demo:footer />