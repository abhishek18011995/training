// const enum Directions {
//     Up=5,
//     Down=Up*5,
//     Left,
//     Right
// }
// let directions = [Directions.Up, Directions.Down, Directions.Left, Directions.Right];
// console.log(directions);
// let keys=Directions.Up;
// console.log(keys);
// enum Enum1 {
//     A = 1,
//     B = A * 2
// }
// let a1=Enum1.A;
// console.log(a1);
// const enum Enum2 {
//     A = 5,
//     B = A * 2
// }
// let a2=Enum2.A;
// console.log(a2);
// console.log(keys1);
var Enum;
(function (Enum) {
    Enum[Enum["D"] = 6] = "D";
})(Enum || (Enum = {}));
var a = Enum.D;
console.log(a);
var items = [1, 2, 3];
// Don't force these extra parameters
items.forEach(function (item, index, array) { return console.log(item); });
items.forEach(function (item) { return console.log(item); });
