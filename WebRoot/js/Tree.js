$(document).ready(function(){
	$('#tree1').tree({
	    url:"http://localhost:8080/NewsSystem/menutree",
	    lines:true,
	    onLoadSuccess : function(node, data) {
	    	
	    	if(data){
	    		$(data).each(function(index,value){
	    			if(this.state=='closed'){
	    				$("#tree1").tree('expandAll');
	    			}
	    		});
	    	}	    	
	  },
	  onClick : function(node){
		  if(node.attributes!=0){
			  if($('#tabs').tabs('exists',node.text)){
				  $('#tabs').tabs('select',node.text);
			  }
			  else{
				  $('#tabs').tabs('add',{
					  title:node.text,
					  closable:true,
				  });
			  }
		  }
		  
	  }
		
	});

});

