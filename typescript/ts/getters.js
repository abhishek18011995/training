var Rectangle = (function () {
    function Rectangle(length, breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    Object.defineProperty(Rectangle.prototype, "area", {
        get: function () {
            return this.length * this.breadth;
        },
        enumerable: true,
        configurable: true
    });
    return Rectangle;
}());
var rec1 = new Rectangle(100, 20);
var area = rec1.area;
console.log(area);
