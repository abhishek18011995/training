class Animal {
    private name: string;
    constructor(theName: string) { this.name = theName; }
}

class Rhino extends Animal {
    // name:string;
    constructor(name:string) { 
    	// super("Rhino"); 
    	super(name);
    }
}

let rhino=new Rhino("rhino hhhhhh");
console.log(rhino);