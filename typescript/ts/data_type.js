var fullName = "Bob Bobbington";
var age = 37;
var sentence = "Hello, my name is " + fullName + ".\n\nI'll be " + (age + 1) + " years old next month.";
var array1 = [1, 2];
var array2 = [3, 4];
var array3 = [1, 'aa'];
console.log(array3);
var Color;
(function (Color) {
    Color[Color["Red"] = 1] = "Red";
    Color[Color["Green"] = 2] = "Green";
    Color[Color["Blue"] = 4] = "Blue";
})(Color || (Color = {}));
var c = Color.Blue;
var colorName = Color[3];
console.log(c);
console.log(colorName);
var notSure = 4;
// notSure.ifItExists(); // okay, ifItExists might exist at runtime
console.log(notSure.toFixed()); // okay, toFixed exists (but the compiler doesn't check)
var _loop_1 = function (i) {
    setTimeout(function () { console.log(i); }, 100 * i);
};
// function warnUser(): void {
//     alert("This is my warning message");
// }
// warnUser();
for (var i = 0; i < 10; i++) {
    _loop_1(i);
}
// for (var i = 0; i < 10; i++) {
//     (function(y) {
//         setTimeout(function() { console.log(y); }, 100 * y);
//     })(i);
// }
// let prettySure: Object = 4;
// prettySure.toFixed(); // Error: Property 'toFixed' doesn't exist on type 'Object' 
