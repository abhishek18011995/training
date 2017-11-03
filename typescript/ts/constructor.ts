class Website {
	
	url:string;
	hits:number;

	constructor(url:string,hits:number) {
		
		this.url=url;
		this.hits=hits;
	}

	show(){

		return this;
	}


}

let google=new Website("google.com",100000);
// google.url="google.com";
// google.hits=12;
// console.log(google);

let obj1=google.show(); 
console.log(obj1);