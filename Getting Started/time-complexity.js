// Calculate the time complexities for each of the exercise code snippets.
// Exercises

// Q1.
function someFunction(n) {
	for (var i = 0; i < n * 1000; i++) {
		for (var j = 0; j < n * 20; j++) {
			console.log(i + j);
		}
	}
}
// O(n * 1000) * O(n * 20) => O(1000n) * O(20n) => O(2000n^2) => O(n^2)

// Q2.
function someFunction(n) {
	for (var i = 0; i < n; i++) {
		for (var j = 0; j < n; j++) {
			for (var k = 0; k < n; k++) {
				for (var l = 0; l < 10; l++) {
					console.log(i + j + k + l);
				}
			}
		}
	}
}
// n * n * n * 10 => O(10^3) => O(n^3)

// Q3.
function someFunction(n) {
	for (var i = 0; i < 1000; i++) {
		console.log("Hi");
	}
}
// O(1000) => O(1)

// Q4.
function someFunction(n) {
	for (var i = 0; i < n * 10; i++) {
		console.log(n);
	}
}
// 10n => O(10n) => O(n)

// Q5.
function someFunction(n) {
	for (var i = 1; i < n; i * 2) {
		console.log(n);
	}
}
// O(log2n)

// Q6.
function someFunction(n) {
	while (true) {
		console.log(n);
	}
}
// O(infinity)
