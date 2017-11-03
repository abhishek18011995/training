var suits = ["hearts", "spades", "clubs", "diamonds"];
function pickCard(x) {
    if (typeof x == "object") {
        var randomCard = Math.floor(Math.random() * x.length);
        return randomCard;
    }
    if (typeof x == "number") {
        var randomCard = Math.floor(x / 13);
        return { suit: suits[randomCard], card: x % 13 };
        // let randomCard:{suit:string,card:number}={suit:suits[randomSuit],card:randomCard}
    }
}
var myDeck = [{ suit: "spade", card: 5 }, { suit: "club", card: 2 }];
var aa = pickCard(myDeck);
console.log(myDeck[aa]);
var bb = pickCard(10);
console.log(bb);
