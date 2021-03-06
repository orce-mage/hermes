/* global angular */

(function(module) {
    'use strict';

    try {
        module = angular.module('hermes.ui.service');
    } catch (e) {
        module = angular.module('hermes.ui.service', []);
    }

    module.factory('FormSvc', function ($http, $alert, HermesApi) {
        // Public API here
        return {
            list: function() {
                return $http({
                    method: 'GET',
                    url: HermesApi.baseUrl + 'api/forms'
                });
            },
            get: function(name) {
                return $http({
                    method: 'GET',
                    url: HermesApi.baseUrl + 'api/forms/' + name
                });
            },
            query: function(params) {
                return $http({
                    method: 'POST',
                    url: HermesApi.baseUrl + 'api/forms/query',
                    data: params
                });
            },
            download: function(params) {
                return $http({
                    method: 'POST',
                    url: HermesApi.baseUrl + 'api/forms/download',
                    data: params
                });
            },
            save: function(form) {
                return $http({
                    method: 'POST',
                    url: HermesApi.baseUrl + 'api/forms',
                    data: form
                });
            },
            saveField: function(field) {
                return $http({
                    method: 'POST',
                    url: HermesApi.baseUrl + 'api/forms/fields',
                    data: field
                });
            },
            remove: function(params) {
                return $http({
                    method: 'DELETE',
                    url: HermesApi.baseUrl + 'api/forms',
                    params: params
                });
            },
            removeField: function(params) {
                return $http({
                    method: 'DELETE',
                    url: HermesApi.baseUrl + 'api/forms/fields',
                    params: params
                });
            },
            synchronize: function(scope) {
                scope.loading = true;
                var params = {};
                params['_form'] = 'update';
                this.query(params).success(function(data) {
                    scope.loading = false;
                    $alert({content: 'Sync success!', placement: 'top', type: 'success', show: true, duration: 5});
                }).error(function(data) {
                    scope.loading = false;
                    $alert({content: 'Sync failed!', placement: 'top', type: 'danger', show: true, duration: 5});
                });
            }
        };
    });
})();
