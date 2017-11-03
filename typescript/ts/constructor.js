var Website = (function () {
    function Website(url, hits) {
        this.url = url;
        this.hits = hits;
    }
    Website.prototype.show = function () {
        return this;
    };
    return Website;
}());
var google = new Website("google.com", 100000);
// google.url="google.com";
// google.hits=12;
// console.log(google);
var obj1 = google.show();
console.log(obj1);
