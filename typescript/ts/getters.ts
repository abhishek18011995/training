class Rectangle {
	
	length:number;
	breadth:number;

	constructor(length:number,breadth:number) {

		this.length=length;
		this.breadth=breadth;
	}

	get area(){

		return this.length*this.breadth;
	}
}

let rec1=new Rectangle(100,20);
let area=rec1.area;
console.log(area);