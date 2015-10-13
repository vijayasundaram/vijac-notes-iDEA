var notesApp = angular.module('notesApp', ['ngRoute','summernote','ngSanitize','angularMoment','angularUtils.directives.dirPagination']).filter('trusthtml', ['$sce', function ($sce) {
    return function(t) {
        return $sce.trustAsHtml(t)
    }
}]);
	
    // configure our routes
    notesApp.config(function($routeProvider) {
        $routeProvider

            
            .when('/', {
                templateUrl : '/resources/partials/listNotes.html',
                controller  : 'listNotesController'
                
            })

            
            .when('/addNote/', {
                templateUrl : '/resources/partials/addNote.html',
                controller  : 'addNoteController',
                
            })

            
            .when('/editNote/:key', {
                templateUrl : '/resources/partials/editNote.html',
                controller  : 'editNoteController'
            })
        
	        .when('/accountSettings', {
	            templateUrl : '/resources/partials/account.html',
	            controller  : 'accountSettingsController'
	        })
	        
	        .when('/help', {
	            templateUrl : '/resources/partials/help.html',
	            controller  : 'helpController'
	        })
    });


    notesApp.controller('listNotesController', function($scope,$http) {
        var over = '<div id="overlay"><i id="loading" class="fa fa-cog fa-spin fa-4x"></i></div>';$(over).appendTo('body');//Append Loading Animation
        $http.get('/note/').success(function(data) {
            $scope.notes = data;
            $scope.noOfNotes = data.length;
            $('#overlay').remove();
    	});
    });

    notesApp.controller('addNoteController', function($scope,$http) {

    	$scope.noteData    = {};
    	$scope.addNote = function(){
            var over = '<div id="overlay"><i id="loading" class="fa fa-cog fa-spin fa-4x"></i></div>';$(over).appendTo('body');//Append Loading Animation
    		$http({
    	        url: '/note/',
    	        method: "POST",
    	        headers: {'Content-Type': 'application/x-www-form-urlencoded'},
    	        data    : $.param($scope.noteData),
    	    })
    	    .then(function(data) {
                    $('#overlay').remove();
                    console.log(data);
                    window.location.href = "#/";
    	    }, 
    	    function(response) { // optional
    	            // failed
    	    });
    	}
    });

    notesApp.controller('editNoteController', function($scope,$routeParams,$http,$location) {
    	$scope.key = $routeParams.key;
        var over = '<div id="overlay"><i id="loading" class="fa fa-cog fa-spin fa-4x"></i></div>';$(over).appendTo('body');//Append Loading Animation
        //Get note values to populate the form
        $http.get('/note/'+$scope.key+'/').success(function(data) {
            $scope.noteData = data;
            $('#overlay').remove();
       	});
    	//Put note values to update the note Object
    	$scope.editNote = function(){
            var over = '<div id="overlay"><i id="loading" class="fa fa-cog fa-spin fa-4x"></i></div>';$(over).appendTo('body');//Append Loading Animation
    		$http({
    	        url: '/note/'+$scope.key+'/',
    	        method: "PUT",
    	        headers: {'Content-Type': 'application/x-www-form-urlencoded'},
    	        data    : $.param($scope.noteData),
    	    })
    	    .then(function(data) {
    	    	 console.log(data);
                 $('#overlay').remove();
    	    	 window.location.href = "#/";
    	    }, 
    	    function(response) { // optional
    	            // failed
    	    });
    	}
    	//Delete note
    	$scope.deleteNote = function(){
    		var canDelete = confirm("You sure you want to delete "+$scope.noteData.title+"?");
    		if(canDelete)
    		{
                var over = '<div id="overlay"><i id="loading" class="fa fa-cog fa-spin fa-4x"></i></div>';$(over).appendTo('body');//Append Loading Animation
    			$http({
    		
    	        url: '/note/'+$scope.key+'/',
    	        method: "DELETE",
    	        headers: {'Content-Type': 'application/x-www-form-urlencoded'},
	    	    })
	    	    .then(function(data) {
	    	    	 console.log(data);
                     $('#overlay').remove();
	    	    	 window.location.href = "#/";
	    	    }, 
	    	    function(response) { // optional
	    	            // failed
	    	    });
	    		}
    		}
    	});
    
    	//Account Settings Controller
	    notesApp.controller('accountSettingsController', function($scope,$http) {
	    	console.warn("in account settings controller");
	   		 
	    });
	    
	    //Help Controller
	    notesApp.controller('helpController', function($scope,$http) {
	    	console.warn("in  helpcontroller");
	   		 
	    });
	    
	    //To set active tab in nav bar
	    notesApp.controller('navController',function($scope, $location){ 
	        $scope.isActive = function (viewLocation) { 
	            return viewLocation === $location.path();
	        };
	    });
    