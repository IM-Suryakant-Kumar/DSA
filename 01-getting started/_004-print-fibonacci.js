function printFibonacci(n) {
	let a = 0, b = 1;
	for (let i = 1; i <= n; i++) {
		console.log(a);
		let c = a + b;
		a = b;
		b = c;
	}
}
// printFibonacci(5);
printFibonacci(6);