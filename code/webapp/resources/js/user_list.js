$(function(){
	$('#btnStuAdd').on('click',btnStuAdd_Click);
});

function btnStuAdd_Click(e){
	e.preventDefault();
	location = web.root+'/Student/Insert';
};