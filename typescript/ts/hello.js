// alert("hello");
function greeter(person) {
    return "Hello, " + person;
}
var stringUser = "Abhi";
// console.log("stringUser");
document.getElementById("para1").innerHTML = greeter(stringUser);
var userName = {
    firstName: "Suraj",
    lastName: "Ghosh"
};
var details = {
    phoneNo: "1111111111"
};
function names(person) {
    return "Hello" + " " + person.firstName + " " + person.lastName;
}
function showDetails(person) {
    return "mobile" + " " + person.phoneNo;
}
document.getElementById("para2").innerHTML = names(userName);
document.getElementById("phone").innerHTML = showDetails(details);
