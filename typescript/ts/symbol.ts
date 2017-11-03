// let sym2 = Symbol("key");
// let sym3 = Symbol("key");
// sym2 === sym3; // false, symbols are unique

let sym = Symbol();

let obj = {
    [sym]: "value"
};

console.log(obj[sym]); // "value"


const getClassNameSymbol = Symbol();

class C {
    [getClassNameSymbol](){
       return "C";
    }
}

let c = new C();
let className = c[getClassNameSymbol]();
console.log(className);