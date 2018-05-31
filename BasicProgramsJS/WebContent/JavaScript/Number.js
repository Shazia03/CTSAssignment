function myFunction(a, b) {
  /*var y=Number(document.getElementById("txt1").value);
   var z = Number(document.getElementById("txt2").value);*/
   return a+ b;
}//alert(myFunction(3,3))

function largest(a,b){
	/*var a=Number(document.getElementById("a").value);
	var b=Number(document.getElementById("b").value);*/
	 if(a>b)
		alert(a+" is larger");
	  
	  else
		  alert(b+" is larger");
	   
}//largest(4,5)

function EvenOrOdd(a){
	var a;
	if(a%2==0)
		alert(a+" is even");
	else
		alert(a+" is not even");
	}//EvenOrOdd(5)

function PrintNumber()
{
		var i;
	for(i=0;i<10;i++)
		console.log(i);
}//PrintNumber();

function PrintNumberReverse()
{
	var i;
	for(i=10;i>0;i--)
	console.log(i);
	
}//PrintNumberReverse()

function PrintNumEven()
{
	var i;
	for(i=2;i<10;i=i+2)
	console.log(i);
	
}//PrintNumEven()

function PrintRange(a,b)
{
	var a,b;
	for(i=a;i<b;i++)
		console.log(i);
}//PrintRange(10,40)

function Table(n)
{
	var i,n;
	for(i=1;i<10;i++)
		console.log(n+ "*"+ i+"="+i*n)
}//Table(2)

function isPrime(n){
	var n,i;
	for(i=2;i<n;i++) 
    {
        if(n%i==0)
            return false;
    }
    return true;
}isPrime(4)
	


