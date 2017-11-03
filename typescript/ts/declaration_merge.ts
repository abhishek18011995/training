function f(sn: null|string  ): string {
    return   sn|| "aa";
}

let a=f(null);
console.log(a);

type Name = string;
type NameResolver = () => string;
let b:NameResolver= function aa(){

	return "4";
};

interface yahoo{

	c:Name;
}
// console.log(typeof NameResolver);