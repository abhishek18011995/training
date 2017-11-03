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
var Animal = (function () {
    function Animal(theName) {
        this.name = theName;
    }
    return Animal;
}());
var Rhino = (function (_super) {
    __extends(Rhino, _super);
    // name:string;
    function Rhino(name) {
        // super("Rhino"); 
        return _super.call(this, name) || this;
    }
    return Rhino;
}(Animal));
var rhino = new Rhino("rhino hhhhhh");
console.log(rhino);
