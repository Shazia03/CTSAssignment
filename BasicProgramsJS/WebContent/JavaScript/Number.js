function myFunction() {
  var y=Number(document.getElementById("txt1").value);
   var z = Number(document.getElementById("txt2").value);
  var x = y + z;
  alert(x);
}
function largest(){
	var a=Number(document.getElementById("a").value);
	var b=Number(document.getElementById("b").value);
	 if(a>b)
		alert(a+" is larger");
	  
	  else
		  alert(b+" is larger");
	   
}
function EvenOrOdd(){
	var a=Number(document.getElementById("a").value);
	if(a%2==0)
		alert(a+" is even");
	else
		alert(a+" is not even");
	}