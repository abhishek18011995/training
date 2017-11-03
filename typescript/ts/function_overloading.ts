let suits = ["hearts", "spades", "clubs", "diamonds"];

function pickCard(x:number):{suit:string,card:number}[];

function pickCard(x:{suit:string,card:number}[]):number;

function pickCard(x):any{

	if(typeof x=="object"){

		let randomCard:number=Math.floor(Math.random()*x.length);

		return randomCard;
	}

	if(typeof x == "number"){

		let randomCard:number=Math.floor(x/13);
		return {suit:suits[randomCard],card:x%13};

		// let randomCard:{suit:string,card:number}={suit:suits[randomSuit],card:randomCard}
	}
}


let myDeck=[{suit:"spade",card:5},{suit:"club",card:2}];
let aa=pickCard(myDeck);
console.log(myDeck[aa]);

let bb=pickCard(10);
console.log(bb);