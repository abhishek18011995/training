console.log("hello");
var deck = {
    suits: ["spade", "hearts", "diamond", "clubs"],
    cardPicker: function () {
        var _this = this;
        return function () {
            var randomNumber = Math.floor(Math.random() * 52);
            var randomCard = randomNumber % 13;
            var randomSuit = Math.floor(randomNumber / 13);
            console.log(randomNumber);
            console.log(randomSuit);
            return { suit: _this.suits[randomSuit], card: randomCard };
        };
    }
};
var card = deck.cardPicker()();
console.log(card);
