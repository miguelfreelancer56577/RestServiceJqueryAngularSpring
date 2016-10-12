/// <reference path="../js/jquery-1.9.1.min.js" />
/// <reference path="../js/angular.min.js" />

$(function () {

    $.ajax("http://localhost:8080/eftapp/test/user", {
        type : "post",
        data : json.stringify({ "countrycode": "102", "apcompanyid": 23, "languagecode": "mxxx", "companyname": "sap" }),
        contenttype : "application/json",
        success : function() {
            // acciones a realizar cuando la petición ha terminado con éxito
            
        }
    });

});


var app = angular.module("App", []);

app.run(function ($http) {
    $http.post("http://localhost:8080/eftapp/test/user",
				{ "countryCode": "102", "apCompanyId": 23, "languageCode": "mxxx", "companyName": "sap" }
			);
});