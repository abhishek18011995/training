//optional function 
//function sideSqr(side:number,isInteger?:boolean){

// 	if(isInteger){

// 		return Math.floor(side*side);
// 	}

// 	return side*side;
// }

// console.log(sideSqr(7.6,true));

//arow function with detailed arguments
let myAdd: (baseValue:number, increment:number) => number =
    function(x: number, y: number): number { return x + y; };


//default parameter function
function buildName(firstName: string, lastName = "Smith") {
    return firstName + " " + lastName;
}

let result1 = buildName("Bob");                  // works correctly now, returns "Bob Smith"
let result2 = buildName("Bob", undefined);       // still works, also returns "Bob Smith"
let result3 = buildName("Bob", "Adams", "Sr.");  // error, too many parameters
let result4 = buildName("Bob", "Adams");         // ah, just right

console.log(result1+result2+result3+result4);

//rest parameter function
function buildName1(firstName: string, ...restOfName: string[]) {
    return firstName + " " + restOfName.join(" ");
}

let employeeName = buildName1("Joseph", "Samuel", "Lucas", "MacKinzie");

console.log(buildName1("Joseph", "Samuel", "Lucas", "MacKinzie"));