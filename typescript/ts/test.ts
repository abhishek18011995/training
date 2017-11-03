let decimal: number = 6;
let age= 62;
let list: Array<number> = [1, 2, 3];
enum Color {Red, Green, Blue}
let c: Color = Color.Green;
console.log(c);
// let sentence: string = "Hello, my name is " + decimal + ".\n\n" +
//     "I'll be " + (age + 1) + " years old next month.";


interface SquareConfig {
    color?: string;
    width?: number;
}

function createSquare(config: SquareConfig): { color: string; area: number } {
    let newSquare = {color: "white", area: 100};
    if (config.color) {
        // Error: Property 'clor' does not exist on type 'SquareConfig'
        newSquare.color = config.color;
    }
    if (config.width) {
        newSquare.area = config.width * config.width;
    }
    return newSquare;
}

let mySquare = createSquare({color: "black"});
console.log(mySquare);