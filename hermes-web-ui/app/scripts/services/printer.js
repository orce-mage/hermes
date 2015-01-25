/* global angular */

(function(module) {
    'use strict';

    try {
        module = angular.module('hermes.ui.service');
    } catch (e) {
        module = angular.module('hermes.ui.service', []);
    }

    module.factory('PrinterSvc', function ($http) {
        // Public API here
        return {
            printers: function() {
                return $http({
                    method: 'GET',
                    url: 'api/printers'
                });
            },
            print: function(params) {
                return $http({
                    method: 'POST',
                    url: 'api/printers/print',
                    data: params
                });
            },
            printAll: function(params) {
                return $http({
                    method: 'POST',
                    url: 'api/printers/print/all',
                    data: params
                });
            },
            cancel: function() {
                return $http({
                    method: 'GET',
                    url: 'api/printers/print/cancel'
                });
            },
            status: function() {
                return $http({
                    method: 'GET',
                    url: 'api/printers/print/status'
                });
            }
        };
    });
})();
