// alert("hello");

function greeter(person:string) {
    return "Hello, " + person;
}
var stringUser = "Abhi";
// console.log("stringUser");
document.getElementById("para1").innerHTML = greeter(stringUser);

interface Person{

	firstName:string,
	lastName:string,
	// phoneNo:string
}

interface Persons{

	// firstName:string,
	// lastName:string,
	phoneNo:string
}

var userName={

	firstName:"Suraj",
	lastName:"Ghosh"
}

var details={

	phoneNo:"1111111111"
}

function names(person:Person){

	return "Hello" +" "+person.firstName+ " "+ person.lastName;
}

function showDetails(person:Persons){

	return "mobile" +" "+person.phoneNo;
}

document.getElementById("para2").innerHTML = names(userName);
document.getElementById("phone").innerHTML = showDetails(details);