// interface LabelledValue {
//     label: string;
//     size:number;
// }

// function printLabel(labelledObj: LabelledValue) {
//     console.log(labelledObj.label);
// }

// let myObj = {size: 10, label: "Size 11 Object"};
// printLabel(myObj);


//array interface
// interface StringArray {
//     [index: number]: string;
// }

// let myArray: StringArray;
// myArray = ["aa","bb"];

// let myStr: string = myArray[0];
// console.log(myArray);



// class Animal {
//     name: string;
// }
// class Dog extends Animal {
//     breed: string;
// }

// // Error: indexing with a 'string' will sometimes get you a Dog!
// interface NotOkay {
//     [x: number]: Animal;
//     [x: string]: Dog;
// }


// Class Types
// Implementing an interface
// interface ClockInterface {
//     currentTime: string;
//     setTime(d: string);
// }

// class Clock implements ClockInterface {
//     currentTime: string;
//     setTime(d: string) {

//     	alert("aa");
//     	return 1;
//         // this.currentTime = d;
//         // console.log(this);
//         // console.log(this.currentTime);
//     }

//     constructor() {

//     	this.setTime("aa");
//      }
// }

// extending interface
interface Shape {
    color: string;
}

interface Square extends Shape {
    sideLength: number;
}

// let square = <Square>{};
let square=<Square>{};
console.log(square);
square.color = "blue";
square.sideLength = 10;
console.log(square.color+" "+square.sideLength);