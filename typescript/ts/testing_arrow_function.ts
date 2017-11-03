console.log("hello")

interface Deck{

	suits:string[],
	// cards:number[],
	cardPicker(this:Deck):()=>Card;
}

interface Card{

	suit:string,
	card:number
}

let deck:Deck={

	suits:["spade","hearts","diamond","clubs"],
	cardPicker:function(this:Deck){

		return ()=>{

			let randomNumber:number=Math.floor(Math.random()*52);
			let randomCard:number=randomNumber%13;
			let randomSuit:number=Math.floor(randomNumber/13);
			console.log(randomNumber);
			console.log(randomSuit);
			return {suit:this.suits[randomSuit],card:randomCard};
		}
	}
}

let card:Card=deck.cardPicker()();
console.log(card);