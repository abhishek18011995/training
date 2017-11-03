function identity<T>(arg: T): T {
    return arg;
}

let myIdentity: <T>(arg: T) => T = identity;
// let myIdentity= identity();
console.log(typeof myIdentity);

class GenericNumber<T> {
    zeroValue: T;
    add: (x: T, y: T) => T;
}
let myGenericNumber = new GenericNumber<number>();
myGenericNumber.zeroValue=1;
myGenericNumber.add= function(x,y){

	return x+y;
}
let add1=myGenericNumber.add(1,2);
console.log(myGenericNumber.zeroValue);
console.log(typeof add1);



interface Lengthwise {
    length: number;
}

function loggingIdentity<T extends Lengthwise>(arg: T): T {
    console.log(arg.length);  // Now we know it has a .length property, so no more error
    return arg;
}

let log1=loggingIdentity({length:10,value1:11,value2:12});
console.log("log1"+" "+log1.value1);


class BeeKeeper {
    hasMask: boolean;
}

class ZooKeeper {
    nametag: string;
}

class Animal {
    numLegs: number;
}

class Bee extends Animal {
    keeper: BeeKeeper;
}

class Lion extends Animal {
    keeper: ZooKeeper;
}

function createInstance<A extends Animal>(c: new () => A): A {
    return new c();
}

let c1=createInstance(Lion).keeper.nametag="abhi";  // typechecks!
let c2=createInstance(Bee).keeper;   // typechecks!
console.log(c1+ " "+c2);