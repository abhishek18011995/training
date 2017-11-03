var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
function identity(arg) {
    return arg;
}
var myIdentity = identity;
// let myIdentity= identity();
console.log(typeof myIdentity);
var GenericNumber = (function () {
    function GenericNumber() {
    }
    return GenericNumber;
}());
var myGenericNumber = new GenericNumber();
myGenericNumber.zeroValue = 1;
myGenericNumber.add = function (x, y) {
    return x + y;
};
var add1 = myGenericNumber.add(1, 2);
console.log(myGenericNumber.zeroValue);
console.log(typeof add1);
function loggingIdentity(arg) {
    console.log(arg.length); // Now we know it has a .length property, so no more error
    return arg;
}
var log1 = loggingIdentity({ length: 10, value1: 11, value2: 12 });
console.log("log1" + " " + log1.value1);
var BeeKeeper = (function () {
    function BeeKeeper() {
    }
    return BeeKeeper;
}());
var ZooKeeper = (function () {
    function ZooKeeper() {
    }
    return ZooKeeper;
}());
var Animal = (function () {
    function Animal() {
    }
    return Animal;
}());
var Bee = (function (_super) {
    __extends(Bee, _super);
    function Bee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Bee;
}(Animal));
var Lion = (function (_super) {
    __extends(Lion, _super);
    function Lion() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Lion;
}(Animal));
function createInstance(c) {
    return new c();
}
var c1 = createInstance(Lion).keeper.nametag = "abhi"; // typechecks!
var c2 = createInstance(Bee).keeper; // typechecks!
console.log(c1 + " " + c2);
