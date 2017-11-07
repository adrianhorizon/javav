angular.module('App', []).controller('CrudCtrl', ['$scope',
    function($scope) {
        $scope.Profiles = [
            {
                Nombre : "Adrian",
                Apellido : "Caminos",
                Estado : "Soltero",
                Fecha : "12-10-2017",
                Sueldo : "3000",
                Correo : "camilod4568@gmail.com",
                Departamento : "Distrito capital",
                Ciudad : "bogota",
                editable : false
            }
        ];

        $scope.entity = {}

        $scope.edit = function(index){
            $scope.entity = $scope.Profiles[index];
            $scope.entity.index = index;
            $scope.entity.editable = true;
        }

        $scope.delete = function(index){
            $scope.Profiles.splice(index,1);
        }

        $scope.save = function(index){
            $scope.Profiles[index].editable = false;

        }

        $scope.add = function(){
            $scope.Profiles.push({
                Nombre : "",
                Apellido : "",
                Estado : "",
                Fecha : "",
                Sueldo : "",
                Correo : "",
                Departamento : "",
                Ciudad : "",
                editable : true
            })
        }
    }
]);