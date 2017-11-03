let fullName: string = `Bob Bobbington`;
let age: number = 37;
let sentence: string = `Hello, my name is ${ fullName }.

I'll be ${ age + 1 } years old next month.`;

let array1:number[]=[1,2];
let array2:Array<number>=[3,4];
let array3:[number,string]=[1,'aa'];
console.log(array3);

enum Color{Red=1,Green=2,Blue=4}
let c:Color=Color.Blue;
let colorName:string=Color[3];
console.log(c);
console.log(colorName);

let notSure: any = 4;
// notSure.ifItExists(); // okay, ifItExists might exist at runtime
console.log(notSure.toFixed());// okay, toFixed exists (but the compiler doesn't check)

// function warnUser(): void {
//     alert("This is my warning message");
// }

// warnUser();

for (let i = 0; i < 10; i++) {
    setTimeout(function() { console.log(i); }, 100 * i);
}

// for (var i = 0; i < 10; i++) {
  
//     (function(y) {
//         setTimeout(function() { console.log(y); }, 100 * y);
//     })(i);
// }

// let prettySure: Object = 4;
// prettySure.toFixed(); // Error: Property 'toFixed' doesn't exist on type 'Object'