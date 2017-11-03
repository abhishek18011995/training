//optional function 
//function sideSqr(side:number,isInteger?:boolean){
// 	if(isInteger){
// 		return Math.floor(side*side);
// 	}
// 	return side*side;
// }
// console.log(sideSqr(7.6,true));
//arow function with detailed arguments
var myAdd = function (x, y) { return x + y; };
//default parameter function
function buildName(firstName, lastName) {
    if (lastName === void 0) { lastName = "Smith"; }
    return firstName + " " + lastName;
}
var result1 = buildName("Bob"); // works correctly now, returns "Bob Smith"
var result2 = buildName("Bob", undefined); // still works, also returns "Bob Smith"
var result3 = buildName("Bob", "Adams", "Sr."); // error, too many parameters
var result4 = buildName("Bob", "Adams"); // ah, just right
console.log(result1 + result2 + result3 + result4);
//rest parameter function
function buildName1(firstName) {
    var restOfName = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        restOfName[_i - 1] = arguments[_i];
    }
    return firstName + " " + restOfName.join(" ");
}
var employeeName = buildName1("Joseph", "Samuel", "Lucas", "MacKinzie");
console.log(buildName1("Joseph", "Samuel", "Lucas", "MacKinzie"));
